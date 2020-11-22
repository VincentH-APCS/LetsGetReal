public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
    if(deno < 0){
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else{
      numerator = num;
      denominator = deno;
    }
    super(nume / deno);
  }
public double getValue(){
  return value;
}
}
