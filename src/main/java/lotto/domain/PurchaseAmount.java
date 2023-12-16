package lotto.domain;

import lotto.common.Rule;

public class PurchaseAmount {
    private final long amount;

    private PurchaseAmount(long amount) {
        this.amount = amount;
    }

    public static PurchaseAmount valueOf(long amount) {
        return new PurchaseAmount(amount);
    }

    public static PurchaseAmount valueOf(String amount) {
        try {
            return valueOf(Long.parseLong(amount));
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("[ERROR] 유효하지 숫자입력입니다.");
        }
    }

    public long getQuantity() {
        return this.amount / Rule.PRICE.getValue();
    }
}
