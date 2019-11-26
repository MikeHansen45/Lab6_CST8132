package curves;
/**
 * Class to test labs 1, 2, and 4.
 * @author      Howard Rosenblum rosenbh@algonquincollege.com
 * @version     1.0   1           
 */

public class ConeCurve implements Curve{

	public double getMinX() {
		return -10;
	}
	
	public double getMinY() {
		return -10;
	}
	
	public double getMaxX() {
		return 10;
	}
	
	public double getMaxY() {
		return 10;
	} 
	
	public double getStepSize() {
		return 1;
	}
	
	public double getZ(double x, double y)
	{
		return Math.abs(x)+Math.abs(y);
	}
}
