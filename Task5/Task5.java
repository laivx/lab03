public class Task5
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   public Task5()
   {
      this( 0, 0, 0 );
   }

   public Task5( int h ) 
   { 
      this( h, 0, 0 );
   }

   public Task5( int h, int m ) 
   { 
      this( h, m, 0 );
   }

   public Task5( int h, int m, int s ) 
   { 
		setTime( h, m, s );
   }

   public Task5( Task5 time )
   {
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }
   public boolean setTime( int h, int m, int s )
   {
      if(setHour( h )==true && setMinute( m )==true && setSecond( s )==true) return true;
	  return false;
   }
   public boolean setHour( int h ) 
   { 
	   if( h < 0 || h > 24 ){
			return false;
	   }
	   else{
			hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
			return true;
	   }
   }
   public boolean setMinute( int m ) 
   { 
	  if(m < 0 || m > 60) return false;
	  else{
		  minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
		  return true;
	  }
   }
   public boolean setSecond( int s ) 
   { 
	  if(s < 0 || s > 60) return false;
      else{
		  second = ( ( s >= 0 && s < 60 ) ? s : 0 );
		  return true;
	  }
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