package text_12;

public class user {
    private String name;
    private String password;
    private int age;
    private String gender;

    public user(){}

    public user(String name,String password,int age,String gender){
        this.name = name;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
