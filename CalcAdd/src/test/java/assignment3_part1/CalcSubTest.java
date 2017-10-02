package assignment3_part1;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcSubTest extends TestCase {
	CalcSub obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcSub();
		x = 10;
		y = 5;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.sub(x, y)).thenReturn(x-y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testSubTwoNums() {
		assertEquals(5, obj.subTwoNums(x, y));
	}

}
