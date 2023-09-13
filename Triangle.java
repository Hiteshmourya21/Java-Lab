class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        // Default constructor with no parameters
        side1 = 3.0;
        side2 = 4.0;
        side3 = 5.0;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        double perimeter = triangle.calculatePerimeter();
        double area = triangle.calculateArea();

        System.out.println("Perimeter of the triangle: " + perimeter + " units");
        System.out.println("Area of the triangle: " + area + " square units");
    }
}