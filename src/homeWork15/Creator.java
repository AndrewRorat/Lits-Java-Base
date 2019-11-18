package homeWork15;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator  {
    public static void main(String[] args) {
        String input;
        var developers = new ArrayList<Employee>();
        var recruiters = new ArrayList<Employee>();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Create new developer employee");
            System.out.println("2. Create new recruiter employee");
            System.out.println("3. Quit");

            System.out.println("Please enter 1, 2 or 3");
            input = (scanner.nextLine());

            if (input.equals("1")) {
                Developer developer1 = new Developer();
                developers.add(developer1);
                System.out.println("Enter name");
                developer1.setName(scanner.nextLine());
                System.out.println("Enter age");
                developer1.setAge(Integer.parseInt(scanner.nextLine()));
                developer1.showEmployee();
            }
            else if (input.equals("2")) {
                Recruiter recruiter1 = new Recruiter();
                recruiters.add(recruiter1);
                System.out.println("Enter name");
                recruiter1.setName(scanner.nextLine());
                System.out.println("Enter age");
                recruiter1.setAge(Integer.parseInt(scanner.nextLine()));
            }
        }while (!input.equals("3"));
    }
}
