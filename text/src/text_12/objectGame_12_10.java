package text_12;
import java.util.Random;
public class objectGame_12_10 {
    private String name;
    private int blood;
    private char gender;


    public objectGame_12_10() {
    }

    public objectGame_12_10(String name,char gender,int blood) {
        this.blood = blood;
        this.gender = gender;
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void attack(objectGame_12_10 r0){
        Random r = new Random();
        int attackBlood = r.nextInt(20)+1;
        int remainBlood = r0.getBlood() - attackBlood;
        remainBlood = remainBlood<0?0:r0.getBlood() - attackBlood;
        r0.setBlood(remainBlood);
        System.out.println(this.getName()+"攻击了"+r0.getName()+"造成了"+attackBlood+"剩余血量为："+remainBlood);
    }
}
