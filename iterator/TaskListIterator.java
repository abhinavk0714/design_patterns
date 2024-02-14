package iterator;

public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < tickets.length;
    }

    public Ticket next() {
        if (hasNext()) {
            return tickets[position++];
        } else {
            throw new IllegalStateException("No more elements to iterate");
        }    
    }
}
