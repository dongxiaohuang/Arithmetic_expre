package intro;

public class Product extends BinaryExpression {

	public Product(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}



	@Override
	public int evaluate() {
		result = x.evaluate() * y.evaluate();
		return result;
	}
	public String toString()
	{
		return x.toString() + "*" + y.toString();
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
