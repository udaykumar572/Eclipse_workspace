package st;

public class StringMethodsImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1="World";
		String s2="a";
		String s3="e";
		System.out.println("Length od String 1 "+s.length());
		System.out.println("Character at 3 rd position in string 2"+s1.charAt(2));
		System.out.println("Conversion of lower case to upper case of String 1"+s.toUpperCase());
		System.out.println("comparing s and s1 :"+s1.compareTo(s2));
		System.out.println("Checking particular letters are in string are not:"+s1.contains("ld"));
		System.out.println("Checking particular string ending with d "+s1.endsWith("d"));
		System.out.println(s1.concat(s));
		System.out.println(s.isEmpty());
		System.out.println(s3.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		
	}

}