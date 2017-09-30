package assignment3_part1.CalcSub;
import static org.mockito.Mockito.*;

import assignment3_part1.CalcSub.CalcSub;
import assignment3_part1.CalcSub.SubInterface;
import junit.framework.TestCase;

public class CalcSubTest extends TestCase {
	CalcSub  obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcSub ();
		x = 10;
		y = 5;
		SubInterface mockObj = mock(SubInterface.class);
		when(mockObj.sub(x, y)).thenReturn(x-y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(5, obj.addTwoNums(x, y));
	}

}



