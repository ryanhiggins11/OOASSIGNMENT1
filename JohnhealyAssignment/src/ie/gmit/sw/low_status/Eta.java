package ie.gmit.sw.low_status;



import ie.gmit.sw.Status;

// TODO: Auto-generated Javadoc
/**
 * The Class Eta.
 */
public class Eta {
	
	/** The beta. */
	private Beta beta = new Beta();
	
	/** The gamma. */
	private Gamma gamma = new Gamma();
	
	/**
	 * Eta.
	 *
	 * @param Status S
	 * @return Returns Beta, Gamma Or Null.
	 * @throws Throwable the throwable
	 */
	public Object eta(Status s)throws Throwable{
		if(s == Status.Slight || s == Status.Low) {
			return beta.beta();
		} else if (s == Status.Medium) {
			return gamma.gamma();
		} else {
			return null;
		}
	}

}
