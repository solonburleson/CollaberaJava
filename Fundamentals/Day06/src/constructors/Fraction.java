package constructors;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this(0,1);
	}
	
	public Fraction(int x) {
		this(x,1);
	}
	
	public Fraction(Fraction frac) {
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int compute() {
		return getNumerator()/getDenominator();
	}
}
