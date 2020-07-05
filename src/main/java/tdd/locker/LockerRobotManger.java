package tdd.locker;

public class LockerRobotManger {
    private Locker locker;
    private PrimaryLockerRobot primaryLockerRobot;
    private SuperLockerRobot superLockerRobot;

    public LockerRobotManger(Locker locker, PrimaryLockerRobot primaryLockerRobot, SuperLockerRobot superLockerRobot) {
        this.locker = locker;
        this.primaryLockerRobot = primaryLockerRobot;
        this.superLockerRobot = superLockerRobot;
    }

    public Ticket store(Bag bag) {
        if (bag.size == 'S') {
            return locker.store(bag);
        }
        if (bag.size == 'M') {
            return primaryLockerRobot.store(bag);
        }
        if (bag.size == 'L') {
            return superLockerRobot.store(bag);
        }
        return null;
    }
}
