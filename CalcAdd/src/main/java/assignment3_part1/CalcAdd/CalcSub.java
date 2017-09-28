package assignment3_part1.CalcAdd;

public class CalcSub {
	CalcInterface intObj;


	public int subTwoNums(int a, int b) {


		return intObj.sub(a, b);

	}


	public void setIntObj(CalcInterface mockObj, CalcInterface intObj) {

	this.intObj =intObj;
	}

}
