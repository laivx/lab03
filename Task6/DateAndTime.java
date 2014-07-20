public class DateAndTime
{
	private int month; // 1-12
	private int day;   // 1-31 based on month
	private int year;  // any year
	private int hour;   // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	public DateAndTime(int theMonth, int theDay, int theYear, int h, int m, int s){
		month = checkMonth( theMonth ); 
		year = theYear;
		day = checkDay( theDay ); 
		setTime( h, m, s );
	}
	public void setTime( int h, int m, int s )
	{
      setHour( h );   
      setMinute( m ); 
      setSecond( s ); 
	} 
	public void nextDay (){
		day = day+1;
		day = checkDay(day);
		if(day==1){
			month = month+1;
			month = checkMonth(month);
			if(month == 1) year = year +1;
		}
	}
	private int checkMonth( int testMonth )
	{
		if ( testMonth > 0 && testMonth <= 12 )
			return testMonth;
		else
		{ 
			return 1; 
		}
	} 

	private int checkDay( int testDay )
	{
		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
		return testDay;

		if ( month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) )
		return testDay;
		return 1; 
	}
	public void tick(){
		second = second + 1;
		if(second==60)
			minute = minute + 1;
		if(minute==60){
			hour = hour +1;
			if(hour==24) nextDay();
		}
		setSecond(second);
		setMinute(minute);
		setHour(hour);
   }
   public void incrementMinute(){
		minute = minute + 1;
		if(minute == 60){
			hour = hour + 1;
			if(hour==24) nextDay();
		}
		setMinute(minute);
		setHour(hour);
   }
   public void incrementHour (){
		hour = hour + 1;
		if(hour==24){
			nextDay();
		}
		setHour(hour);
   }
   public void setHour( int h ) 
   { 
		hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   }
   public void setMinute( int m ) 
   { 
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   }
   public void setSecond( int s ) 
   { 
        second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   }
   public int getHour() 
   { 
        return hour; 
   } 
   public int getMinute() 
   { 
        return minute; 
   } 
   public int getSecond() 
   { 
        return second; 
   }
   public String toUniversalString()
   {
        return String.format("%d/%d/%d  %02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond() );
   }
   public String toStandardString()
   { 
		return String.format( "%d/%d/%d  %d:%02d:%02d %s", month, day, year,( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
			getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" )  ); 
   }
}