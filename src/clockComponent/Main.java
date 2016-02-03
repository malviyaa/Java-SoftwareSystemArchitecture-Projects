package clockComponent;

import java.sql.Time;


public class Main {


	public static void main(String[] args) {
       /*
        * 
        * 
        * my second commit
        */
		Timer times= new Timer(2,33,32,"PM","CST");
		DigitalClock digital = new DigitalClock(times);
		AnalogClock analog=new AnalogClock(times);
		times.addClock(digital);
		times.Tick();
		/*times.addClock(analog);
		times.Tick();
		times.removeClock(digital);
		times.Tick();*/
		
		
		
		

		
	}

}
