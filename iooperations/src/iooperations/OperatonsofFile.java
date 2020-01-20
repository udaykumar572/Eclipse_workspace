package iooperations;
import java.io.*;
public class OperatonsofFile {
	public static void main(String ar[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("d:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success..");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		try {
			FileInputStream fin=new FileInputStream("d:\\testout.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		}



