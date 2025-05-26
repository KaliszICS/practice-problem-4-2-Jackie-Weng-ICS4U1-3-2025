
public class Car {

private String make;
private String model;
private int year;
private double price;

public Car(String make, String model, int year, double price){
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
}

public String getMake(){
    return this.make;
}

public String getModel(){
    return this.model;
}

public int getYear(){
    return this.year;
}

public double getPrice(){
    return this.price;
}

public void setMake(String newMake){
    this.make = newMake;
}

public void setModel(String newModel){
    this.model = newModel;
}

public void setYear(int newYear){
    this.year = newYear;
}

public void setPrice(double newPrice){
    this.price = newPrice;
}
}

