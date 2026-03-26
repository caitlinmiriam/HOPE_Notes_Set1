public class RemoveWhitespace
{
	public static void main(String[] args) {
		String s="Hi Guys Hello";
		boolean flag=false;
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch!=' '){
		        System.out.print(ch);
		        flag=false;
		    }
		    else{
		       if(!flag){
		        System.out.print(" ");
		        flag=true;
		        } 
		    }
		}
	}
}
