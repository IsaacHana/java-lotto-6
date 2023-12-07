package lotto.domain;

import lotto.common.Rule;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LottoNumber {
    private static Map<Integer, LottoNumber> lottoNumberCache = new HashMap<>();

    static {
        IntStream.range(Rule.MIN_NUMBER.getValue(), Rule.MAX_NUMBER.getValue() + 1).forEach(value -> lottoNumberCache.put(value, new LottoNumber(value)));
    }

    private int number;

    private LottoNumber(int number) {
        this.number = number;
    }

    public static LottoNumber of(int number) {
        validate(number);
        return lottoNumberCache.get(number);
    }

    private static void validate(int number) {
        if(number < 1 || number > 45) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1~45 숫자여야 합니다.");
        }
    }
}
