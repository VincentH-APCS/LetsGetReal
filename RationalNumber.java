public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if(deno == 0 || nume == 0){
      numerator = 0;
      denominator = 1;
    }
    else if(deno < 0){
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
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
  public String toString(){
    return ""+numerator+"/"+denominator;
  }
  private static int gcd(int a, int b){
     int c = 0;
    if(b > a){
      c = a;
      a = b;
      b = c;
    }
    for(int i = 0; i < 1;){
      if(a % b == 0){
        return b;
      }
      else
        c = a;
        a = b;
        b = c % b;
    }
    return b;
  }
private void reduce(){
   numerator = numerator / gcd(numerator, denominator);
   denominator = denominator / gcd(numerator, denominator);
 }
 public RationalNumber multiply(RationalNumber other){
   RationalNumber product = new RationalNumber(
   numerator * other.getNumerator(), denominator * other.getDenominator()
   );
   return product;
 }
}
