/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Read_Sort;
import main.Sort;

/**
 * @author ASUS-PC
 *
 */
public class test_01 {
	@Test
	public void test_read_sort(){
		Read_Sort read_sort = new Read_Sort();
		ArrayList list = new ArrayList();
		list.add(8);
		list.add(7);
		list.add(9);
		read_sort.setSi(new Sort());
		assertArrayEquals(new int[] {1,2,3},read_sort.Read_Sort(list));
		
	}
}
