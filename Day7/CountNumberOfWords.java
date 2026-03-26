import java.util.*;
public class CountNumberOfWords
{
	public static void main(String[] args) {
    
    // Just a normal string with a single whitespace
		String s1="Hi Hello How Are You";
		String [] arr1=s1.split(" ");
		System.out.println(arr1.length);

    // A string with leading, trailing and multiple whitespaces with inbuilt
    String s2="   Hi       Hello      How      Are     You   ";
		s2=s2.trim();
		String [] arr2=s2.split("\\s+");
		System.out.println(arr2.length);

    // A string with leading, trailing and multiple whitespaces without inbuilt
    String s3="   Hi       Hello      How      Are     You   ";
		int count=0;
		boolean flag=true;
		for(int i=0;i<s3.length();i++){
		    char ch=s3.charAt(i);
		    if(ch!=' '){
		        if(flag==true){
		            count++;
		            flag=false;
		        }
		    }
		    else{
		        flag=true;
		    }
		}
		System.out.println(count);
	}
}
