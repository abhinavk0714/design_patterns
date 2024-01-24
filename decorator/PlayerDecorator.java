package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
    private Player player;

    public PlayerDecorator(Player player) {
        super(new ArrayList<>(), player.getName());
        this.player = player;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        lines.addAll(decor);
    }
}
