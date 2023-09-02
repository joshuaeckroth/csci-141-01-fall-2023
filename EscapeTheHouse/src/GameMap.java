import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private Map<Room, Map<String, Room>> game_map = new HashMap<Room, Map<String, Room>>();

    public void addRoom(Room room) {
        game_map.put(room, new HashMap<String, Room>());
    }

    public void addExit(Room room, String direction, Room exit) {
        game_map.get(room).put(direction, exit);
    }

    public Room getExit(Room room, String direction) {
        return game_map.get(room).get(direction);
    }

}
