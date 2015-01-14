// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc841.CometFRC2014.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomoustwoBall extends CommandGroup {
    
    public  AutonomoustwoBall() {
        
        // Shoots first ball
        addSequential (new FireSequence());
        // Cocks catapault
        addSequential (new CockCatapult());
        // Drive Back 1ft.
        addSequential (new DriveStraightToDistance(20.0,0.90,false));
        // .75 Delay
        addSequential (new WaitCommand(0.75));
        // Recract Intakes
        addSequential (new RetractLimbsAuto());
        // Drive forward 1ft.
        addSequential (new DriveStraightToDistance(47.0,0.30,true));
        // Shoots second ball
        addSequential (new FireSequence());
       
    }
}