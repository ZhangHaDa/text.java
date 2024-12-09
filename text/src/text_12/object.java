package text_12;

//private 私密无法访问，需要在本类即本对象中改变再赋值
public class object {
    private String name;
    private int age;

    //判断年龄是否合理
    //引用this表示成员变量即全局变量
    //引用变量名（相同）采取就近原则，所以优先局部变量
    public void setAge(int age){
        if(age >=18){
            this.age = age;
        }else{
            System.out.println("非法");
        }
    }

    public int getAge(){
        return age;
    }
    public void eat() {
        System.out.println("吃东西");
    }
}
