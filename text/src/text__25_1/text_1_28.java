package text__25_1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class text_1_28 {
    public static void main(String[] args){
        ArrayList<obStudent_1_28> os = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            menu1();
            System.out.println("请你输入你的选择:");
            int chose = sc.nextInt();
            switch(chose){
                case 1:
                    //添加学生(11)
                    addStudent(os);
                    break;
                case 2:
                    //删除学生(21)
                    deleteStudent(os);
                    break;
                case 3:
                    //修改学生(31)
                    reviseStudent(os);
                    break;
                case 4:
                    //查询学生(41)
                    consultStudent(os);
                    break;
                case 5:
                    //退出
                    System.out.println("恭喜你成功退出!");
                    break loop;
                default:
                    System.out.println("输入错误，请你重新输入:");
            }
        }


    }
    //菜单
    public static void menu1(){
        System.out.println("------欢迎来到学生管理系统------");
        System.out.println("1: 添加学生");
        System.out.println("2: 删除学生");
        System.out.println("3: 修改学生");
        System.out.println("4: 查询学生");
        System.out.println("5: 退出");
    }
    //添加
    //(11)
    public static void addStudent(ArrayList<obStudent_1_28> os){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请你输入添加的id:");
            String id = sc.next();
            //判断id是否唯一(12)
            if(compareId(os,id)){
                System.out.println("请你依次输入姓名-年龄-家庭住址:");
                String name = sc.next();
                int age = sc.nextInt();
                String address = sc.next();
                obStudent_1_28 oss = new obStudent_1_28();
                oss.setId(id);
                oss.setName(name);
                oss.setAge(age);
                oss.setHomeAddress(address);
                os.add(oss);
                System.out.println("恭喜id为"+id+"添加成功");
                break;
            }else {
                System.out.println("输入id不唯一,请你重新输入:");
            }
        }

    }
    //只判断唯一
    //(12)
    public static boolean compareId(ArrayList<obStudent_1_28> os ,String newId){
        for (int i = 0; i < os.size(); i++) {
            if(os.get(i).getId().equals(newId))
                //不唯一
                return false;
        }
        return true;
    }
    //删除
    //(21)
    public static void deleteStudent(ArrayList<obStudent_1_28> os){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入删除的id:");
        String id = sc.next();
        //判断id存在并且返回下标(22)
        if(compare(os,id)>-1){
            //存在id
            os.remove(compare(os,id));
            System.out.println("删除成功!");
        }else {
            System.out.println("id不存在!");
        }

    }
    //判断id存在并且返回下标
    //(22)
    public static int compare(ArrayList<obStudent_1_28> os ,String newId){
        for (int i = 0; i < os.size(); i++) {
            if(os.get(i).getId().equals(newId))
                //相同
                return i;
        }
        return -1;
    }
    //修改
    //(31)
    public static void reviseStudent(ArrayList<obStudent_1_28> os){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入id:");
        String id = sc.next();
        //判断id
        if(compare(os,id)>-1){
            System.out.println("id存在!");
            System.out.println("请你依次输入姓名-年龄-家庭住址:");
            String name = sc.next();
            int age = sc.nextInt();
            String address = sc.next();
            int d = compare(os,id);
            obStudent_1_28 oss = new obStudent_1_28();
            oss.setId(id);
            oss.setName(name);
            oss.setAge(age);
            oss.setHomeAddress(address);
            os.set(d,oss);
            System.out.println("恭喜id为"+id+"修改成功");
        }else {
            System.out.println("id不存在!");
        }
    }
    //查询
    //(41)
    public static void consultStudent(ArrayList<obStudent_1_28> os){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入查询的id:");
        String id = sc.next();
        int d = compare(os,id);
        if(d>-1){
            System.out.println("学生Id:     姓名:  年龄:  家庭住址:  ");
            System.out.println("      "+os.get(d).getId()+"\t   "+os.get(d).getName()+"\t  "+os.get(d).getAge()+"\t"+os.get(d).getHomeAddress());
        }else{
            System.out.println("id不存在!");
        }

    }
}
