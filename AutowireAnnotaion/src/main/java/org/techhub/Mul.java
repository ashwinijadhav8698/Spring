package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mul")
public class Mul implements SetVal{
	@Value("100")
	private int a;
	@Value("200")
	private int b;
	public int getResult()
	{
		return a*b;
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
}
