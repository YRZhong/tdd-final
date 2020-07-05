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

    public Bag fetch(Ticket ticket) {
        if (!hasValidTicket(ticket)) {
            throw new InvalidTicketException();
        }
        for (int i = 0; i < lockers.size(); i++) {
            if (lockers.get(i).isContainsGivenBag(ticket)) {
                return lockers.get(i).fetch(ticket);
            }
        }
        return null;
    };

    public boolean hasValidTicket(Ticket ticket) {
        return lockers.stream().anyMatch(locker -> locker.isContainsGivenBag(ticket));
    };

}
