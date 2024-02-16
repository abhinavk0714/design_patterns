package iterator;

/**
 * Ticket class which creates the tickets
 * @author abhinavk
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Constructor that initializes a ticket
     * @param name the name of the ticket
     * @param teamMember the teammember assigned to the ticket
     * @param difficulty the difficulty of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Method that returns the name of the ticket
     * @return the name of the ticket
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns a toString representation of the ticket
     * @return toString representation fo the ticket
     */
    public String toString() {
        return name + "(" + difficulty + ") - " + teamMember;
    }
}
