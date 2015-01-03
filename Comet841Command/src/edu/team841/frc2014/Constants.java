package edu.team841.frc2014;

import edu.team841.lib.util.ConstantsBase;

/**
 * Manages constant values used everywhere in the robot code.
 * Variables can be declared here with default values 
 *
 * @author josh.quintero@gmail.com (Joshua Quintero)
 * Based on brandon.gonzalez.451@gmail.com (Brandon Gonzalez)
 */
public class Constants extends ConstantsBase {
    // Declare the constants and their default values here.
    // Control board mappings
    public static final Constant driverController = new Constant("driverController", 1);
    public static final Constant coDriverController = new Constant("coDriverController", 2);

    //Define Digital Side Car parameters here.
    // Speed controller mappings
    public static final Constant leftMotorDriveA = new Constant("leftMotorDriveA",8);
    public static final Constant rightMotorDriveA = new Constant("rightMotorDriveA",3);
    
    // Relay mappings
    public static final Constant compressorRelay = new Constant("compressorRelay", 1);
    
    // Digital IO mappings
    public static final Constant CompressorPressureSwitch = new Constant("CompressorPressureSwitch",  1);

    // Define CRIO parameters here. 
    // Analog input mappings
    

    // Solinoid mappings
   
    // Prevent instantiation of this class, as it should only be used statically.
    private Constants() {
    }
}
