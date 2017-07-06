/**
 * 
 */
package testground;
import java.util.function.Function;
import java.util.function.IntFunction;
/**
 * @author zhangpingcheng
 *
 */
public class Ground {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestMethods newtest = new TestMethods();
		Ground.callTestMethod(newtest::methodTwo, 3);
		Ground.callTestMethod(newtest::methodThree, true);
		Ground.callThroughInterface(newtest::methodTwo, 3);
		Ground.callThroughInterface(val -> val + 2, 2);
		Ground.callThroughInterface(bool -> bool? "Good!": "BAD!", true);
		
		// lambda expressions must be assigned to a functional interface: functional interface is a type.
		IntFunction<Integer> x = (int a) -> a + 2;
		System.out.println("Another test: " + x.apply(10));
		
		
	}
	
	public static <T, U> void callTestMethod(Function<T, U> func, T arg) {
		U res = func.apply(arg);
		System.out.println("[1] The result is " + res + ".");
	}
	
	public static <T, U> void callThroughInterface(FunctionWrapper<T, U> func, T arg) {
		U res = func.function(arg);
		System.out.println("[2] The result is " + res + ".");
	}
	
	public static int arbitraySum(int... nums) {
	    int res = 0;
	    for (int num: nums)
	        res += num;
	    return res;
	}
	
	// test method for wildcard generic type
	public static void mimaxBonus(Manager[] a, Pair<? super Manager> result) {
	    if (a.length == 0) return;
	    Manager min = a[0];
	    Manager max = a[0];
	    for (int i = 1; i < a.length; i++) {
	        if (min.getBonus() > a[i].getBonus()) min = a[i];
	        if (max.getBonus() < a[i].getBonus()) max = a[i];
	    }
	    result.setFirst(min);
	    result.setSecond(max);
	    
	}

}
