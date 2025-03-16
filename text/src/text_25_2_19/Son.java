package text_25_2_19;

public class Son extends Person implements swim{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void Swim() {
        System.out.println("洗");
    }
}
