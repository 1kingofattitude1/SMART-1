import java.io.*;
import java.util.*;
import get_csv_data.CSV_CONNECT;

class CSV_CONNECT_TEST
{
	public static void main(String [] args)throws FileNotFoundException
	{
		CSV_CONNECT cc= new CSV_CONNECT();
		ArrayList<String> al= new ArrayList<String>();
		al=cc.GET_CSV_DATA("C:/Users/user/Desktop/polio.csv");
		System.out.println(al);
	}
}