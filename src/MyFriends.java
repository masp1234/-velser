public class MyFriends {
    private UserInterface ui;

    public MyFriends() {
        Controller controller = new Controller();
        ui = new UserInterface(controller);
    }
    public void run() {
        ui.run();
    }

    public static void main(String[] args) {
        new MyFriends().run();
    }
}
