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
	//count is the answer        
        return count;
    }


    //Complete writing the method getAverageLength
    public double getAverageLength(Shape s) {
	//Take shape perimeter and devide between the number of points (x,y)
        double average = getPerimeter(s)/getNumPoints(s);
	//average is the answer
        return average;
    }


    //Complete writing the method getLargestSide
    public double getLargestSide(Shape s) {
        double largest = 0;
        Point prevPt = s.getLastPoint();
        for(Point currPt : s.getPoints()){
            double currDist = prevPt.distance(currPt);
            if(currDist>largest) largest = currDist;
            prevPt = currPt;
            }
        return largest;
    }


    //Complete writing the method getLargestX
    public double getLargestX(Shape s) {
        double largestX = 0.0;
        for(Point currentPt : s.getPoints()){
            double currentPtX  = currentPt.getX();
            if(currentPtX>largestX) largestX = currentPtX;
        }

        return largestX;
    }


     //Complete writing the method getLargestPerimeterMultipleFile
     public double getLargestPerimeterMultipleFiles() {
        double largestPerimeter = 0.0;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape fileShape = new Shape();
            double peri = getPerimeter(fileShape);
            if (peri>largestPerimeter) largestPerimeter = peri;            
        }
        return largestPerimeter;
    }

	
    //Add code in the method testPerimeter
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPoints = getNumPoints(s);
	double avLength = getAverageLength(s);
	double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        System.out.println("perimeter = " + length);
        System.out.println("Number of points = " + numPoints);
	System.out.println("Average length = " + avLength);
        System.out.println("The largest side in the shape = " + largestSide);
        System.out.println("The largest x point in the shape = " + largestX);
        
    }



