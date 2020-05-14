public class Fraction {
    private int numerator, denominator;

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
        if (denominator != 0){
            this.denominator = denominator;
        }
        else this.denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        if (denominator != 0){
            this.denominator = denominator;
        }
        else this.denominator = 1;

        this.numerator = numerator;
    }
    Fraction(Fraction f) {
        this.numerator = f.getNumerator();
        this.denominator = f.getDenominator();
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b , a % b);
    }

    public Fraction reduce() {
        int div = gcd(numerator, denominator);
        if (numerator != 0) {
            this.numerator /= div;
            this.denominator /= div;
        }
        return this;
    }

    public Fraction add(Fraction f) {
        numerator = numerator * f.getDenominator() + f.getNumerator() * denominator;
        denominator *= f.getDenominator();
        return this;
    }

    public Fraction subtract(Fraction f) {
        numerator = numerator * f.getDenominator() - f.getNumerator() * denominator;
        denominator *= f.getDenominator();
        return this;
    }

    public Fraction multiply(Fraction f) {
        numerator *= f.getNumerator();
        denominator *= f.getDenominator();
        return this;
    }

    public Fraction divide(Fraction f) {
        if ((this. denominator != 0) && (f.denominator != 0) && (f.numerator != 0)) {
            numerator *= f.getDenominator();
            denominator *= f.getNumerator();
        }
        return this;
    }


}
