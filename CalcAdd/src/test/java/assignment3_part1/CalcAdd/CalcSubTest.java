package assignment3_part1.CalcAdd;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcSubTest extends TestCase {
	CalcSub  obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcSub ();
		x = 10;
		y = 7;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x-y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(3, obj.subTwoNums(x, y));
	}


}
