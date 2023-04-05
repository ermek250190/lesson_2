package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculatePerimetr(6.5, 5.0, " Аудитория 2");
        calculatePerimetr(5.5, 4.0,  " Кухня");
        calculatePerimetr(10.0,5.5," Аудитория");


    }
    public static void calculatePerimetr(double length,double width,String roomName){

        double perimetr = 2 * (length + width);

        System.out.println("периметр комнаты: " + roomName + ": " + perimetr + " метров ");

    }



}
