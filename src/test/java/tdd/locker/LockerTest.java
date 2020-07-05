package tdd.locker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LockerTest {
    @Test
    public void should_return_STicket_when_store_given_SLocker_has_capacity() {
        Locker locker = new Locker('S', 10);
        Bag bag = new Bag('S');
        Ticket ticket = locker.store(bag);
        assertNotNull(ticket);
        assertSame('S', ticket.size);
    }

    @Test
    public void should_throw_full_exception_when_store_given_SLocker_has_no_capacity() {
        Locker locker = new Locker('S', 1);
        Bag bag1 = new Bag('S');
        Bag bag2 = new Bag('S');
        Ticket ticket = locker.store(bag1);
        assertThrows(LockerIsFullException.class, ()->locker.store(bag2));
    }

    @Test
    public void should_get_SBag_when_fetch_given_correct_ticket() {
        Bag storedBag = new Bag('S');
        Locker locker = new Locker('S', 2);
        Ticket ticket = locker.store(storedBag);
        Bag fetchedBag = locker.fetch(ticket);
        assertSame(storedBag, fetchedBag);
    }
}