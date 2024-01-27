package decorator;

/**
 * Armor decoration for the player
 * @author abhinavk
 */
public class Armor extends PlayerDecorator {
    /**
     * Constructor that takes in the player and integrates the armor decor
     * @param player the player being decorated
     */
    public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/armor.txt"));
    }
}
