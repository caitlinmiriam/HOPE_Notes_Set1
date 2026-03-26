public class ReverseWords
{
	public static void main(String[] args) {
		String s="Hi Guys Hello";
		int j=s.length()-1;
	    for(int i=s.length()-1;i>=0;i--){
	        char ch=s.charAt(i);
	        if(ch==' '||i==0){
	            int start;
	            if(i==0){
	                start=i;
	            }
	            else{
	                start=i+1;
	            }
	            for(int k=start;k<=j;k++){
	                System.out.print(s.charAt(k));
	            }
	            if(i!=0){
	                System.out.print(" ");
	            }
	            j=i-1;
	        }
	    }
	}
}
