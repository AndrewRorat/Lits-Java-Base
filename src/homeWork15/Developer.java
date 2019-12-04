package homeWork15;

import java.util.Objects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(programing, developer.programing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programing);
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