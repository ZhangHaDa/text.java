package text_25_2_17;

public class Dog extends animal {
    public Dog() {
    }

    public Dog(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃"+something);
    }
    public void lookHome(){
        System.out.println("狗看家！");
    }
}
