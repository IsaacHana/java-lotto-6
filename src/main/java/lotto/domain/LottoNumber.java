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

    public LottoNumber of(int number) {
        return lottoNumberCache.get(number);
    }
}
