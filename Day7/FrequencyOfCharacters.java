public class FrequencyOfCharacters
{
	public static void main(String[] args) {
		String s="Hi Guys Hello";
		int [] freq=new int[256];
		for(int i=0;i<s.length();i++){
		    char ch=Character.toLowerCase(s.charAt(i)); //if(ch >= 'a' && ch <= 'z'). To count alphabets only.
		    freq[ch]++;
		}
		for(int i=0;i<256;i++){
		    if(freq[i]!=0){
		        System.out.println((char)(i)+" "+freq[i]);
		    }
		}
	}
}
