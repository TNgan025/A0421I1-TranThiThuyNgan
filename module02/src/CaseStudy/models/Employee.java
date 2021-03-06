package CaseStudy.models;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id,
                    String name,
                    int age,
                    String sex,
                    String idCard,
                    int phone,
                    String email,
                    String level,
                    String position,
                    int salary) {
        super(id,name,age,sex,idCard,phone,email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
