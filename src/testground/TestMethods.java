/**
 * 
 */
package testground;

/**
 * @author zhangpingcheng
 *
 */
public class TestMethods {
	public TestMethods() {};
	
	public void methodOne() {
		System.out.println("Method one involked.");
	}
	
	public int methodTwo(int n) {
		return n + 2;
	}
	
	public String methodThree(boolean b) {
		return b? "GOOD!": "BAD!";
	}
}
