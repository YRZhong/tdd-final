package tdd.locker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LockerRobotMangerTest {
    @Test
    public void should_store_in_locker_when_store_given_SLocker_has_capacity() {
        Locker SLocker = new Locker('S', 5);
        Locker MLocker = new Locker('M', 5);
        Locker LLocker = new Locker('L', 5);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(MLocker));
        SuperLockerRobot superLockerRobot = new SuperLockerRobot(Arrays.asList(LLocker));
        LockerRobotManger lockerRobotManger = new LockerRobotManger(SLocker, primaryLockerRobot, superLockerRobot);
        Bag bag = new Bag('S');
        Ticket ticket = lockerRobotManger.store(bag);
        assertNotNull(ticket);
    }
}