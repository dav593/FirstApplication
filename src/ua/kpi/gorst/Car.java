package ua.kpi.gorst;

/**
 * Created by Dav on 13.11.2016.
 */
public class Car {
String brand;
String model;
int run;
int date;
int cost;
    Car(){
        brand = "audi";
        model = "A4";
        run = 0;
        date = 2016;
        cost = 40000;


    }
public static void main (String [] args){
    Car oldcar = new Car();
    System.out.println("date = " + oldcar.date );
}







}
