package Lesson4;

public class Person {

    public String name;
    public int age;
    public String jobTitle;

    public Person(String name, int age, String jobTitle){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public void sayHallo(){
        System.out.println("Hi my name is " + name);
    }

    public boolean isAdult(){
        return age>=18;
    }
}
