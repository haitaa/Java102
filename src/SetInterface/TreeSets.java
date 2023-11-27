package SetInterface;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 40));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 65));

        for(Student student : students) {
            System.out.println(student.getName());
        }
    }
}
