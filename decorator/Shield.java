package decorator;

public class Shield extends PlayerDecorator {
    public Shield(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("shield.txt"));
    }
}
