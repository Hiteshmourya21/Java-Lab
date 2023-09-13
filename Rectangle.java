class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(5.0, 8.0);

        double area1 = rectangle1.calculateArea();
        double area2 = rectangle2.calculateArea();

        System.out.println("Area of the first rectangle: " + area1 + " square units");
        System.out.println("Area of the second rectangle: " + area2 + " square units");
    }
}