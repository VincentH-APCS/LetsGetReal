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
    RationalNumber tt = new RationalNumber(66,100);
    RationalNumber yy = new RationalNumber(77,200);

  System.out.println(a.subtract(b));
  System.out.println(a.subtract(h));
  System.out.println(d.subtract(g));
  System.out.println(tt.subtract(yy));
  System.out.println(h.subtract(a));
  }
}
