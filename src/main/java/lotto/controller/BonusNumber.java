package lotto.controller;

import lotto.domain.LottoNumber;

public class BonusNumber {
    private LottoNumber bonusNumber;

    public BonusNumber(String bonusNumber) {
        this.bonusNumber = LottoNumber.of(bonusNumber);
    }
}
