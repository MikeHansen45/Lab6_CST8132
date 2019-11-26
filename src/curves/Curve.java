package curves;
/**
 * Class to test labs 1, 2, and 4.
 * @author      Howard Rosenblum rosenbh@algonquincollege.com
 * @version     1.0         1     
 */
public interface Curve {
	
	public double getMinX(); 
	
	public double getMinY();
	
	public double getMaxX();
	
	public double getMaxY();
	
	public double getStepSize();
	
	public double getZ(double x, double y);

}
