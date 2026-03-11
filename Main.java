import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ali");
        students.add("Sara");
        System.out.println("Студенттер: " + students);

        students.add("Nurlan");
        System.out.println("Жаңартылған тізім: " + students);
    }
}