package assignment3_part1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class CalcDivTest extends TestCase {
	CalcDiv obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcDiv();
		x = 5;
		y = 2;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.div(x, y)).thenReturn((double) x/y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testdivTwoNums() {
		assertEquals(2.5, obj.divTwoNums(x, y));
	}


}
