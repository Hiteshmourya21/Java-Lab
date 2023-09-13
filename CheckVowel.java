//WAP to check is letter is present in string

public class Main
{
	public static void CheckVowel(String[] args) {
	    //create a string
	   String s1 = "Umbrella";
	   int c = 0;
	    for(int i = 0;i<s1.length();i++){
	        if(s1.charAt(i)=='a' || s1.charAt(i)=='A'){
	            c++;
	        }
	        if(s1.charAt(i)=='e' || s1.charAt(i)=='E'){
	            c++;
	        }
	        if(s1.charAt(i)=='i'|| s1.charAt(i)=='I' ){
	            c++;
	        }
	        if(s1.charAt(i)=='o'|| s1.charAt(i)=='O' ){
	            c++;
	        }
	        if(s1.charAt(i)=='u'|| s1.charAt(i)=='U'){
	            c++;
	        }
	    }
	  
	   System.out.println("Number of vowel = " + c);
	    
	}
}
