public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(1,9);
    RationalNumber c = new RationalNumber(3,-4);
    RationalNumber d = new RationalNumber(4,0);
    RationalNumber e = new RationalNumber(-5,-15);

    System.out.println(a.getNumerator());
    System.out.println(a.getDenominator());
    System.out.println(c.getNumerator());
    System.out.println(c.getDenominator());
    System.out.println(d.getNumerator());
    System.out.println(d.getDenominator());
    
    /*System.out.println(a.getValue());
    System.out.println(b.getValue());
    System.out.println(c.getValue());
    System.out.println(d.getValue());
    System.out.println(e.getValue());*/
  }
}
