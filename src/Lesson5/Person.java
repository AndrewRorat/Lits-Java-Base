package Lesson5;

public class Person {

    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("U are dump");
        }else this.age = age;
    }
}
