package assignment3_part1.CalcMulti;
import static org.mockito.Mockito.*;

import assignment3_part1.CalcMulti.CalcMulti;
import assignment3_part1.CalcMulti.MultiInterface;
import junit.framework.TestCase;

public class CalcMultiTest extends TestCase {
	CalcMulti  obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcMulti ();
		x = 5;
		y = 4;
		MultiInterface mockObj = mock(MultiInterface.class);
		when(mockObj.multi(x, y)).thenReturn(x*y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(20, obj.multiTwoNums(x, y));
	}
}
