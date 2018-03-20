public class Faculty extends Person {
    protected String Rank; // instructor, assistant, associate, full
    protected String Type; // full-time or part-time

    public Faculty(String fname, String lname, String email, String rank, String type) {
        super(fname, lname, email); // to call the super call constructor
        Rank = rank;
        Type = type;
    }

    @Override
    protected void Display() {
        System.out.println("Faculty information is below:");
        super.Display();
        System.out.printf("Rank: %s\nType: %s\n", Rank, Type);
    }
}