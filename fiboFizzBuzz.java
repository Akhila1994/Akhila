
public class fiboFizzBuzz {
	public static void main(String args[]){
		int a=1,b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		int temp,last;
		String fizzBuzz="";
		for (int i=1;i<19;i++){
			c=a+b;
			a=b;
			b=c;
			temp=c;
			while(temp!=0){
				last=temp%10;
				if(last==3)
					fizzBuzz +="Fizz";
				temp=temp/10;
			}
			if(c%3==0)
				fizzBuzz +="Fizz";
			temp=c;
			while(temp!=0){
				last=temp%10;
				if(last==5)
					fizzBuzz +="Buzz";
				temp=temp/10;
			}
			if(c%5==0)
				fizzBuzz +="Buzz";
			if(fizzBuzz=="")
				System.out.println(c);
			else
				System.out.println(fizzBuzz);
			fizzBuzz="";
			//System.out.println("c="+c);
		}
	}

}
