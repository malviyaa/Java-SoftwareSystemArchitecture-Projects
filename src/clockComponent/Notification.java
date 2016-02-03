package clockComponent;

import java.util.ArrayList;
import java.util.List;

public abstract class Notification {

	private List<Clock> observerClock = new ArrayList<Clock>();
	
	public void  addClock(Clock component)
	{	
		//Registering- Adding observer for notification      
		 observerClock.add(component);	   
		      
	}
    /*public abstract void  addClock(Clock object)
	*/
	
	public void removeClock(Clock component)
	{
		//Unregister - removing observer from the list
		observerClock.remove(component);
	}

	
	public void notifyClock()
    {
		//Sending updates to the observers which are present in the list 
		for (Clock object : observerClock) {
			
				 object.displayTime();
			
	        
		}
    }

	
	
}
