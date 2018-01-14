package tk106;

import intro.Expression;
import intro.Sum;
import intro.Product;
import intro.WholeNumber;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Map;

/**
 * This program creates and evaluates some arithmetic expressions
 */
public class ExpressionProg {

	private static final int LENGTH = 10;

	public static void main(String[] args) {

		Expression first = new WholeNumber(5);
		System.out.print("The first number is ");
		System.out.println(first);

		Expression second = new WholeNumber(5);
		System.out.print("The second number is ");
		System.out.println(second);

		System.out.print("The first object is ");
		String equal = first == second ? "equal" : "not equal";
		System.out.println(equal + "to the second\n");

		System.out.print("The first number is ");
		equal = first.equals(second) ? "equal" : "not equal";
		System.out.println(equal + " to the second\n");

		System.out.println();
		System.out.println("Creating array of Expressions ...");

		Expression[] nums = new Expression[LENGTH];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new WholeNumber((int) (Math.random() * 100));
		}

		System.out.println("The numbers are" + java.util.Arrays.toString(nums));

		Arrays.sort(nums);
		System.out.println("After sorting, the numbers are"
				+ Arrays.toString(nums));

		LinkedList<Expression> linkednums = new LinkedList<Expression>(); 
		Map<Integer, LinkedList<Expression>> map = new HashMap<Integer, LinkedList<Expression>>();
		do {
			linkednums.add(randomExpression(4));
		} while (Math.random() < 0.95);
		ListIterator<Expression> listitor = null;
		listitor = linkednums.listIterator();
		Expression e;
		while (listitor.hasNext()) {
			e = listitor.next();
			int last_digit = e.evaluate() % 10;
			if(map.containsKey(last_digit))
			{
				map.get(last_digit).add(e);
			}else
			{
				LinkedList<Expression> ll = new LinkedList<Expression>();
				ll.add(e);
				map.put(last_digit, ll);
			}
		}
		for(Integer key: map.keySet())
		{
			System.out.println("Expression with value ending in " );
			ListIterator<Expression> it = map.get(key).listIterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
	}

	public static Expression randomExpression(int maxDepth) {
		int ran1, ran2;
		Random rd = new Random();
		Expression randomExpression = null;
		Expression nextExpression = null;
		ran1 = rd.nextInt(100);
		randomExpression = new WholeNumber(ran1);
		while (maxDepth > 1) {
			ran2 = rd.nextInt(10);
			Expression randomExpression2 = new WholeNumber(ran2);
			if (maxDepth > 1)
				if (ran2 % 2 == 0) {
					randomExpression = new Sum(randomExpression,
							randomExpression2); // important to add new
				} else {
					randomExpression = new Product(randomExpression,
							randomExpression2);
				}
			maxDepth--;

		}

		return randomExpression;

	}
}
