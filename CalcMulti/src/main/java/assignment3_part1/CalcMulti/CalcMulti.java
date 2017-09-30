package assignment3_part1.CalcMulti;

import assignment3_part1.CalcMulti.MultiInterface;

public class CalcMulti {
	MultiInterface intObj;


	public int multiTwoNums(int a, int b) {


		return intObj.multi(a, b);

	}


	public void setIntObj(MultiInterface mockObj, MultiInterface intObj) {

	this.intObj =intObj;

}


}
