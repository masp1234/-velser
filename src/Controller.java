public class Controller {
    private FriendDataBase db;

    public Controller() {
        db = new FriendDataBase();
    }

    public void createFriend(String name, String phoneNumber, String email) {
        db.createFriend(name, phoneNumber, email);
    }

    public Friend[] getFriends() {
        return db.getFriends();
    }

    public void loadFriends() {
        db.loadFriends();
    }


    public Friend[] getListOfMatchingFriends(String input) {
        return db.getListOfMatchingFriends(input);
    }
}
