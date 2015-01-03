
package edu.team841.lib.util;

import java.util.Vector;


/**
 *
 * @author Josh.Quintero@gmail.com (Joshua Quintero)
 * Based on brandon.gonzalez.451@gmail.com (Brandon Gonzalez)
 */

public abstract class ConstantsBase {
  
    private static final Vector constants = new Vector();
    /**
    * Handles an individual value used in the Constants class.
    */
    public static class Constant {
        private String name;
        private double value;

        public Constant(String name, double value) {
            this.name = name;
            this.value = value;
            constants.addElement(this);
        }

        public String getName(){
            return name;
        }

        public double getDouble() {
            return value;
        }

        public int getInt() {
            return (int)value;
        }

        public void setVal(double value){
            this.value = value;
        }

        public String toString(){
            return name + ": " + value;
        }
    }    
}
