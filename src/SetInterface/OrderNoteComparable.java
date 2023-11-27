package SetInterface;

import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getNote() - student1.getNote();
    }
}
