package javapgrm;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mahend";
		String strrev="";
		for(int i =str.length();i>=0;i--){//	for(int i =str.length()-1;i>=0;i--)
			strrev = strrev+str.charAt(i);
		}
		System.out.println("string before reversed:"+str+ "string after reversed:"+strrev);
	}

}
