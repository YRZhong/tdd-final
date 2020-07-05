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
        capacity--;
        return ticket;
    };

    public Boolean hasCapacity() {
        return capacity > 0;
    }
}
