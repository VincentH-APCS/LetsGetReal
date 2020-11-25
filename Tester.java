public class Tester{
  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2,5);
    RationalNumber b = new RationalNumber(3,0);
    RationalNumber c = new RationalNumber(4,10);
    RationalNumber d = new RationalNumber(1,2);
    RationalNumber e = new RationalNumber(5,9);
    RationalNumber f = new RationalNumber(-2,-4);
    RationalNumber g = new RationalNumber(3,1);
    RationalNumber h = new RationalNumber(6,-10);
    RealNumber tt = new RealNumber(6);
    RealNumber yy = new RealNumber(7);
    RealNumber ty = new RealNumber(6);

    RealNumber pie = new RealNumber(Math.PI);
    RealNumber badpie = new RealNumber(-Math.PI);

    System.out.println(pie.equals(badpie));
    System.out.println(badpie.equals(pie));
  }
}
