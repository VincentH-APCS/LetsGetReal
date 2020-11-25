public class RationalNumber extends Number{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super();
    if(deno == 0 || nume == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
    if(denominator < 0){
      numerator = numerator * -1;
      denominator = denominator * -1;
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
    if (numerator == 0){
      return "0";
    }
    if(denominator == 1){
      return ""+numerator;
    }
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
  int gcd = gcd(numerator, denominator);
   numerator = numerator/gcd;
   denominator = denominator/gcd;
 }
 public RationalNumber multiply(RationalNumber other){
   RationalNumber product = new RationalNumber(
   (this.getNumerator() * other.getNumerator()),
   (this.getDenominator() * other.getDenominator())
   );
   return product;
 }
 public RationalNumber divide(RationalNumber other){
   RationalNumber quotient = new RationalNumber(
   this.getNumerator() * other.getDenominator(),
   this.getDenominator() * other.getNumerator()
   );
   return quotient;
 }
 public RationalNumber add(RationalNumber other){
   RationalNumber sum = new RationalNumber(
   (this.getNumerator() * other.getDenominator())+
   (this.getDenominator() * other.getNumerator()),
   this.getDenominator() * other.getDenominator()
   );
   return sum;
 }
 public RationalNumber subtract(RationalNumber other){
   RationalNumber difference = new RationalNumber(
   (this.getNumerator() * other.getDenominator())-
   (this.getDenominator() * other.getNumerator()),
   this.getDenominator() * other.getDenominator()
   );
   return difference;
 }
}
