package point;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y; //the coordinates of the point, they are going to be read from the console
        String directions; //the string containing the directions a user inputs from the console
        boolean defaultDirection = true; //this variable changes its value every time the ~ button is given as a direction
        Scanner scan = new Scanner(System.in);
        System.out.print("x = ");
        x = scan.nextInt();
        System.out.print("y = ");
        y = scan.nextInt();
        Point p = new Point(x,y); //a new Point is created
        ArrayList<Character> directionStrings = new ArrayList<>(); //the string of directions given by the user are going to be split into an array list of type character
        System.out.print("Give the point some directions: ");
        directions = scan.next();
        for(int i=0; i<directions.length(); i++) {
            directionStrings.add(directions.charAt(i));
        }
        for(int i=0; i<directionStrings.size(); i++) {
            if(defaultDirection) {
                switch(directionStrings.get(i)) {
                    case '<':  p.lengthDecrease(); break;
                    case '>':  p.lengthIncrease(); break;
                    case '^':  p.heightDecrease(); break;
                    case 'v':  p.heightIncrease(); break;
                    case '~':  defaultDirection = false; break;
                    default: System.out.println("I don't understand this direction. Please try again"); break;
                }
            } else {
                switch(directionStrings.get(i)) {
                    case '<':  p.lengthIncrease(); break;
                    case '>':  p.lengthDecrease(); break;
                    case '^':  p.heightIncrease(); break;
                    case 'v':  p.heightDecrease(); break;
                    case '~':  defaultDirection = true; break;
                    default: System.out.println("I don't understand this direction. Please try again"); break;
                }
            }
        }
        System.out.println("Exit at: x = "+p.getLength()+" , y = "+p.getHeight());
    }
    
}
