public class PTEmployee extends Employee {

    public PTEmployee (String n, String s, String po, Date d, int h, int w) {
        super(n, s, po, d, 0);
        nHours = h;
        wages = w;
        setPay(nHours * wages);
    }

    public float raise (float amount) {
        float p = getPay() + amount;
        setPay(p);
        return p;
    }

    public String toString() {
        super.toString();
        return "nHours: " + getNHours() + "\nwages: " + getWages() + "\n";
    }

    public void setWages (int w) {
        wages = w;
    }
    public void setNHours (int h) {
        nHours = h;
    }

    public int getWages() {
        return wages;
    }
    public int getNHours() {
        return nHours;
    }


    private int nHours;
    private int wages;

}
