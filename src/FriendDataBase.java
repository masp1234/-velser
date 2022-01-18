import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendDataBase {
    private ArrayList<Friend> friends = new ArrayList<>();
    private String filepath = "C:\\Users\\masp9\\Downloads\\FightGame-master\\øvelser1\\Friends.txt";


    public void createFriend(String name, String phoneNumber, String email) {
        friends.add(new Friend(name, phoneNumber, email));
        saveFriends();

    }

    public Friend[] getFriends() {
        return friends.toArray(new Friend[0]);
    }
    public void loadFriends() {
        Scanner reader = null;
        File file = new File(filepath);
        try {
            reader = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Filen blev ikke fundet.");
        }
        while (reader.hasNext()) {
            createFriend(reader.next(), reader.next(), reader.next());
        }

    }
    private void saveFriends() {
        PrintStream writer = null;
        try {
            writer = new PrintStream(filepath);
        }
        catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet.");
        }
        for (Friend friend: friends) {
            writer.println(friend);

        }
    }
    public Friend[] getListOfMatchingFriends(String userInput) {
        ArrayList<Friend> matchingFriends = new ArrayList<>();
        for (Friend friend: friends) {
            if (friend.getName().equalsIgnoreCase(userInput)
            || friend.getPhoneNumber().equalsIgnoreCase(userInput)
            || friend.getEmail().equalsIgnoreCase(userInput)) {
                matchingFriends.add(friend);
            }
        }
        return matchingFriends.toArray(new Friend[0]);
    }




}
