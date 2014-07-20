public class Time2test
{
	public static void main(String args[]){
		Time2 a = new Time2();
		System.out.println(a.toString());
		Time2 b = new Time2(24,0,9);
		System.out.println(b.toString());
		b.setSecond(17);
		System.out.println(b.toString());
	}
}