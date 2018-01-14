package intro;

public abstract class BinaryExpression implements Expression{
	
	protected Expression x;
	protected Expression y; 
	protected int result;
	public BinaryExpression(Expression exp1, Expression exp2)
	{
		x = exp1;
		y = exp2;
	}
	abstract public int evaluate() ;
	
}
