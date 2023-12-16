package lotto.domain;


public class WinningNumber {
    private final Lotto lotto;

    public WinningNumber(String lotto) {
        this.lotto = Lotto.valueOf(lotto);
    }
}
