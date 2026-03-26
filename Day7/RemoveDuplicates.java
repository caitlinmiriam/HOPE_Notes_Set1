public class RemoveDuplicates
{
	public static void main(String[] args) {
		String s="Programming";
		for(int i=0;i<s.length();i++){
		    char ch=Character.toLowerCase(s.charAt(i));
		    boolean flag=false;
		    for(int j=0;j<i;j++){
		        if(s.charAt(j)==s.charAt(i)){
		            flag=true;
		            break;
		        }
		    }
		    if(!flag){
		        System.out.print(s.charAt(i));
		    }
		}
	}
}
