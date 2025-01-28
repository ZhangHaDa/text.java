package text__25_1;

public class obUser_1_28 {
    private String userName;
    private String userPassword;
    private String userCard;
    private int phoneNumber;

    public obUser_1_28() {
    }

    public obUser_1_28(String userName, String userPassword, String userCard, int phoneNumber) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCard = userCard;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
