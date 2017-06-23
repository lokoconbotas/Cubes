// import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;
import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //First cube data
        double edge1;
        System.out.println("Enter the length of edge of the cube 1: ");
        edge1 = input.nextDouble();

        double coordX1;
        System.out.println("Enter the X axis coordinate of cube 1: ");
        coordX1 = input.nextDouble();

        double coordY1;
        System.out.println("Enter the Y axis coordinate of cube 1: ");
        coordY1 = input.nextDouble();

        double coordZ1;
        System.out.println("Enter the Z axis coordinate of cube 1: ");
        coordZ1 = input.nextDouble();

        //Second cube data
        double edge2;
        System.out.println("Enter the length of edge of the cube 2: ");
        edge2 = input.nextDouble();

        double coordX2;
        System.out.println("Enter the X axis coordinate of cube 2: ");
        coordX2 = input.nextDouble();

        double coordY2;
        System.out.println("Enter the Y axis coordinate of cube 2: ");
        coordY2 = input.nextDouble();

        double coordZ2;
        System.out.println("Enter the Z axis coordinate of cube 2: ");
        coordZ2 = input.nextDouble();


        System.out.println("Checking if both cubes intersect...");

        //First object's axes
        double x1 = coordX1 - edge1/2;//7.5x
        double x2 = coordX1 + edge1/2;//12.5x
        double y1 = coordY1 - edge1/2;//7.5y
        double y2 = coordY1 + edge1/2;//12.5y
        double z1 = coordZ1 - edge1/2;//-2.5z
        double z2 = coordZ1 + edge1/2;//2.5z

        //Second object's axes
        double X1 = coordX2 - edge2/2;//8x
        double X2 = coordX2 + edge2/2;//10x
        double Y1 = coordY2 - edge2/2;//8y
        double Y2 = coordY2 + edge2/2;//10y
        double Z1 = coordZ2 - edge2/2;//-1z
        double Z2 = coordZ2 + edge2/2;//1z

        //Axes intersection values
        double interX;
        double interY;
        double interZ;

        //Checking if the cubes do not intersect, since if any side intersect -> all sides intersect
        if( x2 < X1 || X2 < x1){
            System.out.println("Cubes don't intersect");
        }

        //Cubes intersect, getting the volume value now
        else{
            interX = Math.max(0, Math.min(x2,X2) - Math.max(x1,X1));
            interY = Math.max(0, Math.min(y2, Y2) - Math.max(y1,Y1));
            interZ = Math.max(0, Math.min(z2, Z2) - Math.max(z1,Z1));
            System.out.println("The cubes intersect!");
            System.out.println("The volume of the intersection is: " + (interX * interY * interZ) + " cubic");

        }
    }
}
