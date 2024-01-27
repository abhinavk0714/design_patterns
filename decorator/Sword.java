package decorator;

/**
 * Sword decoration for the player
 * @author abhinavk
 */
public class Sword extends PlayerDecorator {
    /**
     * Constructor that takes in the player and integrates the sword decor
     * @param player the player being decorated
     */
    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/sword.txt"));
    }
}
