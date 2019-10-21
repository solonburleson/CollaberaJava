package complexconstructors;

public class Complex {
	private double real, imag;
	
	public Complex(double re, double im) {
		setReal(re);
		setImag(im);
	}
	
	public Complex(Complex c) {
		System.out.println("Copy constructor called!");
		setReal(c.getReal());
		setImag(c.getImag());
//		real = c.real;
//		imag = c.imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return "(" + getReal() + " + " + getImag() + "i)";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Complex complex = (Complex) obj;
		return (getReal() == complex.getReal() && getImag() == complex.getImag());
	}
}
