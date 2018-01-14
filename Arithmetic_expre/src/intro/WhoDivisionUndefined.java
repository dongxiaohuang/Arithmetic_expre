package intro;

public class WhoDivisionUndefined extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WhoDivisionUndefined()
	{
		System.out.println("the right divisor cannot be 0;");
	}
}
