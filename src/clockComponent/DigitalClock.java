package clockComponent;

public class DigitalClock extends Clock {
   private Timer ntime=null;
	public DigitalClock(Timer ntime){
	      this.ntime = ntime;
	     
	   }
	 
	public void displayTime()
	{
		//System.out.println(ntime.hr12Format());
		//System.out.println(ntime.getHour()+":"+ntime.getMinute()+":"+ntime.getSecond()+" "+ntime.AMPM());
	}

}
