package text__12;

public class textCook_12_17 extends textPerson_12_17 {
    public textCook_12_17() {
    }

    public textCook_12_17(String id, String name, String salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("炒菜！");
    }
}
