package tdd.locker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LockerTest {
    @Test
    public void should_return_STicket_when_SLocker_has_capacity() {
        Locker locker = new Locker('S', 10);
        Bag bag = new Bag('S');
        Ticket ticket = locker.store(bag);
        assertNotNull(ticket);
        assertSame('S', ticket.size);
    }
}