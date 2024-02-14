package iterator;

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[10]; // Initialize with a default size, adjust as needed
        this.count = 0;    
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        if (count < tickets.length) {
            tickets[count++] = ticket;
        } else {
            // Handle case where array is full (e.g., resize array or throw exception)
        }
    }

    public void addTicket(Ticket ticket) {
        if (count < tickets.length) {
            tickets[count++] = ticket;
        } else {
            // Handle case where array is full (e.g., resize array or throw exception)
        }
    }

    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().equals(name)) {
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

    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("- ").append(tickets[i]).append("\n");
        }
        return sb.toString();    }
}
