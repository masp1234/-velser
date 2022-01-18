import java.util.Scanner;

public class UserInterface {
    private Controller controller;

    public UserInterface(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        controller.loadFriends();
        Menu menu = new Menu("Velkommen til MyFriends!", "Vælg en mulighed: ",
                new String[]{"1. Opret ny ven", "2. Se liste med venner", "3. Slet ven", "9. Luk programmet"});

        menu.printMenu();
        boolean isRunning = true;
        while (isRunning) {

            switch (menu.readChoice()) {
                case 1:
                    createFriend();
                    break;
                case 2:
                    printFriendList();
                    break;
                case 3:
                    deleteFriend();
                    break;
                case 9:
                    isRunning = false;
                    System.out.println("Lukker programmet...");

            }
        }
    }

    private void deleteFriend() {
        System.out.println("Indtast enten navn, nummer, eller mail");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        Friend[] foundFriends = controller.getListOfMatchingFriends(userInput);

        int counter = 1;
        for (Friend friend: foundFriends) {
            System.out.println(counter + ". " + friend);
        }
        // print liste med fundne venner, vælg en ven, send ven med som parameter i delete friend eller
        // så noget.

    }
    public void createFriend() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast navn: ");
        String name = input.nextLine();
        System.out.println("Indtast telefonnummer: ");
        String phoneNumber = input.nextLine();
        System.out.println("Indtast email: ");
        String email = input.nextLine();
        controller.createFriend(name, phoneNumber, email);

    }

    public void printFriendList() {
        if (controller.getFriends().length > 0) {
            for (Friend friend : controller.getFriends()) {
                System.out.println(friend);
            }
        }
        else {
            System.out.println("Der er ikke nogle venner i listen");
        }
    }
}