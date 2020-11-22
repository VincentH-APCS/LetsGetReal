public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(4.0);
    RealNumber b = new RealNumber(4.0);
    RealNumber c = new RealNumber(7.0);
    RealNumber d = new RealNumber(4.001);
    RealNumber e = new RealNumber(5.0);

    System.out.println(a.getValue());
    System.out.println(e.getValue());
    System.out.println(c.toString());
    System.out.println(d.toString());
    System.out.println(a.equals(b));
    System.out.println(b.equals(c));
    System.out.println(a.equals(d));
  }
}
