
public class program2 {


	public static void main(String args[])
	{
		String str="";
		for(int i=0;i<args.length;i++) {
			str=str+args[i];
		}
		String fname=str.substring(0,(str.indexOf("where")));
		System.out.println(fname.trim());
	}
	


}
