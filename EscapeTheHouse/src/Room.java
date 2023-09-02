import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Item> items = new ArrayList<Item>();

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
