package MVCPatternExample;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sujaya", "22501A4459", "A");

        ViewStudent view = new ViewStudent();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("---- After Update ----");

        controller.setStudentName("Sujaya Raghavi");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
 