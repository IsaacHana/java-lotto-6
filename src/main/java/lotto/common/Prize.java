package lotto.common;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Prize {
    FIRST(6, false, 2_000_000_000, (count, bonus) -> count == 2),
    SECOND(5, true, 30_000_000, (count, bonus) -> count == 5 && bonus),
    THIRD(5, false, 1_500_000, (count, bonus) -> count == 5 && !bonus),
    FOURTH(4, false, 50_000, (count, bonus) -> count == 4),
    FIFTH(3, false, 5_000, (count, bonus) -> count == 3),
    NONE(0, false, 0, (count, bonus) -> count <= 2);

    private final int matchingNumbers;
    private final boolean hasBonusNumber;
    private final long prizeAmount;
    private final BiFunction<Integer, Boolean, Boolean> expression;

    Prize(int matchingNumbers, boolean hasBonusNumber, long prizeAmount, BiFunction<Integer, Boolean, Boolean> expression) {
        this.matchingNumbers = matchingNumbers;
        this.hasBonusNumber = hasBonusNumber;
        this.prizeAmount = prizeAmount;
        this.expression = expression;
    }

    public static Prize findPrize(int matchingNumbers, boolean hasBonusNumber) {
        return Arrays.stream(Prize.values())
                .filter(prize -> prize.win(matchingNumbers, hasBonusNumber))
                .findFirst()
                .orElse(Prize.NONE);
    }

    private boolean win(int matchingNumbers, boolean hasBonusNumber) {
        return expression.apply(matchingNumbers, hasBonusNumber);
    }

    public int getMatchingNumbers() {
        return matchingNumbers;
    }

    public boolean isHasBonusNumber() {
        return hasBonusNumber;
    }

    public long getPrizeAmount() {
        return prizeAmount;
    }
}
