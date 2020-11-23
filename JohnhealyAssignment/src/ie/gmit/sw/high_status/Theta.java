package ie.gmit.sw.high_status;

import java.time.DayOfWeek;
import java.time.LocalDate;

import ie.gmit.sw.Status;

	/**
 	* The Class Theta.
 	*/
public class Theta {
	
	/** The delta. */
	private Delta delta = new Delta();
	
	/** The epsilon. */
	private Epsilon epsilon = new Epsilon();
	
	/** The zeta. */
	private Zeta zeta = new Zeta();
	
	/**
	 * Theta.
	 *
	 * @param Status s
	 * @return Returns the Object Which is the Day of the Week.
	 */
	public Object theta(Status s)
	{
		DayOfWeek day = LocalDate.now().getDayOfWeek();

		return switch (day) {
		case MONDAY, TUESDAY -> delta.delta(day.name());
		case WEDNESDAY, THURSDAY -> epsilon.epsilon(day.name());
		case FRIDAY -> zeta.zeta(day.name());
		case SATURDAY -> Integer.valueOf((delta.delta(day.name()) + epsilon.epsilon(day.name()))); 
		case SUNDAY -> Integer.valueOf((epsilon.epsilon(day.name()) + zeta.zeta(day.name())));
		};
	}
}
