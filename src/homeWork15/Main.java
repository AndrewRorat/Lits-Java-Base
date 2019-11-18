package homeWork15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Jon", 25);
        Employee developer2 = new Developer("Vova", 45);
        Employee developer3 = new Developer("Andrew", 20);
        Employee developer4 = new Developer("Maks", 22);
        Employee developer5 = new Developer("Taras", 19);

        Employee recruiter1 = new Recruiter("Anna", 26);
        Employee recruiter2 = new Recruiter("Michel", 29);
        Employee recruiter3 = new Recruiter("Nina", 22);
        Employee recruiter4 = new Recruiter("Natalia", 21);
        Employee recruiter5 = new Recruiter("Andriana", 23);

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

        personTreeSet.add(developer1);
        personTreeSet.add(developer2);
        personTreeSet.add(developer3);
        personTreeSet.add(developer4);
        personTreeSet.add(developer5);

//        personTreeSet.add(recruiter1);
//        personTreeSet.add(recruiter2);
//        personTreeSet.add(recruiter3);
//        personTreeSet.add(recruiter4);
//        personTreeSet.add(recruiter5);


        System.out.println("HashSet");
        System.out.println(personHashSet);
        System.out.println("LinkedHashSet ");
        System.out.println(personLinkedHashSet);
        System.out.println("TreeSet");
        System.out.println(personTreeSet);
    }
}
