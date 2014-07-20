public class DateAndTimeTest
{
	public static void main(String args[]){
		DateAndTime a = new DateAndTime(12,31,2005,23,59,59);
		System.out.println(a.toUniversalString());
		System.out.println(a.toStandardString());
		a.incrementHour();
		System.out.println(a.toUniversalString());
		System.out.println(a.toStandardString());
	}
}