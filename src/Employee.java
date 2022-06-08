public class Employee {
    public Employee () {
        System.out.println("No parameters to create Employee!");
    }
    public Employee (String n, String s, String po, Date d, float pa) {
        ;
    }

    public float raise (float per) {
        return pay;
    }

    public String toString() {
        return "Name: " + this.name + "\nSSN: " + this.ssn + "\nPosition: " + position +
                "\nDate of Birth: " + dateOfBirth + "\nPay: " + pay + "\n";
    }

    public void setName (String n) {
        name = n;
    }
    public void setSsn (String s) {
        ssn = s;
    }
    public void setPosition (String p) {
        position = p;
    }
    public void setDateOfBirth (Date d) {
        dateOfBirth = d;
    }
    public void setPay (float p) {
        pay = p;
    }

    public String getName () {
        return name;
    }
    public String getSsn () {
        return ssn;
    }
    public String getPosition () {
        return position;
    }
    public Date getDateOfBirth () {
        return dateOfBirth;
    }
    public float getPay () {
        return pay;
    }

    private String name;
    private String ssn;
    private String position;
    private Date dateOfBirth;
    private float pay;
}
