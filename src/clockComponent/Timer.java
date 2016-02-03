package clockComponent;

public class Timer extends Notification{
	private int hour;
	private int minute;
	private int second;
	private String displayAMPM;
	private String time12hrFormat;
	private String time24hrFormat;
	private String timeZone;
	
	public Timer(int hour, int minute, int second, String ampm,String timeZone)
	{
		//Set initial time in the system
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		this.displayAMPM=ampm;
		this.timeZone= timeZone;
		
		
		Tick();
	}
	public void Tick( )
	{
		hour=hour+1;
		minute=minute+1;
		second=second+1;
		displayAMPM="AM";
		 //Processing - Change of state happens here 
		// Updates Seconds , minutes, hours and AMPM
		notifyClock();
		
	}
	
	//getState 
	public int getHour( )
	{
		return hour;
	}
	public int getMinute( )
	{
		return minute;
	}
	public int getSecond( )
	{
		return second;
	}
	public String AMPM( )
	{
		
		return displayAMPM;
	}
	
	
	public String hr12Format()
	{
		return time12hrFormat;
	}
	
	public String hr24Format()
	{
		return time24hrFormat;
	}
 
   public String timeZone()
   {
	   return timeZone;
   }
	  
	
}
