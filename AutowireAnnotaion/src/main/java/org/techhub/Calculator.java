package org.techhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {
	@Autowired
	@Qualifier("mul")
	private SetVal setVal;
	private void SetOperation(SetVal setVal)
	{
		this.setVal=setVal;
	}
	public void show()
	{
		System.out.println("Result is:"+setVal.getResult());
	}
}
