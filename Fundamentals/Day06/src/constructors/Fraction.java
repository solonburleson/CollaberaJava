package constructors;
/**
 * class to deal with fractions
 * @author Solon
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;
	
	/**
	 * Default constructor, creates 0/1
	 */
	
	public Fraction() {
		this(0,1);
	}
	
	/**
	 * One parameter constructor, creates number/1
	 * @param x integer number input
	 */
	
	public Fraction(int x) {
		this(x,1);
	}
	
	/**
	 * Takes a Fraction object and creates a new Fraction object
	 * @param frac Fraction object
	 */
	
	public Fraction(Fraction frac) {
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	/**
	 * Takes in two int, a numerator and denominator, and creates a new Fraction
	 * @param num integer number input
	 * @param denom integer number input
	 */
	
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/**
	 * Get method for the numerator of Fraction object
	 * @return numerator integer stored in numerator
	 */
	
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Takes in an int value and sets the numerator of a Fraction object
	 * @param numerator integer input for the desired numerator value
	 */
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/**
	 * Returns value of denominator stored in Fraction object
	 * @return denominator integer value stored in denominator
	 */
	
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * Takes in a int and sets the denominator of Fraction object
	 * @param denominator integer input for the desired denominator value
	 */
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**
	 * Computes the fraction
	 * 
	 * @return numerator/denominator 
	 */
	public int compute() {
		return getNumerator()/getDenominator();
	}
	
	
}
