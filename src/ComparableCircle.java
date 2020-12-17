public class ComparableCircle extends Circle implements Comparable<Circle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Circle a) {
        if (getRadius() > a.getRadius()) return 1;
        else if (getRadius() < a.getRadius()) return -1;
        else return 1;
    }
}