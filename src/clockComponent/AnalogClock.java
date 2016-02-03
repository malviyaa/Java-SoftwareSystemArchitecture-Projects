package clockComponent;

public class AnalogClock extends Clock{
	private Timer ntime=null;
	 public AnalogClock(Timer ntime){
	      this.ntime = ntime;
	  //    this.nsubject.addClock(this);
	   }
	 
	public void displayTime()
	{
		System.out.println(ntime.hr24Format());
		//System.out.println(ntime.getHour()+":"+ntime.getMinute()+":"+ntime.getSecond()+" "+ntime.AMPM());
	}

}
