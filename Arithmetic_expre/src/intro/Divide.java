package intro;

public class Divide extends BinaryExpression {

	public Divide(Expression exp1, Expression exp2) throws WhoDivisionUndefined {
		super(exp1, exp2);
		if(exp2.evaluate() == 0)
			throw new WhoDivisionUndefined();
	}

	public int compareTo(Expression arg0) {
		
		if(arg0.evaluate() > this.evaluate() )
			return -1;
		if(arg0.evaluate() < this.evaluate())
			return 1;
		return 0;
	}

	@Override
	public int evaluate() {
		
		return x.evaluate() / y.evaluate();
	}
	public String toString()
	{
		return "(" +x.toString()+" / "+ y.toString() +")";
	}

}
