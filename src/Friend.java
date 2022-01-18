public class Friend {
    private String name;
    private String phoneNumber;
    private String email;


    public Friend(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String toString() {
        return name + " " + phoneNumber + " " + email;
    }
    public boolean equals(Object o) {
        Friend otherFriend = (Friend) o;
        return this.name == otherFriend.name
                & this.phoneNumber == otherFriend.phoneNumber
                & this.email == otherFriend.email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
