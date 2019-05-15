import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    //Complete writing the method getNumPoints
    public int getNumPoints (Shape s) {
	//Start with count = 0
        int count = 0;
	// For each point currPt in the shape,
        for (Point currPt : s.getPoints()){
		//increment count to the end
                count++;
            }
	//count is tha answer        
        return count;

    //Complete writing the method getAverageLength
    public double getAverageLength(Shape s) {
	//Take shape perimeter and devide between the number of points (x,y)
        double average = getPerimeter(s)/getNumPoints(s);
	//average is the answer
        return average;
	
    //Add code in the method testPerimeter
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPoints = getNumPoints(s);
	double avLength = getAverageLength(s);
        System.out.println("perimeter = " + length);
        System.out.println("Number of points = " + numPoints);
	System.out.println("Average length = " + avLength);


