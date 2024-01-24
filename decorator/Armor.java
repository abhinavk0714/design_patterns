package decorator;

public class Armor extends PlayerDecorator {
    public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("armor.txt"));
    }
}
