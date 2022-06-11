public class PTEmployee extends Employee {

    public PTEmployee (String n, String s, String po, Date d, float h, float w) {
        super(n, s, po, d, 0);
        setNHours(h);
        setWages(w);
        setPay(nHours * wages);
    }

    public float raise (float amount) {
        float p = getPay() + amount;
        setPay(p);
        return p;
    }

    public String toString() {
        return super.toString() + "nHours: " + this.getNHours() + "\nwages: " + this.getWages() + "\n";
    }

    public void setWages (float w) {
        wages = w;
    }
    public void setNHours (float h) {
        nHours = h;
    }

    public float getWages() {
        return wages;
    }
    public float getNHours() {
        return nHours;
    }


    private float nHours;
    private float wages;

}
