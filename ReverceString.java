package selenium1;

public class ReverceString {
	
	
	
	
	public static void main(String[] args) {
			//Type -1
		String name = "selenium";
		String rev = "";
		char[] name1 =name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			
			rev = rev+name1[i];
		}
		  System.out.println(rev);
		  
		  
		//type -2  

      StringBuffer num = new StringBuffer("java");
			
			num.reverse();
		  System.out.println(num);
		  
		  
		  
		}
	
	
	
	
	
	 

}
