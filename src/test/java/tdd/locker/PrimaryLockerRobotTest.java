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
        Locker locker = new Locker('S', 1);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(locker));
        Bag bag1 = new Bag('S');
        Bag bag2 = new Bag('S');
        primaryLockerRobot.store(bag1);
        assertThrows(LockerIsFullException.class, ()->primaryLockerRobot.store(bag2));
    }
}