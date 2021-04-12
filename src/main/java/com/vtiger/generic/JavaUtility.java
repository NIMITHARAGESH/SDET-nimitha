package com.vtiger.generic;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	/**
	/@author Nimitha
	 
	 *generate random number
	 * @return 
	 *@return randomnumber till 10000
	 */
	public int createRandomNumber()
	{
		Random r=new Random();
		int randomnumber = r.nextInt();
		return randomnumber;
	}
	
	/**
	 * @author adi123
	 * provide current month
	 * @return 
	 * @return currentmonth
	 */
	
	public int getCurrentMonth()
	{
		Date dateobj=new Date();
		int month = dateobj.getMonth();
		return month;
	}
	
	/**
	 * @author aditya
	 * provide current system date
	 * @return 
	 * @return currentsysDate
	 */
	public String getCurrentSystemDate()
	{
		
		Date dateobj=new Date();
		String currentsysdate = dateobj.toString();
		return currentsysdate;
	}
	
	/**
	 * @author amrita
	 * current date
	 * @return 
	 * @return date
	 */
	
	public String getDate()
	{
		Date dateobj=new Date();
		String currentsysdate = dateobj.toString();
		
		String arr[]=currentsysdate.split(" ");
		return arr[2];
	}

}
