package text_25_2_17;

public class animal {
    private int age;
    private String colour;

    public animal() {
    }

    public animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void eat(String something){
        System.out.println("吃"+something);
    }
}
