package com.study_25_3;

public class Actor_3 {
    private String name;
    private int age;

    public Actor_3() {
    }


    public Actor_3(String s) {
        String[] arr = s.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);


    }


    public Actor_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Actor_3{name = " + name + ", age = " + age + "}";
    }
}
