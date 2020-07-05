package tdd.locker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimaryLockerRobotTest {
    @Test
    public void should_return_MTicket_when_store_given_MLocker_has_capacity() {
        Locker locker = new Locker('M', 5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag bag = new Bag('M');
        Ticket ticket = primaryLockerRobot.store(bag);
        assertNotNull(ticket);
        assertSame('M', ticket.size);
    }

    @Test
    public void should_throw_full_exception_when_store_when_MLocker_has_no_capacity() {
        Locker locker = new Locker('M', 1);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag bag1 = new Bag('M');
        Bag bag2 = new Bag('M');
        primaryLockerRobot.store(bag1);
        assertThrows(LockerIsFullException.class, ()->primaryLockerRobot.store(bag2));
    }

    @Test
    public void should_get_MBag_when_fetch_given_correct_ticket() {
        Bag storedBag = new Bag('M');
        Locker locker = new Locker('M', 2);
        Ticket ticket = locker.store(storedBag);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag fetchedBag = primaryLockerRobot.fetch(ticket);
        assertSame(storedBag, fetchedBag);
    }

    @Test
    public void should_throw_exception_when_fetch_given_invalid_ticket() {
        Locker locker = new Locker('L', 2);
        Ticket ticket = new Ticket('L');
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        assertThrows(InvalidTicketException.class, ()->primaryLockerRobot.fetch(ticket));
    }
}