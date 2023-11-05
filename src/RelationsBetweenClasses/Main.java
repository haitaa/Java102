package RelationsBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Haita", "123", "Kocaeli", 100);
        Student st2 = new Student("Patika", "Dev", "1234", "Kocaeli", 110);
        Student st3 = new Student("Java", "Dev", "12345", "Kocaeli", 80);

        Instructor teacher = new Instructor("Mahmut", "Çetindağ", "CENG");
        Course mat = new Course("MAT101", "MAT", teacher);

        System.out.println(mat.getInstructor().getName());

        Student[] stu = {st1, st2, st3};
        System.out.println("Ortalama: " + mat.calcAvg(stu));
    }
}
