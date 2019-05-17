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
	    	if(n>10){
	    		return print2(n);
	    	}
	    	if(n<10){
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
	    	String s="";
	    	switch (n/10) {
			case 0: break;
			case 2: s = "twenty"; break;
			case 3: s = "thirty"; break;
			case 4: s= "forty"; break;
			case 5: s= "fifty"; break;
			case 6: s = "sixty"; break;
			case 7: s = "seventy"; break;
			case 8: s= "eighty"; break;
			case 9: s= "ninety"; break;
		}
	    	return s;
	    }
	}
	
	        
	
	    
	    
	    
	
	
