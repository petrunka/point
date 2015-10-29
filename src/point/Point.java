package point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
public class Point {
    private int length; //the x coordinate
    private int height; //the y coordinate

    /**
     * @param length
     * @param height
     */
    public Point(int length, int height) {
        this.length =  length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void lengthIncrease() {
        length++;
    }
    
    public void heightIncrease() {
        height++;
    }
    
    public void lengthDecrease() {
        length--;
    }
    
    public void heightDecrease() {
        height--;
    }
}
