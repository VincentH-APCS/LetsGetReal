public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(1,9);
    RationalNumber c = new RationalNumber(3,-4);
    RationalNumber d = new RationalNumber(4,0);
    RationalNumber e = new RationalNumber(-5,-15);

    System.out.println(a.reciprocal());
    System.out.println(b.reciprocal());
    System.out.println(c.reciprocal());
    System.out.println(d.reciprocal());
    System.out.println(e.reciprocal());
  
  }
}
