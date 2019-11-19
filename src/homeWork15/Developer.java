package homeWork15;

import java.util.Objects;

public class Developer implements Employee, Comparable<Developer> {

    private String name;
    private Integer age;


    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Developer(){}

    @Override
    public String name() {
        return name;
    }

    @Override
    public Integer age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age &&
                Objects.equals(name, developer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Developer{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Developer o) {
        return this.age.compareTo(o.age);
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