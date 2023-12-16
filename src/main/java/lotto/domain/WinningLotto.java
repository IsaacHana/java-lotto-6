package lotto.domain;

import lotto.controller.BonusNumber;

public class WinningLotto {
    WinningNumber winningNumber;
    BonusNumber bonusNumber;

    public WinningLotto(WinningNumber winningNumber, BonusNumber bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }
}
