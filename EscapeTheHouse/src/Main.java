public class Main {
    public static void main(String[] args) {
        GameMap game_map = new GameMap();
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        Room room3 = new Room("Room 3");
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        game_map.addRoom(room1);
        game_map.addRoom(room2);
        game_map.addRoom(room3);
        game_map.addExit(room1, "north", room2);
        game_map.addExit(room2, "south", room1);
        game_map.addExit(room2, "west", room3);
        game_map.addExit(room3, "east", room2);
        room1.addItem(item1);
        room2.addItem(item2);
        room3.addItem(item3);
        Player player = new Player("Player 1");
        player.addItem(item1);
        player.addItem(item2);
        player.addItem(item3);
        System.out.println("Player 1 is in " + room1.getName());
        System.out.println("Player 1 has " + player.getInventory().size() + " items");
        System.out.println("Player 1 has " + room1.getItems().size() + " items");
        System.out.println("Player 1 can go " + game_map.getExit(room1, "north").getName());
        System.out.println("Player 1 can go " + game_map.getExit(room2, "south").getName());
        System.out.println("Player 1 can go " + game_map.getExit(room2, "west").getName());
        System.out.println("Player 1 can go " + game_map.getExit(room3, "east").getName());
    }
}
