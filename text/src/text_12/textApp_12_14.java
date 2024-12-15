package text_12;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class textApp_12_14 {
    public static void main(String[] args){
        //登录系统
        Scanner sc = new Scanner(System.in);
        ArrayList<ojStudent_12_14> os = new ArrayList<>();
         loop: while (true) {
            menu1();
            System.out.println("请你输入你的选择：");
            switch(sc.next()){
                case "1":
                    //登录
                    login(os);
                    break;
                case "2":
                    //注册
                    register(os);
                    break;
                case "3":
                    //忘记
                    forgotPassword(os);
                    break;
                case "4":
                    //退出
                    System.out.println("退出成功！");
                    break loop;
                default:
                    System.out.println("输入错误，请你重新输入！");

            }
        }

    }
    //登录菜单
    public static void menu1(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请你选择操作：1.登录 2.注册 3.忘记密码 4.退出");
    }
    //注册
    public static void register(ArrayList<ojStudent_12_14> os ){
        loop1:while (true){
            System.out.println("请你输入你的用户名：");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            //判断唯一(21)
            if(compareName(os,name)){
                //唯一
                //再判断是否长度3-15，且只能是字母和数字，不能是纯数字（22）
                if(compareNameRight(name)){
                    //记录用户
                    ojStudent_12_14 s = new ojStudent_12_14();
                    s.setUserName(name);
                    //输入密码
                    String password1 = "";
                    loop2:while (true) {
                        System.out.println("请你输入密码：");
                         password1 = sc.next();
                        System.out.println("请你再次输入密码：");
                        String password2 = sc.next();
                        if(password1.equals(password2)){
                            System.out.println("密码输入正确！");
                            break loop2;
                        }else{
                            System.out.println("密码未对应,请你重新输入！");
                        }
                    }
                    s.setUserPassword(password1);
                    //判断身份证,长度18，不能以0开头，前17位为数字，末尾可以为X(x)(23)
                    String card = "";
                   loop3: while(true){
                        System.out.println("请输入身份证：");
                        card = sc.next();
                        if(compareCard(card)){
                            System.out.println("身份证输入成功！");
                            break loop3;
                        }else{
                            System.out.println("身份证输入错误,请你重新输入！");
                        }
                    }
                    s.setUserCard(card);
                    //判断手机号，长度11，不能0开头，必须是数字(24)
                    String phoneNumber = "";
                   loop4: while(true){
                        System.out.println("请你输入电话号码：");
                        phoneNumber = sc.next();
                        if(comparePhoneNumber(phoneNumber)){
                            System.out.println("输入成功！");
                            break loop4;
                        }else{
                            System.out.println("输入错误，请你重新输入！");
                        }
                    }
                    s.setUserPhoneNumber(phoneNumber);
                    //记录
                    os.add(s);
                    break loop1;
                }else{
                    System.out.println("用户名格式错误,请你重新输入!");
                }
            }else{
                System.out.println("用户名已经存在，请你重新输入！");
            }
        }
        System.out.println("恭喜你注册成功，请你登录账号！");

    }
    //(21)
    //判断用户名是否唯一，唯一true
    public static boolean compareName(ArrayList<ojStudent_12_14> os,String name){
        for (int i = 0; i < os.size(); i++) {
            if(os.get(i).getUserName().equals(name)){
                return false;
            }
        }
        return true;
    }
    //（21）
    //判断是否长度3-15，且只能是字母和数字，不能是纯数字
    public static boolean compareNameRight( String name){
        if(name.length()<3||name.length()>15){
            return false;
        }
        //记录字母个数
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            //判断
            if(c<'A'||c>'Z'&&c<'a'||c>'z'){
                if(c<'0'||c>'9'){
                    return false;
                }
            }else{
                count++;
            }
        }
        if(count>0){
            return true;
        }
        return false;
    }
    //(23)
    //判断身份证,长度18，不能以0开头，前17位为数字，末尾可以为X(x)
    public static boolean compareCard(String card){
        //长度
        if(card.length()!=18){
            return false;
        }
        //首
        if(card.charAt(0)==0){
            return false;
        }
        //前17
        for (int i = 0; i < card.length()-1; i++) {
            if(card.charAt(i)<'0'||card.charAt(i)>'9'){
                return false;
            }
        }
        //最后
        if(card.charAt(card.length()-1)>='0'&&card.charAt(card.length()-1)<='9'||card.charAt(card.length()-1)=='X'||card.charAt(card.length()-1)=='x'){
            return true;
        }
        return false;
    }
    //(24)
    //判断手机号，长度11，不能0开头，必须是数字
    public static boolean comparePhoneNumber(String phoneNumber){
        if(phoneNumber.length()!=11){
            return false;
        }
        if(phoneNumber.charAt(0)==0){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if(phoneNumber.charAt(i)<'0'||phoneNumber.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    //登录
    public static void login(ArrayList<ojStudent_12_14> os){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            //判断用户名
            System.out.println("请你输入用户名：");
            String name = sc.next();
            if(compareName(os,name)){
                //不存在
                System.out.println("用户名未注册，请先注册！");
                return;
            }else{
                //存在
                //输入密码，并且判断(11)
                System.out.println("请你输入密码：");
                String password = sc.next();
                if(comparePassword(os,password)){
                    System.out.println("密码错误,还有"+(3-i-1)+"次机会");
                }else {
                    count++;
                    break;
                }
            }
        }
        if(count==1){
            //生成验证码(12)
            String s = generateVerificationCode();
            System.out.println("验证码为："+s);
            while(true){
                System.out.println("请你输入验证码：");
                if(s.equals(sc.next())){
                    System.out.println("输入正确！");
                    count++;
                    break;
                }else{
                    System.out.println("输入错误！");
                }
            }
        }else{
            return;
        }
        if(count==2){
            System.out.println("恭喜你登录成功！");
            textApp_12_15 t = new textApp_12_15();
            t.Student();
        }

    }
    //(11)
    //输入密码，并且判断
    public static boolean comparePassword(ArrayList<ojStudent_12_14> os,String password){
        for (int i = 0; i < os.size(); i++) {
            if(os.get(i).getUserPassword().equals(password)){
                return false;
            }
        }
        return true;
    }
    //(12)
    //生产验证码
    public static String generateVerificationCode(){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<26){
                arr[i] = (char)('a'+i);
            }else{
                arr[i] = (char)('A'+i-26);
            }
        }
        Random r = new Random();
        char[] newArr = new char[5];
        for (int i = 0; i < newArr.length; i++) {
            if(newArr.length-1==i){
                newArr[i] = (char)(r.nextInt(10)+48);
            }else{
                newArr[i] = arr[r.nextInt(52)];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            int d = r.nextInt(5);
            char c = newArr[i];
            newArr[i] = newArr[d];
            newArr[d] = c;
        }
        String s = new String(newArr);
        return s;
    }
    //忘记
    public static void forgotPassword(ArrayList<ojStudent_12_14> os){
        Scanner sc = new Scanner(System.in);
        //判断用户名
        System.out.println("请你输入用户名：");
        String name = sc.next();
        if(compareName(os,name)){
            //不存在
            System.out.println("用户名未注册，请先注册！");
            return;
        }else {
            System.out.println("请你输入身份证：");
            String card = sc.next();
            System.out.println("请你输入手机号：");
            String phoneNumber = sc.next();
            //判断(31)
            if(compare(os,card,phoneNumber)>=0){
                System.out.println("请你输入新密码：");
                String password = sc.next();
                os.get(compare(os,card,phoneNumber)).setUserPassword(password);
                System.out.println("修改成功！");
            }else{
                System.out.println("账号信息不匹配，修改失败！");
            }
        }
    }
    //(31)
    //判断
    public static int compare(ArrayList<ojStudent_12_14> os,String card,String phoneNumber){
        for (int i = 0; i < os.size(); i++) {
            if(card.equals(os.get(i).getUserCard())&&phoneNumber.equals(os.get(i).getUserPhoneNumber())){
                return i;
            }
        }
        return -1;
    }
}
