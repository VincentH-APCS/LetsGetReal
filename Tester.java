public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(3,0);
    RationalNumber c = new RationalNumber(4,10);
    RationalNumber d = new RationalNumber(1,2);
    RationalNumber e = new RationalNumber(5,9);
    RationalNumber f = new RationalNumber(-2,-4);

    System.out.println(a.multiply(b));
    System.out.println(a.multiply(c));
    System.out.println(d.multiply(f));
    System.out.println(f.multiply(d));
  }
}
