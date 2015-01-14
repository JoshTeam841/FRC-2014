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
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc841.CometFRC2014.Robot;
/**
 * This command turns the robot to a set distance left or right and at
 * different speeds
 * 
 * @author Josh.Quintero@gmail.com (Joshua Quintero)
 */
public class  Turn extends Command {
    //Create variables needed for this command
    private double goalTurn;
    private double speed;
    private boolean isTurnLeft;
    private double Kp = .09;
    public Turn(double turndistance, double setspeed, boolean driveleft) {
        //sets turn distance, speed, and to turn left or right
        this.goalTurn = turndistance;
        this.speed = setspeed;
        this.isTurnLeft = driveleft;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        //Initialize the Encoders to get ready for the turn
        Robot.driveTrain.initEncoder();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double left,right,errorsum;
        
        //Sample distance traveled
        left = Robot.driveTrain.getLeftEncoderDistance();
        right = Robot.driveTrain.getRightEncoderDistance();
        
        //P control loop to keep right side the same as left side, therefore,
        //making the robot go straight.
        errorsum = (left + right) * this.Kp;
        
        //limit correction for protection
        if (errorsum > 0.1){
            errorsum = 0.1;
        }
        else if (errorsum < -0.1){
            errorsum = -0.1;
        }
        
        //Update speed
        if(this.isTurnLeft){
            Robot.driveTrain.SetLeftRight(-this.speed, this.speed - errorsum);
        }
        else{
            Robot.driveTrain.SetLeftRight(this.speed, -this.speed - errorsum);
        } 
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //Finishes when the distance traveled has exceeded the goaldistance
        return Math.abs(Robot.driveTrain.getLeftEncoderDistance()) > this.goalTurn;
    }
    // Called once after isFinished returns true
    protected void end() {
        //Stop turning, stop the counting on the encoders,
        //and clear the encoder value.
        if(this.isTurnLeft){
            Robot.driveTrain.SetLeftRight(speed, -speed);
        }
        else{
            Robot.driveTrain.SetLeftRight(-speed, speed);
        }
        Timer.delay(0.25);
        Robot.driveTrain.SetLeftRight(0, 0);
        Robot.driveTrain.stopEncoders();
        Robot.driveTrain.resetEncoders();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        this.end();
    }
}