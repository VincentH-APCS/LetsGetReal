public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(3,0);
    RationalNumber c = new RationalNumber(4,10);
    RationalNumber d = new RationalNumber(12,14);
    RationalNumber e = new RationalNumber(5,9);
    RationalNumber f = new RationalNumber(-2,7);

    System.out.println(RationalNumber.gcd(210,45));
    System.out.println(RationalNumber.gcd(45,210));
    System.out.println(RationalNumber.gcd(7,2));
    System.out.println(RationalNumber.gcd(10,30));
  }
}
