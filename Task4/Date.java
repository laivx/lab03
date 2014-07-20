public class Date 
{
   private int month; // 1-12
   private int day;   // 1-31 based on month
   private int year;  // any year

   
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); 
      year = theYear;
      day = checkDay( theDay ); 

      System.out.printf( 
         "Date object constructor for date %s\n", this );
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
      int daysPerMonth[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   

      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
      return 1;
   }
   public String toString()
   { 
      return String.format( "%d/%d/%d", month, day, year ); 
   } 
}