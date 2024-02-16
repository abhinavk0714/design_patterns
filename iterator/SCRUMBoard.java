package iterator;

/**
 * SCRUMBoard class which sets up tasks from the tasklist
 * @author abhinavk
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Constructor which sets up the todo, doing, and done tasklists
     * @param projectName the name of the SCRUMBoard
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("ToDo:");
        this.doing = new TaskList("Doing:");
        this.done = new TaskList("Done:");
    }

    /**
     * Adds a ticket to the todo section of the SCRUMBoard
     * @param name the name of the ticket
     * @param teamMember the teammember assigned to the ticket
     * @param difficulty the difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        todo.addTicket(ticket);
    }

    /**
     * Starts the ticket and moves it from todo to doing
     * @param name the name of the ticket
     * @return true if the ticket has been started, false if it hasnt
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * Finishes the ticket and moves it from doing to done
     * @param name the name of the ticket
     * @return true if the ticket has been finished, false if it hasnt
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            doing.getTicket(name);
            done.addTicket(ticket);
            return true;
        }
        return false;    
    }

    /**
     * A toString representation of the SCRUMBoard with all of the tickets
     * @return the toString
     */
    public String toString() {
        return "***** " + projectName + " *****\n" +
        todo + "\n" +
        doing + "\n" +
        done;    
    }
}
