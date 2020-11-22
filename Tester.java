public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(4.0);
    RealNumber b = new RealNumber(4.0);
    RealNumber c = new RealNumber(7.0);
    RealNumber d = new RealNumber(4.001);
    RealNumber e = new RealNumber(5.0);

    System.out.println(a.getValue());
    System.out.println(a.subtract(b));
    System.out.println(c.subtract(e));
    System.out.println(e.subtract(c));
  }
}
