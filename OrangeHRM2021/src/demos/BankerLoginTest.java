package primusbank.tests;

import primusbank.library.PrimusBankHomePage;
import utils.Apputils;

public class BankerLoginTest 
{

	public static void main(String[] args) 
	{
		
		Apputils.launchApp("http://primusbank.qedgetech.com");

		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res= phome.bankerLogin("SRNagar", "john", "demo");
		if(res)
		{
			System.out.println("Banker Login Test Pass");
		}else
		{
			System.out.println("Banker Login Test Fail");
		}
		
		Apputils.closeApp();
		
	}

}
