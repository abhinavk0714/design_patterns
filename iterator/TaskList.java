package iterator;

/**
 * The TaskList from which the tickets are created and moved around
 * @author abhinavk
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructor that sets up a TaskList
     * @param name the name of the tasklist
     */
    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[10]; // Initialize with a default size
        this.count = 0;    
    }

    /**
     * Method which adds a ticket to a tasklist
     * @param name the name of the ticket
     * @param teamMember the teammember assigned to the ticket
     * @param difficulty the difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        if (count < tickets.length) {
            tickets[count++] = ticket;
        } else {
            throw new IllegalStateException("Task list is full");
        }
    }

    /**
     * Overloaded addTicket method that has a ticket as its parameter
     * @param ticket the ticket
     */
    public void addTicket(Ticket ticket) {
        if (count < tickets.length) {
            tickets[count++] = ticket;
        } else {
            throw new IllegalStateException("Task list is full");
        }
    }

    /**
     * Method which gets a ticket and removes it from its current tasklist
     * @param name the name of the ticket
     * @return the ticket to be removed
     */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().equalsIgnoreCase(name)) {
                Ticket ticketToRemove = tickets[i];
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                count--;
                return ticketToRemove;
            }
        }
        return null;
    }

    /**
     * Method that creates a new TaskListIterator for the tickets
     * @return a TaskListIterator
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * Method that returns a toString representation of the entire SCRUMBoard with all of its TaskLists
     * @return toString representation of the SCRUMBoard
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(name).append("\n");
        for (int i = 0; i < count; i++) {
            output.append("- ").append(tickets[i]).append("\n");
        }
        return output.toString();
    }
}
