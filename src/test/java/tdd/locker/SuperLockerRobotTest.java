package tdd.locker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SuperLockerRobotTest {
    @Test
    public void should_return_LTicket_when_store_given_LLocker_has_capacity() {
        Locker locker = new Locker('L', 5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag bag = new Bag('L');
        Ticket ticket = primaryLockerRobot.store(bag);
        assertNotNull(ticket);
        assertSame('L', ticket.size);
    }

    @Test
    public void should_throw_full_exception_when_store_when_LLocker_has_no_capacity() {
        Locker locker = new Locker('L', 1);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag bag1 = new Bag('L');
        Bag bag2 = new Bag('L');
        primaryLockerRobot.store(bag1);
        assertThrows(LockerIsFullException.class, ()->primaryLockerRobot.store(bag2));
    }

    @Test
    public void should_get_LBag_when_fetch_given_correct_ticket() {
        Bag storedBag = new Bag('L');
        Locker locker = new Locker('L', 2);
        Ticket ticket = locker.store(storedBag);
        SuperLockerRobot superLockerRobot = new SuperLockerRobot(Arrays.asList(locker));
        Bag fetchedBag = superLockerRobot.fetch(ticket);
        assertSame(storedBag, fetchedBag);
    }

    @Test
    public void should_throw_exception_when_fetch_given_invalid_ticket() {
        Locker locker = new Locker('L', 2);
        Ticket ticket = new Ticket('L');
        SuperLockerRobot superLockerRobot = new SuperLockerRobot(Arrays.asList(locker));
        assertThrows(InvalidTicketException.class, ()->superLockerRobot.fetch(ticket));
    }

}