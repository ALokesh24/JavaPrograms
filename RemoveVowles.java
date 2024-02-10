package selenium1;

public class RemoveVowles {
	
	
	public static void main(String[] args) {
		
		
		
		String name = "Testleaf";
		
		char[] name2 = name.toCharArray();		
		
		
		for(int i=0;i<name2.length;i++) {
			if(name2[i]=='a'||name2[i]=='e'|| name2[i]=='i'|| name2[i]=='o'|| name2[i]=='u') {
				
				
			}else {
				System.out.print(name2[i]);
			}
		}
		
		
	}

}
