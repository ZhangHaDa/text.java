package text_25_2_17;

public class Cat extends animal{
    public Cat() {
    }

    public Cat(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
