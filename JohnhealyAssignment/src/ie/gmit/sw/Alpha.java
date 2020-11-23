package ie.gmit.sw;

import ie.gmit.sw.high_status.Theta;
import ie.gmit.sw.low_status.Eta;

	/**
 	* The Class Alpha.
 	*/
public class Alpha {
	
	/** The Eta. */
	private Eta eta = new Eta();
	
	/** The Theta. */
	private Theta theta = new Theta();
	
	/**
	 * Alpha.
	 * @param s the s
	 * @return the object
	 * @throws Throwable the throwable
	 */
	public Object alpha(Status s) throws Throwable {
		//Beta and Gamma only deal with Status values of Slight, Low and Medium 
		if (s == Status.Slight || s == Status.Low || s == Status.Medium) {
			return eta.eta(s);
		} else {
			return theta.theta(s);
		}
}
}