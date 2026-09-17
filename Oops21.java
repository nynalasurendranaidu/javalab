import java.util.Scanner;
class A
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		string str = sc.nextLine();
		System.out.println("___String Operations ___");
		System.out.println("length="+str.length());
		System.out.println("character at index 2 ="+str.charAt(2));
		System.out.println("uppercase="+str.touppercase());
		System.out.println("lowercase="+str.tolowercase());
		System.out.println("Trimmed="+str.trim());
		System.out.println("concation="+str.concat("Naidu"));
		System.out.println("substring="+str.substring(0,4));
		System.out.println("contains 'ren'="+str.contains("ren"));
		System.out.println("starts with 'sur'="+str.startsWith('sur'));
		System.out.println("endswith 'ra'="+str.endsWith('ra'));
		System.out.println("Index of 'r'="+str.IndexOf('r'));
		System.out.println("replacedtring="+str.replace('a','x'));
	}
}