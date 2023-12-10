package lotto.domain;

import lotto.common.Rule;

import java.util.Arrays;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    private Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers.stream().sorted().toList();
    }

    public static Lotto valueOf(List<Integer> numbers) {
        return new Lotto(numbers);
    }

    public static Lotto valueOf(String numbers) {
        try {
            return valueOf(Arrays.stream(numbers.split(",")).map(Integer::parseInt).toList());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("[ERROR] 유효하지않은 숫자입니다.");
        }
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != Rule.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR] 로또는 중복되지 않은 6자리의 번호여야 합니다.");
        }

        if (numbers.stream().distinct().count() != Rule.MAX_SIZE.getValue()) {
            throw new IllegalArgumentException("[ERROR] 로또는 중복되지 않은 6자리의 번호여야 합니다.");
        }
    }

    @Override
    public String toString() {
        return this.numbers.toString();
    }

    // TODO: 추가 기능 구현
}
