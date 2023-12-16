package lotto.domain;

import java.util.Collections;
import java.util.List;

public class LottoTickets {
    private final List<Lotto> tickets;

    private LottoTickets(List<Lotto> tickets) {
        this.tickets = tickets;
    }

    public static LottoTickets valueOf(List<Lotto> tickets) {
        return new LottoTickets(tickets);
    }

    public List<Lotto> getTickets() {
        return Collections.unmodifiableList(tickets);
    }
}
