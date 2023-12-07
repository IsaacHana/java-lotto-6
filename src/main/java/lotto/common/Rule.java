package lotto.common;

public enum Rule {
    MIN_NUMBER(1),
    MAX_NUMBER(45),
    MAX_SIZE(6),
    PRICE(1000);

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
