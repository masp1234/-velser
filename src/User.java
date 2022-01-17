import java.util.Random;

public class User {
    private String fullName = "Martin Pedersen";
    private String userID = "mas12345";
    private final int NUMBER_OF_DIGITS = 4;

    public boolean validUserID() {
        char[] charArr = userID.substring(0, 4).toCharArray();
        boolean isValid = true;
        for (char character: charArr) {
            if (!(character >= 'a' && character <= 'z')) {
                isValid = false;
            }
        }
        char[] charArr2 = userID.substring(4, 8).toCharArray();
        for (char character: charArr2) {
            if (!(character >= '0' && character <= '9')) {
                isValid = false;
            }
        }
        return isValid;

    }
    public void setId() {
        String[] strArr = fullName.split(" ");
        userID = strArr[0].substring(0, 2) + strArr[strArr.length - 1].substring(0, 2);
        Random random = new Random();
        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            userID += random.nextInt(10);

        }
    }
    public String getUserID() {
        return userID;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.validUserID());
        user.setId();
        System.out.println(user.getUserID());
    }
}
