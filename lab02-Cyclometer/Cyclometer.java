/////////////////////////////////////////////////////////////////////////////
// lab02-Cyclometer
// Cyclometer Java Program
// 3rd of September 2014
//
// bicycle cyclometer (meant to measure speed, distance, etc.) records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time. For two trips, given time and rotation count, your program should:
//a. print the number of minutes for each trip
//b. print the number of counts for each tirp
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined

//
//Arik Baer
// here we define a class
public class Cyclometer{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        int secsTrip1=480; //here we set the amount of seconds from trip one by defining our secTrip1 variable
        int secsTrip2=3220; //here we set the amount of seconds from trip two by defining our secTrip2 variable
        int countsTrip1=1561; //here we set the amount of counts from trip one by defining our countsTrip1 variable
        int countsTrip2=9037; //here we set the amount of counts from trip two by defining our countsTrip2 variable
        
        double wheelDiameter=27.0, // here we set the size fo the wheel. One of the variables needed for the cyclometer
        PI=3.14159, //here we define PI to be able to use them in later calculations
        feetPerMile=5280, // here we implement the distance convertion factors
        inchesPerFoot=12, //here we implement the distance convertion factors
        secondsPerMinute=60; //here we implement the distance convertion factors
        double distanceTrip1, distanceTrip2, totalDistance;
        
        //Here we print the statements and put in use the defined variables above to provide with the needed output of the cyclometer
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts." );
         System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts." );
        
        // Here we compute the previously defined variables to output the distance of Trip1 in inches
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // We then convert to the metric system
        distanceTrip1/= inchesPerFoot*feetPerMile;
        
        // Here we compute the previously defined variables to output the distance of Trip2 (this calculation will have the converstion implemented)
        distanceTrip2=countsTrip2*wheelDiameter*PI;
        distanceTrip2/= inchesPerFoot*feetPerMile;
        
        // Now we calculate the total distance by added DistanceTrip1 and DistanceTrip2
        totalDistance=distanceTrip1+distanceTrip2;
        
        //We now print the distance of both trips
        System.out.println("Trip 1 was "+ distanceTrip1 + " miles.");
        System.out.println("Trip 2 was "+ distanceTrip2 + " miles.");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of method
} // enf of class
        