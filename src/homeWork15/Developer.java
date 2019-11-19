package homeWork15;

public class Developer extends Employee {

    private String name;
    private Integer age;

    public Developer(String name, Integer age) {
        super(name, age);
        this.age = age;
        this.name = name;
    }

    public Developer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Employee o) {
        return super.compareTo(o);
    }

    @Override
    public void showEmployee() {
        super.showEmployee();
    }
}