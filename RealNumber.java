public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  public boolean equals(RealNumber other){
    if(value == 0 && other.getValue() == 0){
      return true;
    }

    if(((value * 1.001) >= other.getValue()) &&
       ((value * 0.999) <= other.getValue())){
      return true;
    }
    else return false;
  }
  public RealNumber add(RealNumber other){
    value = (value + other.getValue());
    return null;
  }
}
