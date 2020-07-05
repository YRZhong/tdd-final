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

    public Bag fetch(Ticket ticket) {
        if (ticket.size == 'S') {
            return locker.fetch(ticket);
        }
        if (ticket.size == 'M') {
            return primaryLockerRobot.fetch(ticket);
        }
        if (ticket.size == 'L') {
            return superLockerRobot.fetch(ticket);
        }
        return null;
    }
}
