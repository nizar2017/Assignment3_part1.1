package assignment3_part1.CalcSub;

import assignment3_part1.CalcSub.SubInterface;

public class CalcSub {
	SubInterface intObj;


	public int addTwoNums(int a, int b) {


		return intObj.sub(a, b);

	}


	public void setIntObj(SubInterface mockObj, SubInterface intObj) {

	this.intObj =intObj;

}

}
