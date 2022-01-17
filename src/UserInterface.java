public class UserInterface {
    private Controller controller;

    public UserInterface(Controller controller) {
        this.controller = controller;
    }
    public void run() {
        Menu menu = new Menu("Velkommen til MyFriends!", "Vælg en mulighed: ",
                new String[] {"1. Opret ny ven", "2. Se liste med venner", "3. Slet ven", "9. Luk programmet"});

        menu.printMenu();
        boolean isRunning = true;

        switch (menu.readChoice()) {
            case 1:
                //createFriend();
                break;
            case 2:
               // printFriendList();
                break;
            case 3:
                //deleteFriend();
                break;
            case 9:
                isRunning = false;
                System.out.println("Lukker programmet...");

        }

    }
}
