package section1;
//for problem statement Ref:  https://programmingbydoing.com/
public class Java9 {
	    public static void main( String[] args )
	    {
	        int cars, drivers, passengers, cars_not_driven, cars_driven;
	       
	        double space_in_a_car, carpool_capacity, average_passengers_per_car;

	        cars = 100;//Finds how many cars are available
	        space_in_a_car = 4.0;//Amount of drivers available
	        drivers = 30;// Number of non-driver individuals that require a ride
	        passengers = 90;
	        cars_not_driven = cars - drivers;//Finds the amount of cars that lack a driver
	        cars_driven = drivers;//Finds the amount of cars driven based upon the amount of drivers
	        carpool_capacity = cars_driven * space_in_a_car;//Finds the total amount of available seats for non-drivers
	        average_passengers_per_car = passengers / cars_driven;//Finds the average of seats taken per car


	        System.out.println( "There are " + cars + " cars available." );//States the amount of cars available.
	        System.out.println( "There are only " + drivers + " drivers available." );//States the amount of drivers available.
	        System.out.println( "There will be " + cars_not_driven + " empty cars today." );//States the amount of cars not used today due to lack of drivers
	        System.out.println( "We can transport " + carpool_capacity + " people today." );//States the maximum quantity of passengers that can be transported today
	        System.out.println( "We have " + passengers + " to carpool today." );//States the quantity of passengers that need to be transported.
	        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );//States the amount of passengers that should be placed in each car.
	    }
	}
