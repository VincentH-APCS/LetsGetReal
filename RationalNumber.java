public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if(deno < 0){
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
  }
  public double getValue(){
    return (double)numerator / (double)denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    RationalNumber newone = new RationalNumber(denominator, numerator);
    return newone;
  }
  public boolean equals(RationalNumber other){
    if (numerator == other.getNumerator()
      && denominator == other.getDenominator()){
        return true;
      }
      else return false;
  }
}
