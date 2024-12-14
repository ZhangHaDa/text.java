package text_12;

public class ojStudent_12_14 {
    private String userName;
    private String userPassword;
    private String userCard;
    private String userPhoneNumber;

    public ojStudent_12_14() {
    }

    public ojStudent_12_14(String userName, String userPassword, String userCard, String userPhoneNumber) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCard = userCard;
        this.userPhoneNumber = userPhoneNumber;
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

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
