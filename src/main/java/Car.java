/** Jackie Weng **/
/**  Problem Set 4-2 **/
/**  J.Kalisz **/

//**  creates a "car" with paramters such as its make, model, year and price. also with getters and setters **/

public class Car {

private String make; // my instance variables
private String model;
private int year;
private double price;

//**  constuctor: initalizes my car with the 3 things above **/
//* @param make: make of the car */
//* @param model: the model of a car */
//* @param year: the year of a car */
//* @param price: the price of the car */
public Car(String make, String model, int year, double price){
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
}
//* gets the make of the car */
//* @return return the make of the car */
public String getMake(){
    return this.make;
}
//* the exact same thing as above */
public String getModel(){
    return this.model;
}//* the exact same thing as above */
public int getYear(){
    return this.year;
}
//* the exact same thing as above */
public double getPrice(){
    return this.price;
}
//* sets the cars make to a provided string */
//* @param newMake, a string that the current make is replaced with */
public void setMake(String newMake){
    this.make = newMake;
}
//* sets the cars mode to a provided string */
//* @param newMake, a string that the current model is replaced with */
public void setModel(String newModel){
    this.model = newModel;
}
//* exact same thing but with year @param newYear, a string that the year is replaced with */
public void setYear(int newYear){
    this.year = newYear;
}
//* exact same thing but with price @param newPrice, a string that the price is replaced with */
public void setPrice(double newPrice){
    this.price = newPrice;
}
}

