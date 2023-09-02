import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Item> inventory = new ArrayList<Item>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public List<Item> getInventory() {
        return inventory;
    }
}
