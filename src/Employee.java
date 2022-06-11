public class Employee {

    public Employee (String n, String s, String po, Date d, float pa) {
        setName(n);
        setSsn(s);
        setPosition(po);
        setDateOfBirth(d);
        setPay(pa);
    }

    public float raise (float per) {
        pay *=(1 + (per/100));
        return pay;
    }

    public String toString() {
        return "Name: " + this.getName() + "\nSSN: " + this.getSsn() + "\nPosition: " + this.getPosition() +
                "\nDate of Birth: " + this.getDateOfBirth() + "Pay: " + this.getPay() + "\n";
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
