package com.epam.epamtask_tdd_junit;

public class RemoveCharAinFirst2Chars {
	public String remove(String inputString)
	{
		String outputString="";
		if(inputString.charAt(0)=='A'&&inputString.charAt(1)=='A')
		{
			outputString+=inputString.substring(2);
		}
		else if(inputString.charAt(0)=='A')
		{
			outputString+=inputString.substring(1);
		}
		else if(inputString.charAt(1)=='A')
		{
			outputString+=(inputString.substring(0,1)+inputString.substring(2));
		}
		else 
		{
			outputString+=inputString;
		}
		return outputString;
	}
}
