package ComplexOperations;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber parameter){
        this.real+=parameter.getReal();
        this.imaginary+=parameter.getImaginary();
    }
    public void subtract (double real, double imaginary){
        this.real-= real;
        this.imaginary-= imaginary;
    }
    public void subtract(ComplexNumber other){
        this.real-=other.getReal();
        this.imaginary-=other.getImaginary();
    }
}
