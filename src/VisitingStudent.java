public class VisitingStudent extends Student {
    protected String HomeUniversity;

    public VisitingStudent(String fname, String lname, String email, String major, int id, String HomeUniv) {
        super(fname, lname, email, major, id);
        HomeUniversity = HomeUniv;
    }// end of method

    @Override
    protected void Display() {
        super.Display();
        System.out.printf("Home University: %s\n", HomeUniversity);
    }// end of method
}// end of class
