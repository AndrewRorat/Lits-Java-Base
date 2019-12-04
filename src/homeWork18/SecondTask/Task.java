package homeWork18.SecondTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task {
    private Integer title;
    private LocalDate creationDate;
    private Type type;
    private String tags;

    public Task(Integer title, LocalDate creationDate, Type type, String tags) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
        this.tags = tags;
    }

    public Task() {

    }

    public Integer getTitle() {
        return title;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }


    public Type getType() {
        return type;
    }


    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) &&
                Objects.equals(creationDate, task.creationDate) &&
                type == task.type &&
                Objects.equals(tags, task.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, creationDate, type, tags);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", creationDate= " + creationDate +
                ", type= " + type +
                ", tags= " + tags +
                '}';
    }

    public static void dateSort(ArrayList<Task> task) {
        task.stream().filter(t -> Type.READING.equals(t.getType()))
                .sorted((o1, o2) -> o1.getCreationDate()
                        .compareTo(o2.creationDate))
                .forEach(System.out::println);
    }

    public static void uniqueTitles(ArrayList<Task> task) {
        task.stream().map(m -> m.title).distinct().forEach(System.out::println);
    }

    public static void top10Titles(ArrayList<Task> task) {
        task.stream().sorted((o1, o2) -> -o1.getCreationDate().compareTo(o2.getCreationDate()))
                .limit(10).forEach(System.out::println);

    }

    public static void countReadTasks(ArrayList<Task> task) {
        long count = task.stream().filter(t -> t.type.equals(Type.READING)).count();
        System.out.println(count);
    }

    public static void uniqueTags(ArrayList<Task> task) {
        task.stream().map(Task::getTags).distinct().forEach(System.out::println);
    }

    public static void uniqueBookTag(ArrayList<Task> task) {
        task.stream().filter(t -> t.getTags().equals("book")).filter(t -> t.getType().equals(Type.READING))
                .distinct().forEach(System.out::println);
    }

    public static void summary(ArrayList<Task> task) {
        List<Integer> list = task.stream().map(Task::getTitle).collect(Collectors.toList());
        List<String> sum = list.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println(sum);
    }

    public static ArrayList<Task> taskList() {
        var tasks = new ArrayList<Task>();
        tasks.add(new Task(1, LocalDate.of(2019, 11, 25), Type.NEW, "qwer"));
        tasks.add(new Task(2, LocalDate.of(2019, 12, 30), Type.DONE, "asdf"));
        tasks.add(new Task(3, LocalDate.of(2019, 10, 26), Type.NEW, "xcvb"));
        tasks.add(new Task(4, LocalDate.of(2019, 10, 24), Type.READING, "kjhf"));
        tasks.add(new Task(5, LocalDate.of(2019, 7, 23), Type.NEW, "kmpor"));
        tasks.add(new Task(6, LocalDate.of(2019, 5, 12), Type.NEW, "book"));
        tasks.add(new Task(7, LocalDate.of(2019, 12, 13), Type.NEW, "moie"));
        tasks.add(new Task(8, LocalDate.of(2019, 11, 28), Type.DONE, "uinfa"));
        tasks.add(new Task(9, LocalDate.of(2019, 11, 30), Type.READING, "mkovl"));
        tasks.add(new Task(10, LocalDate.of(2019, 11, 20), Type.DONE, "pohjt"));
        tasks.add(new Task(11, LocalDate.of(2019, 12, 4), Type.READING, "book"));
        tasks.add(new Task(12, LocalDate.of(2019, 11, 3), Type.DONE, "gjyj"));
        tasks.add(new Task(13, LocalDate.of(2019, 11, 2), Type.NEW, "rth6"));
        tasks.add(new Task(14, LocalDate.of(2019, 11, 24), Type.READING, "pohfre"));
        tasks.add(new Task(15, LocalDate.of(2019, 11, 30), Type.DONE, "resgl"));
        tasks.add(new Task(16, LocalDate.of(2019, 1, 28), Type.NEW, "pohjtrgt"));
        tasks.add(new Task(17, LocalDate.of(2019, 11, 19), Type.NEW, "pohjtgred"));
        tasks.add(new Task(18, LocalDate.of(2019, 11, 18), Type.NEW, "pohjtgrs"));
        tasks.add(new Task(19, LocalDate.of(2019, 2, 16), Type.DONE, "jrsft"));
        tasks.add(new Task(20, LocalDate.of(2019, 11, 17), Type.NEW, "pohjkuyft"));
        tasks.add(new Task(21, LocalDate.of(2019, 11, 15), Type.READING, "book"));
        tasks.add(new Task(22, LocalDate.of(2019, 5, 21), Type.DONE, "book"));
        tasks.add(new Task(23, LocalDate.of(2019, 6, 22), Type.NEW, "nfeiff"));
        tasks.add(new Task(22, LocalDate.of(2019, 11, 25), Type.NEW, "nkefew"));
        tasks.add(new Task(25, LocalDate.of(2019, 11, 23), Type.DONE, "bniskd"));
        tasks.add(new Task(26, LocalDate.of(2019, 11, 5), Type.NEW, "nvkred"));
        tasks.add(new Task(27, LocalDate.of(2019, 11, 1), Type.READING, "fvner"));
        return tasks;
    }
}