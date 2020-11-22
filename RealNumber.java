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
    if((value * 1000)/1000 == (other.getValue() * 1000)/1000){
      return true;
    }
    else return false;
  }

}
