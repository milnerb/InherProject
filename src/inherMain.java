public class inherMain {

    public static void main(String[] args) {

        String p1Fname = "Lisa", p1Lname = "Lee", p1Email = "LLee@nsuok.edu";
        Person p1 = new Person(p1Fname, p1Lname, p1Email);
        String StFname = "Mike", StLname = "Moon", StEmail = "MMoon@nsuok.edu", StMajor = "CS";
        String vStFname = "Blaze", vStLname = "Milner", vStEmail = "milnerb@nsuok.edu", vStMajor = "Computer Science";
        int StId = 3456789;
        int vStId = 3456123;

        p1.Display();
        System.out.println();

        Student stud1 = new Student(StFname, StLname, StEmail, StMajor, StId);
        stud1.Display();
        System.out.println();

        Faculty faculty1 = new Faculty("Rad", "Alrifai", "alrifai@nsuok.edu", "Associate", "Full-Time");
        faculty1.Display();
        System.out.println();

        VisitingStudent vs1 = new VisitingStudent(vStFname, vStLname, vStEmail, vStMajor, vStId, "University of London");
        vs1.Display();
    }
}
