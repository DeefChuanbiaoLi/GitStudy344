/**
 * 
 */
package main;

import java.util.Arrays;

/**
 * @author ASUS-PC
 *
 */
public class Sort implements Sort_Interface{

	/* (non-Javadoc)ASUS-PC上午10:27:48
	 * @see main.Sort_Interface#Sort()
	 */
	@Override
	public int[] Sort(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		int[] array_ret = new int[array.length];
		for(int i = 0;i<array.length;i++) {
			array_ret[i] =array[array.length-i-1];
		}
		return array_ret;
	}

}
