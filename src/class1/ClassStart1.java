package class1;

public class ClassStart1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.age = 15;
        student1.name = "학생1";
        student1.grade = 90;

        Student student2 = new Student();
        student2.age = 25;
        student2.name = "학생2";
        student2.grade = 90;

        Student[] students = {student1,student2};
        // iter 
        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적: " + s.grade);
        }

    }
}
