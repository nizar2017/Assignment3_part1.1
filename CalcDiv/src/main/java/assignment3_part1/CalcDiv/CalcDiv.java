package assignment3_part1.CalcDiv;

import assignment3_part1.CalcDiv.divInterface;

public class CalcDiv {
	divInterface doubleObj;


	public double divTwoNums(double a, double b) {


		return doubleObj.div(a, b);

	}


	public void setIntObj(divInterface mockObj, divInterface doubleObj) {

	this.doubleObj =doubleObj;

}
	

}
