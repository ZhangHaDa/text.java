package text_12;

import java.util.ArrayList;
import java.util.Scanner;

public class textApp_12_15 {
    public static void Student(){
        ArrayList<obStudent_12_15> list = new ArrayList<>();
        //菜单
       loop: while (true) {
            menu();
            Scanner sc= new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case 1:
                    //添加
                    add(list);
                    break;
                case 2:
                    //删除
                    delete(list);
                    break;
                case 3:
                    //修改
                    revise(list);
                    break;
                case 4:
                    //查询
                    consult(list);
                    break;
                case 5:
                    System.out.println("退出成功！");
                    break loop;
                default:
                    System.out.println("输入错误，重新输入！");
            }
        }
    }
    //菜单
    public static void menu(){
        System.out.println("---------欢迎来到学生管理系统----------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出学生");
        System.out.println("请你输入你的选项：");
    }
    //查询
    public static void consult(ArrayList<obStudent_12_15> list ){
        if(list.size()==0){
            System.out.println("当前没有学生信息，请添加后再查询！");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            obStudent_12_15 os = list.get(i);
            System.out.println(os.getId()+"\t"+os.getName()+"\t"+os.getAge()+"\t"+os.getAddress());
        }
    }
    //添加
    public static void add(ArrayList<obStudent_12_15> list){
        System.out.println("请你输入要添加的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        obStudent_12_15 os = new obStudent_12_15();
        //判断唯一(11)
       if( compareName(list,id)){
           System.out.println("id已经存在！");
       }else {
           System.out.println("请你输入你的姓名：");
           String name = sc.next();
           System.out.println("请你输入你的年龄：");
           int age = sc.nextInt();
           System.out.println("请你输入你的地址：");
           String address = sc.next();
           os.setId(id);
           os.setName(name);
           os.setAge(age);
           os.setAddress(address);
           list.add(os);
       }
    }
    //(11)
    //判断唯一
    public static boolean compareName(ArrayList<obStudent_12_15> list,String id){
        //>=0找到，不唯一
        return compare(list, id)>=0;
    }
    //判断并且返回下标
    public static int compare(ArrayList<obStudent_12_15> list,String id){
        for (int i = 0; i < list.size(); i++) {
            obStudent_12_15 os = list.get(i);
            if(os.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    //删除
    public static void delete(ArrayList<obStudent_12_15> list){
        System.out.println("请你输入要添加的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int d = compare(list, id);
        if(d>=0){
            list.remove(d);
        }else{
            System.out.println("id不存在！");
        }
    }
    //修改
    public static void revise(ArrayList<obStudent_12_15> list){
        System.out.println("请你输入要修改的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        obStudent_12_15 os = new obStudent_12_15();
        if(compare(list,id)>=0){
            System.out.println("请你输入你的姓名：");
            String name = sc.next();
            System.out.println("请你输入你的年龄：");
            int age = sc.nextInt();
            System.out.println("请你输入你的地址：");
            String address = sc.next();
            int d = compare(list,id);
            os.setId(id);
            os.setName(name);
            os.setAge(age);
            os.setAddress(address);
            list.set(d,os);
        }else{
            System.out.println("id不存在！");
        }
    }
}
