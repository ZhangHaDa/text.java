package text_12;

public class textString_12_11 {
    public static void main(String[] args){
        String phoneNumber = "13112349468";
        String s = phoneNumber.substring(0, 3);
        String s1 = phoneNumber.substring(7);
        System.out.println(s+"****"+s1);
        String id = "321281202001011234";
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("出生"+year+"年"+month+"月"+day+"日");
        char gender = id.charAt(16);
        int genderNew = gender - 48;
        if(genderNew%2==0){
            System.out.println("性别：女");
        }else{
            System.out.println("性别：男");
        }
        String name = "TMD";
        String result = name.replace("TMD", "***");
        System.out.println(result);
    }
}
