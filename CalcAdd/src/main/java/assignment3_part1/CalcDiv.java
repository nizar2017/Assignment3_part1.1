package assignment3_part1;

public class CalcDiv {
	CalcInterface intObj;


	public double divTwoNums(int a, int b) {


		return intObj.div(a, b);

	}


	public void setIntObj(CalcInterface mockObj, CalcInterface intObj) {

	this.intObj =intObj;

}

}
