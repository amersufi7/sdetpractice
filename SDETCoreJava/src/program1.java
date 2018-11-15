
public class program1 {

	public static void main(String args[])
	{
		String str="";
		for(int i=0;i<args.length;i++) {
			str=str+args[i];
		}
		String fname=str.substring((str.indexOf("from")+4),(str.indexOf("where")-1));
		System.out.println(fname.trim());
	}
	
}
