package platterapplication;

public class Operations {

    private Platter platter1;
    private Platter platter2;
    private Platter platter3;

    public Operations(Platter platter1, Platter platter2, Platter platter3) {
        this.platter1 = platter1;
        this.platter2 = platter2;
        this.platter3 = platter3;
    }

    public double getMaterial() {
        return (platter1.plate() + platter2.plate() + platter3.plate()) * 0.92;
    }
}
