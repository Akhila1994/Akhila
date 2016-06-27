import java.io.*;

public class Exp {

	public static void main(String args[]) throws IOException{
		System.out.println("Enter the string to reverse");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		String a=obj.readLine();
		a=a+" ";
		System.out.println("You Entered : "+a);
		String reversed=reverseWord(a);
		System.out.println("Reversed String :"+reversed);
		
	}
	public static String reverseWord(String str){
        int strlen = str.length()-1;
        String reverse = "", temp = "";
        for(int i = 0; i <= strlen; i++){
            temp = temp+ str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strlen)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strlen))
                        reverse += "";
                }
                temp = "";
            }
        }
        return reverse;
    }
}
