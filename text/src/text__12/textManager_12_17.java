package text__12;

public class textManager_12_17 extends textPerson_12_17 {
    private String managerSalary;

    public textManager_12_17( ) {

    }

    public textManager_12_17(String id,String name,String salary,String managerSalary) {
      super(id,name,salary);
      this.managerSalary = managerSalary;
    }

    public String getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(String managerSalary) {
        this.managerSalary = managerSalary;
    }

    @Override
    public void work() {
        System.out.println("管理其他人！");
    }
}
