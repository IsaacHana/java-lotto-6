package lotto.controller;

import lotto.domain.*;
import lotto.ui.*;
import lotto.utils.LottoGenerator;

public class LottoGame {
    private PurchaseAmount purchaseAmount;
    private LottoTickets userLottoTickets;

    private WinningLotto winningLotto;
    private WinningResult winningResult;
    private TotalReturn totalReturn;

    public void run() {
        collectPurchaseAmount();

        generateUserLottoTicketsByQuantity();

        printPurchaseResult();

        collectWinningLotto();

//        calculateWinningResult();
//
//        printWinningResult();
    }

    private void collectPurchaseAmount() {
        purchaseAmount = PurchaseAmount.valueOf(InputView.inputPurchaseAmount());
    }

    private void generateUserLottoTicketsByQuantity() {
//        userLottoTickets = lottoGenerator.generateLottoTickets(purchaseAmount.getQuantity());
    }

    private void printPurchaseResult() {
        OutputView.printNumberOfPurchasedLottoTickets(purchaseAmount);
        OutputView.printLottoTickets(userLottoTickets);
    }

    private void collectWinningLotto() {
        winningLotto = new WinningLotto(collectWinningNumbers(), collectBonusNumber());
    }

    private WinningNumber collectWinningNumbers() {
        return new WinningNumber(InputView.inputWinningNumber());
    }

    private BonusNumber collectBonusNumber() {
        return new BonusNumber(InputView.inputBonusNumber());
    }

//    private void calculateWinningResult() {
//        calculateMatchingLottoTickets();
//        calculateTotalReturn();
//    }
//
//    private void calculateMatchingLottoTickets() {
//        winningResult = new WinningResult(winningLotto.getWinningLotto(), userLottoTickets.getUserLottoTickets());
//    }
//
//    private void calculateTotalReturn() {
//        totalReturn = new TotalReturn(purchaseAmount.getAmount(), winningResult.getResult());
//    }
//
//    private void printWinningResult() {
//        printMatchingLottoTickets();
//        printTotalReturn();
//    }
//
//    private void printMatchingLottoTickets() {
//        OutputView.printMatchingLottoTickets(winningResult);
//    }
//
//    private void printTotalReturn() {
//        OutputView.printTotalReturn(totalReturn);
//    }
}
