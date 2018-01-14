package intro;

/**
 * This class represents a whole number
 */
public class WholeNumber implements Expression , Comparable<Expression>{
  
  private int value;

  public WholeNumber(int val) {
    value = val;
  }

  public String toString() {
    return String.valueOf(value);
  }
  @Override
  public boolean equals(Object obj) { // only this is a override of the supper class
    if (obj == null)                    { return false; }
    if (! (obj instanceof WholeNumber)) { return false; }

    WholeNumber that = (WholeNumber) obj;
    return this.value == that.value;
  }

  public int evaluate() {
    return this.value;
  }

public int compareTo(Expression arg0) {
	
	if(this.value > arg0.evaluate())
	{return 1;}
	if(this.value == arg0.evaluate())
	{return 0;}
	return -1;
}

}
