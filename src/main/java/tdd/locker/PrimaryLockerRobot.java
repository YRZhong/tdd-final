package tdd.locker;

import java.util.List;

public class PrimaryLockerRobot {
    private List<Locker> lockers;

    public PrimaryLockerRobot(List<Locker> lockers) {
        this.lockers = lockers;
    };

    public Ticket store(Bag bag) {
        for (int i = 0; i < lockers.size(); i ++) {
            return lockers.get(i).store(bag);
        }
        return null;
    }

}
