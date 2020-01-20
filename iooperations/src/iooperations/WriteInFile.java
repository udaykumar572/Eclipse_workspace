package iooperations;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class WriteInFile {
public static void main(String ar[])
{
	try
	{
		Student s1=new Student(211,"hepsa");
		FileOutputStream fout=new FileOutputStream("d:\\fab.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Success....");
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
