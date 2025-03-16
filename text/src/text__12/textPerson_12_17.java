package text__12;

public class textPerson_12_17 {
    private String id;
    private String name;
    private String salary;

    public textPerson_12_17() {
    }

    public textPerson_12_17(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void eat(){
        System.out.println("吃米饭！");
    }
    public void work(){
        System.out.println("在工作！");
    }
}


