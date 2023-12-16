package lotto.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }

    public static String inputWinningNumber() {
        return Console.readLine();
    }

    public static String inputBonusNumber() {
        return Console.readLine();
    }
}
