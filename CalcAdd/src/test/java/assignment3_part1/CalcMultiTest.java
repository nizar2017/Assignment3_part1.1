package assignment3_part1;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;
public class CalcMultiTest extends TestCase {
	CalcMulti obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcMulti();
		x = 10;
		y = 5;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.multi(x, y)).thenReturn(x*y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testMultiTwoNums() {
		assertEquals(50, obj.multiTwoNums(x, y));
	}

}
