public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other){
    if(this.getValue() < other.getValue()){
      return -1;
    }
    else if(this.getValue() > other.getValue()){
      return 1;
    }
    return 0;
  }
public boolean equals(Number other){
    if(this.getValue() == 0 && other.getValue() == 0){
      return true;
    }
    if(this.getValue() == 0 && other.getValue() != 0){
      return false;
    }
    if(this.getValue() != 0 && other.getValue() == 0){
      return false;
    }
    if( Math.abs(this.getValue() - other.getValue()) / Math.abs(this.getValue()) < 0.00001 ||
        Math.abs(other.getValue() - this.getValue()) / Math.abs(this.getValue()) < 0.00001){
      return true;
    }
    else return false;
  }

}
// :]
