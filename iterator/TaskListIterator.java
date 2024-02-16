package iterator;

/**
 * TaskListIterator that implements Iterator
 * @author abhinavk
 */
public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;

    /**
     * Constructor that reads an array of tickets and initializes them
     * @param tickets the tickets
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Iterator method that returns true if there is another ticket to be iterated
     * @return true if more tickets, false if not
     */
    public boolean hasNext() {
        return position < tickets.length;
    }

    /**
     * Iterator method that returns the next ticket if there is one from the array of tickets
     * @return the ticket
     */
    public Ticket next() {
        if (hasNext()) {
            return tickets[position++];
        } else {
            throw new IllegalStateException("No more elements to iterate");
        }    
    }
}
