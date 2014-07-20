import java.util.*;
public class Task5Test
{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		int h,m,s;
		h = input.nextInt();
		m = input.nextInt();
		s = input.nextInt();
		Task5 a = new Task5(h,m,s);
		
		if(a.setTime(h,m,s)==true){
			System.out.println(a.toUniversalString());
			System.out.println(a.toString());
		}
		else{
			if(!a.setHour(h)) System.out.println("The hour is incorrect!");
			if(!a.setMinute(m)) System.out.println("The Minute is incorrect!");
			if(!a.setSecond(s)) System.out.println("The Second is incorrect!");
		}
	}
}