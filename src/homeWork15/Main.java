package homeWork15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Jon", 25, "java");
        Employee developer2 = new Developer("Vova", 45, "c++");
        Employee developer3 = new Developer("Andrew", 20, "kotlin");
        Employee developer4 = new Developer("Maks", 22, "java");
        Employee developer5 = new Developer("Taras", 19, "java");

        Employee recruiter1 = new Recruiter("Anna", 26, "IT people");
        Employee recruiter2 = new Recruiter("Anna", 26, "people");
        Employee recruiter3 = new Recruiter("Nina", 22, "people");
        Employee recruiter4 = new Recruiter("Natalia", 21, "people");
        Employee recruiter5 = new Recruiter("Andriana", 23, "people");

        /*
        HashSet
        */
        var personHashSet = new HashSet<>();
        personHashSet.add(developer1);
        personHashSet.add(developer2);
        personHashSet.add(developer3);
        personHashSet.add(developer4);
        personHashSet.add(developer5);

        personHashSet.add(recruiter1);
        personHashSet.add(recruiter2);
        personHashSet.add(recruiter3);
        personHashSet.add(recruiter4);
        personHashSet.add(recruiter5);

        System.out.println(recruiter1.equals(recruiter1));
        System.out.println(recruiter1.equals(recruiter2));
        System.out.println(recruiter2.equals(recruiter1));

        /*
        LinkedHashSet
         */
        var personLinkedHashSet = new LinkedHashSet<>();
        personLinkedHashSet.add(developer1);
        personLinkedHashSet.add(developer2);
        personLinkedHashSet.add(developer3);
        personLinkedHashSet.add(developer4);
        personLinkedHashSet.add(developer5);

        personLinkedHashSet.add(recruiter1);
        personLinkedHashSet.add(recruiter2);
        personLinkedHashSet.add(recruiter3);
        personLinkedHashSet.add(recruiter4);
        personLinkedHashSet.add(recruiter5);

        /*
        TreeSet
         */
        var personTreeSet = new TreeSet<>();

//        personTreeSet.add(developer1);
//        personTreeSet.add(developer2);
//        personTreeSet.add(developer3);
//        personTreeSet.add(developer4);
//        personTreeSet.add(developer5);

        personTreeSet.add(recruiter1);
        personTreeSet.add(recruiter2);
        personTreeSet.add(recruiter3);
        personTreeSet.add(recruiter4);
        personTreeSet.add(recruiter5);


        System.out.println("HashSet");
        System.out.println(personHashSet);
        System.out.println("LinkedHashSet ");
        System.out.println(personLinkedHashSet);
        System.out.println("TreeSet");
        System.out.println(personTreeSet);


        class Creator {
            public void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String input;
                var developers = new ArrayList<Employee>();
                var recruiters = new ArrayList<Employee>();


                do {
                    System.out.println("1. Create new developer employee");
                    System.out.println("2. Create new recruiter employee");
                    System.out.println("3. Quit");

                    System.out.println("Please enter 1, 2 or 3");
                    input = (scanner.nextLine());

                    if (input.equals("1")) {
                        Developer developerCreator = new Developer();
                        developers.add(developer1);
                        System.out.println("Enter name");
                        developerCreator.setName(scanner.nextLine());
                        System.out.println("Enter age");
                        developerCreator.setAge(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Enter programing language");
                        developerCreator.setPrograming(scanner.nextLine());
                        developerCreator.showEmployee();
                    } else if (input.equals("2")) {
                        Recruiter recruiterCreator = new Recruiter();
                        recruiters.add(recruiter1);
                        System.out.println("Enter name");
                        recruiterCreator.setName(scanner.nextLine());
                        System.out.println("Enter age");
                        recruiterCreator.setAge(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Enter working with");
                        recruiterCreator.setWorkWith(scanner.nextLine());
                        recruiterCreator.showEmployee();
                    }
                } while (!input.equals("3"));
            }
        }
    }
}