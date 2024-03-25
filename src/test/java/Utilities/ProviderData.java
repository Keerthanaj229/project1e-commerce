package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ProviderData {
	@DataProvider(name="loginData")
	public String[][]getData() throws IOException
	{
		String path=".\\TestData\\Opencart_LoginData.xlsx";
		
		ExcelUtilities a= new ExcelUtilities(path);
		int totalrows=a.getRowCount("Sheet1");
		int totalcols=a.getCellCount("Sheet1",1);
		String loginData[][]= new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=a.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
	
	}
}
