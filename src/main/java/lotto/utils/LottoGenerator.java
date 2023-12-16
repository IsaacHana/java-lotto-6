package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.common.Rule;
import lotto.domain.Lotto;
import lotto.domain.LottoTickets;

import java.util.List;
import java.util.stream.LongStream;

public class LottoGenerator {
    public LottoTickets generate(long quantity) {
        return LottoTickets.valueOf(
                LongStream.range(0, quantity)
                        .mapToObj(value -> generateLotto())
                        .toList()
        );
    }

    public Lotto generateLotto() {
        return Lotto.valueOf(Randoms.pickUniqueNumbersInRange(Rule.MIN_NUMBER.getValue(), Rule.MAX_NUMBER.getValue(), Rule.MAX_SIZE.getValue()));
    }
}
