package assignment3_part1.CalcDiv;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcDivTest extends TestCase {
	CalcDiv  obj;
	double  x, y;

	protected void setUp() throws Exception {
		obj =new CalcDiv ();
		x = 3.0;
		y = 2.0;
		divInterface mockObj = mock(divInterface.class);
		when(mockObj.div(x, y)).thenReturn(x/y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testdivTwoNums() {
		assertEquals(1.0, obj.divTwoNums(x, y));
	}


}
