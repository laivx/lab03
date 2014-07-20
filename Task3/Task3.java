public class Task3
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   public Task3()
   {
      this( 0, 0, 0 );
   } 

   public Task3( int h ) 
   { 
      this( h, 0, 0 );
   }
   public Task3( int h, int m ) 
   { 
      this( h, m, 0 ); 
   }
   public Task3( int h, int m, int s ) 
   { 
      setTime( h, m, s );
   } 

   public Task3( Task3 time )
   {
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }
   public void setTime( int h, int m, int s )
   {
      setHour( h );   
      setMinute( m ); 
      setSecond( s ); 
   } 
   public void tick(){
	  second = second + 1;
	  if(second==60)
		  minute = minute + 1;
	  if(minute==60)
		  hour = hour +1;
	  setSecond(second);
	  setMinute(minute);
	  setHour(hour);
   }
   public void incrementMinute(){
	  minute = minute + 1;
	  if(minute == 60){
		hour = hour + 1;
	  }
	  setMinute(minute);
	  setHour(hour);
   }
   public void incrementHour (){
      hour = hour + 1;
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
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   }
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   }
}