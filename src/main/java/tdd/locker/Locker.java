package tdd.locker;

import java.util.HashMap;
import java.util.Map;

public class Locker {
    private int capacity;
    private char size;
    private Map<Ticket, Bag> storedBags = new HashMap<>();

    public Locker(Character size, int capacity) {
        this.size = size;
        this.capacity = capacity;
    };

    public Ticket store(Bag bag) {
        if (capacity <= 0) {
            throw new LockerIsFullException();
        }
        Ticket ticket = new Ticket(size);
        storedBags.put(ticket, bag);
        capacity--;
        return ticket;
    };

    public Bag fetch(Ticket ticket) {
        Bag bag = storedBags.get(ticket);
        if (bag == null) {
            throw new InvalidTicketException();
        }
        storedBags.remove(ticket);
        capacity++;
        return bag;
    };
}
