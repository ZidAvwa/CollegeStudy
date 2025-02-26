public class Triangle27 {
    public int base, height;

    public Triangle27(int a, int t) {
        base = a;
        height = t;
    }

    public double countArea() {
        return 0.5 * base * height;
    }
    
    public double countPerimeter() {
        double side = Math.sqrt((base / 2.0) * (base / 2.0) + height * height);
        return base + 2 * side;
    }
}
