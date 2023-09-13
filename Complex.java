
 import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    public Complex multiply(Complex other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum of the complex numbers: " + sum);
        System.out.println("Difference of the complex numbers: " + difference);
        System.out.println("Product of the complex numbers: " + product);

        scanner.close();
    }
}