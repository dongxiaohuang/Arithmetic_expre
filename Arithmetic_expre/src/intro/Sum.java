package intro;

public class Sum extends BinaryExpression {

	public Sum(Expression exp1, Expression exp2) {
		super(exp1, exp2);
		// TODO Auto-generated constructor stub
	}

	public int evaluate()
	{
		result = x.evaluate() + y.evaluate();
		return result;
	}

	public String toString()
	{
		return "(" + x.toString() + "+" + y.toString()+ ")";
	}

	public int compareTo(Expression arg0)
	{
		if(this.evaluate() > arg0.evaluate())
		{return 1;}
		if(this.evaluate() == arg0.evaluate())
		{return 0;}
		return -1;
	}
	
	
}
