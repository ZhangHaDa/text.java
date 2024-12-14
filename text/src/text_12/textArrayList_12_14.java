package text_12;

/*import java.util.ArrayList;

public class textArrayList_12_14 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        //添加
        list.add("aba");
        list.add("qwe");
        list.add("123");
        list.add("789");
        //System.out.println(list);
       //删除
        list.remove("aba");
        String s = list.remove(0);
        System.out.println(list);
        //改写
        list.set(0,"456");
        //查询元素
        String s1 = list.get(0);
        System.out.println(s1);
        System.out.println(list);
        //查询长度
        int size = list.size();
        System.out.println(size);
    }
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

public class textArrayList_12_14{
    public static void main(String[] args){
        ArrayList<studentArrayList_12_14> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int j = 0;
        while(j<1){
            studentArrayList_12_14 s = new studentArrayList_12_14();
            s.setName(sc.next());
            s.setAge(sc.nextInt());
            list.add(s);
            j++;
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge());
            }else{
                System.out.print(list.get(i).getName()+" "+list.get(i).getAge()+", ");
            }
        }
        System.out.println("]");
    }
}*/
import java.util.ArrayList;
import java.util.Scanner;

public class textArrayList_12_14{
    public static void main(String[] args){
        ArrayList<phoneArrayList_12_14> list = new ArrayList<>();
        phoneArrayList_12_14 p1 = new phoneArrayList_12_14("小米",1000);
        phoneArrayList_12_14 p2 = new phoneArrayList_12_14("苹果",8000);
        phoneArrayList_12_14 p3 = new phoneArrayList_12_14("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<phoneArrayList_12_14> list1 = getNewArrayList(list);
        System.out.println(list1.get(0).getBrand());

    }
    public static ArrayList<phoneArrayList_12_14> getNewArrayList(ArrayList<phoneArrayList_12_14> list){
        ArrayList<phoneArrayList_12_14> p = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                p.add(list.get(i));
            }
        }
        return p;
    }
}






