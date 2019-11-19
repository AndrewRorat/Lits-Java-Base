package homeWork15;

import java.util.Objects;

public class Recruiter implements Employee, Comparable<Recruiter> {

    private String name;
    private Integer age;


    public Recruiter(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Recruiter(){}


    @Override
    public String name() {
        return null;
    }

    @Override
    public Integer age() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recruiter)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Recruiter recruiter = (Recruiter) o;
        return Objects.equals(name, recruiter.name) &&
                Objects.equals(age, recruiter.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Recruiter o) {
        return this.age.compareTo(age);
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

    public void showEmployee(){
        System.out.println("Name: " + getName() +
                "Age: " + getAge());
    }
}