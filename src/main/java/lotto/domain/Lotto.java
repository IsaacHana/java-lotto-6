package lotto.domain;

import lotto.common.Rule;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != Rule.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR 로또는 6자리의 번호여야 합니다.]");
        }

        if (numbers.stream().distinct().count() != Rule.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR 로또는 중복되지 않은 6자리의 번호여야 합니다.]");
        }
    }

    // TODO: 추가 기능 구현
}
