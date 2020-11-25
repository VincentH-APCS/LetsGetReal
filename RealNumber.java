public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    super();
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  /*public boolean equals(RealNumber other){
    if(value == 0 && other.getValue() == 0){
      return true;
    }
    if(value == 0 && other.getValue() != 0){
      return false;
    }
    if(value != 0 && other.getValue() == 0){
      return false;
    /
    if( Math.abs(value - other.getValue()) / value < 0.00001 ||
        Math.abs(other.getValue() - value) / value < 0.00001){
      return true;
    }
    else return false;
  } */
  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(value + other.getValue());
    return sum;
  }
  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(value * other.getValue());
    return product;
  }
  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(value / other.getValue());
    return quotient;
  }
  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(value - other.getValue());
    return difference;
  }
}
/ :]
