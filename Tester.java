public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(4.0);
    RealNumber b = new RealNumber(4.0);
    RealNumber c = new RealNumber(7.0);
    RealNumber d = new RealNumber(4.001);
    RealNumber e = new RealNumber(5.0);

    System.out.println(a.getValue());
    System.out.println(a.add(e));
    System.out.println(a.getValue());
    System.out.println(a.add(d));
    System.out.println(a.toString());
    System.out.println(b.add(e));
    System.out.println(b.getValue());
    System.out.println(a.add(b));
    System.out.println(a.toString());
  }
}
