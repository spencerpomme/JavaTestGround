/**
 * 
 */
package testground;

/**
 * @author zhangpingcheng
 *
 * @param <T> type parameter of the abstract function of the functional interface
 * @param <U> type parameter of the abstract function of the functional interface
 */
public interface FunctionWrapper<T, U> {
	/**
	 * @param t is of type T
	 * @return a type U object
	 */
	U function(T t);
}
