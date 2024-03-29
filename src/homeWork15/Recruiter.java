package homeWork15;

import java.util.Objects;

public class Recruiter extends Employee {

    private String workWith;

    public Recruiter(String name, Integer age, String workWith) {
        super(name, age);
        this.workWith = workWith;
    }

    public Recruiter() {

    }

    public String getWorkWith() {
        return workWith;
    }

    public void setWorkWith(String workWith) {
        this.workWith = workWith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Recruiter recruiter = (Recruiter) o;
        return Objects.equals(workWith, recruiter.workWith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workWith);
    }

    @Override
    public String toString() {
        return "Recruiter{" + "Name '" + getName() + '\'' +
                " Age " + getAge() + '\'' +
                "workWith='" + workWith + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return super.compareTo(o);
    }

    @Override
    public void showEmployee() {
        super.showEmployee();
        System.out.println(getWorkWith());
    }
}