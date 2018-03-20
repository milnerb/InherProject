public class Person {
    protected String FName;
    protected String LName;
    protected String eMail;

    public Person() {
        FName = "";
        LName = "";
        eMail = "";

    }

    public Person(String fName, String lName, String email) {
        FName = fName;
        LName = lName;
        eMail = email;
    }

    protected void Display() {
        System.out.println("First Name: " + FName);
        System.out.println("Last Name: " + LName);
        System.out.println("Email: " + eMail);
    }
}
