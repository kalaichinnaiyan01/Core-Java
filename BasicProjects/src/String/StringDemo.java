package String;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str = "good ";
		System.out.println(str);
		
		String str2 = "morning";
		str2.concat(str2);
		System.out.println(str2);
		
		String str3 = str.concat("Evening");
		System.out.println(str3);
		
		//StringBuffer
		StringBuffer strBuff = new StringBuffer("Hiiii ");   
		strBuff.append("Guys");
		System.out.println(strBuff);
		
		//StringBuilder
		StringBuilder strBuild = new StringBuilder("kalai ");
		strBuild.append("magal");
		System.out.println(strBuild);
	}

}
