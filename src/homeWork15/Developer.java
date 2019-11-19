package homeWork15;

public class Developer extends Employee {

    private String programing;

    public Developer(String name, Integer age, String programing) {
        super(name, age);
        this.programing = programing;
    }

    public Developer() {
    }

    public String getPrograming() {
        return programing;
    }

    public void setPrograming(String programing) {
        this.programing = programing;
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
        return "Developer{" + "Name '" + getName() + '\'' +
                " Age '" + getAge() + '\'' +
                "programing='" + programing + '\'' +
                '}';
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