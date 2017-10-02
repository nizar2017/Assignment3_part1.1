package assignment3_part1;

public class CalcMulti {
	CalcInterface intObj;


	public int multiTwoNums(int a, int b) {


		return intObj.multi(a, b);

	}


	public void setIntObj(CalcInterface mockObj, CalcInterface intObj) {

	this.intObj =intObj;

}

}
