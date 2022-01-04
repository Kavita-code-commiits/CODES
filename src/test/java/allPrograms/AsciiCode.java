package allPrograms;

public class AsciiCode {
	
	
	public static void main(String[] args) {
		
		
	String str="Kavita Thakur";
	int size=str.length();
	 char[]ch=new char[size];
	 for (int i=0;i<size;i++)
	 {
		 ch[i]=str.charAt(i); 
	 }
	 int m=0;
	 for (int i=0;i<size;i++)
	 {
		 for(int j=0;j<size;j++)
		 {
			 
			 
			 if(ch[i]==str.charAt(j))
			 {
				m+=1; 
			 }
			 
		 }
			
			 
		 System.out.println(ch[i]+"is repeated"+m+"times"); 
		 
		 m=0;
		 
		 
			 
	 }
	 }
	} 
				 
	
