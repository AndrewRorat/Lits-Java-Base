package homeWork15;

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
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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