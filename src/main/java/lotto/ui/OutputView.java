package lotto.ui;

import lotto.domain.Lotto;
import lotto.domain.LottoTickets;
import lotto.domain.PurchaseAmount;

public class OutputView {
    public static void printNumberOfPurchasedLottoTickets(PurchaseAmount purchaseAmount) {
        System.out.printf("%n%d개를 구매했습니다.%n", purchaseAmount.getQuantity());
    }

    public static void printLottoTickets(LottoTickets userLottoTickets) {
        for(Lotto lotto : userLottoTickets.getTickets()) {
            System.out.println(lotto.toString());
        }
    }
}
