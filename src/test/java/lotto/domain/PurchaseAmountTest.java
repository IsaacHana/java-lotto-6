package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PurchaseAmountTest {
    @Test
    void create() {
        PurchaseAmount purchaseAmount = new PurchaseAmount("123");
    }

    @DisplayName("숫자 형식이 아닐 경우 예외 발생")
    @Test
    void createByInvalidNumber() {
        new PurchaseAmount("1T23@");
        assertThatThrownBy(() -> new PurchaseAmount("1T23@")).isInstanceOf(IllegalArgumentException.class);
    }
}