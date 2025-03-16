package text_12;



public class textGame_12_10 {
    public static void main(String[]args){
        objectGame_12_10 r1 = new objectGame_12_10("张三",'男',100);
        objectGame_12_10 r2 = new objectGame_12_10("李四",'男',100);
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"ko了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"ko了"+r1.getName());
                break;
            }
        }
    }
}
