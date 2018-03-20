public class Student extends Person {
    protected int BannerID;
    protected String major;

    public Student(String fname, String lname, String email, String major, int id) {
        super(fname, lname, email); // constructor call to super class must be the first statement

        this.major = major;
        BannerID = id;
    }

    @Override
    protected void Display() {
        System.out.println("Student information is below:");
        super.Display(); // this will call the Display method in the super class (Person)
        System.out.println("ID: " + BannerID);
        System.out.println("Major: " + major);
    }
}
