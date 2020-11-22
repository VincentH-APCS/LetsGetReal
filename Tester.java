public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(3,0);
    RationalNumber c = new RationalNumber(4,10);
    RationalNumber d = new RationalNumber(1,2);
    RationalNumber e = new RationalNumber(5,9);
    RationalNumber f = new RationalNumber(-2,-4);
    RationalNumber g = new RationalNumber(3,10);
    RationalNumber h = new RationalNumber(6,-10);

    System.out.println(a.multiply(b));
    System.out.println(a.multiply(c));
    System.out.println(d.multiply(f));
    System.out.println(f.multiply(d));
    System.out.println(a.multiply(h));
    System.out.println(a.getNumerator());
    System.out.println(a.getDenominator());
    System.out.println(h.getNumerator());
    System.out.println(h.getDenominator());
    System.out.println(h.getValue());
    System.out.println(g.divide(h));
    System.out.println(a.divide(c));
    System.out.println(d.divide(f));
    System.out.println(f.divide(d));
    System.out.println(g.divide(e));
  }
}
