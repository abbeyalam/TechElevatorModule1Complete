package com.techelevator;

import com.techelevator.shapes.Circle;
import com.techelevator.shapes.Shape;
import com.techelevator.shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Shape myShape = new Shape("orange",false,1);
        System.out.println(myShape.getColor()+" "+myShape.isFilled()+" "+myShape.getNumLines());

        Square square = new Square();
        square.setColor("black");
        //square.setNumLines(4);
        square.setFilled(false);
        square.setSideLength(4);

        Square s2 = new Square("gold",true);

        //polymorphism - every square is-a Shape
        Shape sq3 = new Square(5);
        //since sq3 really is a square, its going
        //to look there FIRST for the getPerimeter method
        System.out.println(sq3.getPerimeter());

        Shape circle = new Circle(5,"red",true);
        System.out.println(circle.getPerimeter());

        List<Shape> myListOfShapes = new ArrayList<>();
        myListOfShapes.add(square);
        myListOfShapes.add(s2);
        myListOfShapes.add(sq3);
        myListOfShapes.add(circle);

        for (Shape s : myListOfShapes){
            double p = s.getPerimeter();
            System.out.println("Perimeter" + p);
        }
        /*
        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

         */

    }
}
