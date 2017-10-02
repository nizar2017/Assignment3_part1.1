package assignment3_part1;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcAddTest extends TestCase {
	CalcAdd obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new CalcAdd();
		x = 10;
		y = 5;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(15, obj.addTwoNums(x, y));
	}

}
