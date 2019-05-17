	package challenge1;
	
	import java.util.Scanner;
	
	public class IntToEng {
	
	    // メインメソッド
	
	    public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	
	        int input = sc.nextInt();
	
	        System.out.println(translateEng(input));
	
	    }
	
	    // 数値を英訳する変換するメソッド
	
	    static String translateEng(int n) {
	    	
	    	if(n/10==1){//10~19
	    		return print3(n);
	    	}
	    	if(n>=100){//100~999
	    		return print4(n);
	    	}
	    	
	    	if(n>=20){//20~99
	    		return print2(n);
	    	}
	    	if(n<10){//1~9
	    		return print1(n);
	    	}
	    	
	    	return null;
	    }
	    
	    public static String  print1 (int n) {
	    	String s="";
	    	switch (n) {
			case 0: break;
			case 1: s = "one"; break;
			case 2: s = "two"; break;
			case 3: s = "three"; break;
			case 4: s = "four"; break;
			case 5: s = "five"; break;
			case 6: s = "six"; break;
			case 7: s = "seven"; break;
			case 8: s = "eight"; break;
			case 9: s = "nine"; break;
		}
	    	
	    	return s;
	    }
	    
	    public static String  print2 (int n) {
	    	String s2="";
	    	switch (n/10) {
			case 0: break;
			case 2: s2 = "twenty"; break;
			case 3: s2 = "thirty"; break;
			case 4: s2= "forty"; break;
			case 5: s2= "fifty"; break;
			case 6: s2 = "sixty"; break;
			case 7: s2 = "seventy"; break;
			case 8: s2= "eighty"; break;
			case 9: s2= "ninety"; break;
		}
	    	String s1=print1(n%10);
    		String s;
    		if(s1!=""){
    		s=s2+" - "+s1;
    		}
    		else{
    			s=s2;
    		}
	    	return s;
	    }
	    
	    public static String print3(int n){
	    	String s="";
	    	switch (n%10) {
			case 0: s = "ten"; break;
			case 1: s = "eleven"; break;
			case 2: s = "twelve"; break;
			case 3: s = "thirteen"; break;
			case 4: s= "forteen"; break;
			case 5: s= "fifteen"; break;
			case 6: s = "sixteen"; break;
			case 7: s = "seventeen"; break;
			case 8: s= "eighteen"; break;
			case 9: s= "nineteen"; break;
		}
	    	return s;
	    }
	    public static String  print4 (int n) {
	    	String s="";
	    	s=print1(n/100)+"hundred ";//百の位確定
	    	/*if((n/10)%10){
	    		s=s+print3(n-(n/100*100));
	    	}
	    	else{
	    		s=s+print2(n-(n/100*100));
	    	}*/
	    	return s;
	    }
	}
	
	        
	
	    
	    
	    
	
	
