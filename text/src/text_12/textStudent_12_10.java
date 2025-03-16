package text_12;

public class textStudent_12_10 {
    public static void main(String[] args){
        objectStudent_12_10[] arr = new objectStudent_12_10[2];
        objectStudent_12_10 gf1 = new objectStudent_12_10(1,"zhangsan",23);
        objectStudent_12_10 gf2 = new objectStudent_12_10(2,"lisi",24);
        arr[0] = gf1;
        arr[1] = gf2;
        objectStudent_12_10 gf3 = new objectStudent_12_10(3,"wangwu",25);
        boolean flag = compare(arr,gf3.getId());
        if(flag){
            System.out.println("id已经存在！");
        }else{
            int count = getCount(arr);
            if (count == arr.length){
                objectStudent_12_10[] newArr = creatNewArr(arr); //new objectStudent_12_10[count+1];
//                newArr = creatNewArr(arr);
                newArr[count] = gf3;
                int exist = getId(newArr,2);
                if(exist>=0){
                    newArr[exist] = null;
                }else{
                    System.out.println("id不存在！");
                }
                int exisst = getId(newArr,1);
                if(exisst>=0){
                    newArr[exisst].setAge(newArr[exisst].getAge()+1);
                }else{
                    System.out.println("id不存在！");
                }
                printArr(newArr);
            }else {
                arr[count] = gf3;
                int exist = getId(arr,2);
                if(exist>=0){
                    arr[exist] = null;
                }else{
                    System.out.println("id不存在！");
                }
                int exisst = getId(arr,2);
                if(exisst >=0){
                    arr[exisst].setAge(arr[exisst].getAge()+1);
                }else{
                    System.out.println("id不存在！");
                }
                printArr(arr);
            }
        }
    }




    //判断id是否唯一
    public static boolean compare(objectStudent_12_10[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return true;
                }
            }
        }
        return false;
    }
    //得到数组中有几个不为NULl
    public static int getCount(objectStudent_12_10[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }

    //超出数组，创建新数组
    public  static objectStudent_12_10[] creatNewArr(objectStudent_12_10[] arr){
        objectStudent_12_10[] newArr = new objectStudent_12_10[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //打印数组
    public static void printArr(objectStudent_12_10[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getAge());
            }
        }
    }
    //判断id是否存在
    public static int getId(objectStudent_12_10[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return i;
                }
            }
        }
        return -1;
    }










}
