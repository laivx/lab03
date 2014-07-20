public class Task3test
{
	public static void main(String args[]){
		Task3 a = new Task3(23,59,59);
		System.out.println(a.toString());
		a.tick();
		System.out.println(a.toString());
		a.incrementMinute();
		System.out.println(a.toString());
		a.incrementHour();
		System.out.println(a.toString());
	}
}