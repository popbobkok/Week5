
public class circle {

    private double Radius;
    private String NAME;

    public circle(double Or1, double Or2, double Ra, String name) {
        this.Radius = Ra;
        this.NAME = name;

    }

    public circle(double x1, double y1, double r1, double x2, double y2, double r2) {

        double left = r1 - r2;
        double right = r1 + r2;

        double D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (left < D && right > D) {
            System.out.println("true");

        }
        if (left < D && right < D) {
            System.out.println("false");
        }

    }

    public double getAr() {
        if (this.Radius < 0) {
            this.Radius = 0;
        }
        double Area = (22.0 / 7.0) * (this.Radius * this.Radius);
        System.out.println(this.NAME + "Area : " + Area);

        return Area;
    }

    public double getCir() {

        if (this.Radius < 0) {
            this.Radius = 0;
        }
        double Circumference = (2.0 * (22.0 / 7.0)) * this.Radius;
        System.out.println("    " + this.NAME + "Circumference : " + Circumference);

        return Circumference;
    }

    public double getD() {

        double get = this.Radius;

        return get;
    }

}
