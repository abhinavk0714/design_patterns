package decorator;

/**
 * Shield decoration for the player
 * @author abhinavk
 */
public class Shield extends PlayerDecorator {
    /**
     * Constructor that takes in the player and integrates the shield decor
     * @param player the player being decorated
     */
    public Shield(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/shield.txt"));
    }
}
