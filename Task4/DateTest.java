public class DateTest
{
	public static void main(String args[]){
		Date a = new Date(12,31,2003);
		System.out.println(a.toString());
		for(int i =1; i<=20; i++){
			a.nextDay();
			System.out.println(a.toString());
		}

		Date b = new Date(2,27,2003);
		b.nextDay();
		System.out.println(b.toString());
		b.nextDay();
		System.out.println(b.toString());
	}
}
