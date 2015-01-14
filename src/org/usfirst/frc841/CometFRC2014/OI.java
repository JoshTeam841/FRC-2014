// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc841.CometFRC2014;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc841.CometFRC2014.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton turnLeft90deg7;
    public JoystickButton shiftDown2;
    public JoystickButton turnAround5;
    public JoystickButton turnRight90deg8;
    public JoystickButton shiftUp1;
    public JoystickButton quickTurnStop6;
    public JoystickButton quickTurn6;
    public Joystick driver;
    public JoystickButton extendLimbs6;
    public JoystickButton retractLimbs5;
    public JoystickButton fireSequence10;
    public JoystickButton passFront4;
    public JoystickButton passBack2;
    public JoystickButton cockCatapult3;
    public JoystickButton stopIntake1;
    public JoystickButton cockCatapultSeq8;
    public JoystickButton dryHeave9;
    public Joystick coDriver;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        coDriver = new Joystick(2);
        
        dryHeave9 = new JoystickButton(coDriver, 9);
        dryHeave9.whenPressed(new DryFire());
        cockCatapultSeq8 = new JoystickButton(coDriver, 8);
        cockCatapultSeq8.whenPressed(new CockSequence());
        stopIntake1 = new JoystickButton(coDriver, 1);
        stopIntake1.whenPressed(new FrontRollerStop());
        cockCatapult3 = new JoystickButton(coDriver, 3);
        cockCatapult3.whenPressed(new CockCatapult());
        passBack2 = new JoystickButton(coDriver, 2);
        passBack2.whenPressed(new BackRollerPass());
        passFront4 = new JoystickButton(coDriver, 4);
        passFront4.whenPressed(new FrontRollerPass());
        fireSequence10 = new JoystickButton(coDriver, 10);
        fireSequence10.whenPressed(new FireSequence());
        retractLimbs5 = new JoystickButton(coDriver, 5);
        retractLimbs5.whenPressed(new RetractLimbs());
        extendLimbs6 = new JoystickButton(coDriver, 6);
        extendLimbs6.whenPressed(new ExtendLimbs());
        driver = new Joystick(1);
        
        quickTurn6 = new JoystickButton(driver, 6);
        quickTurn6.whenPressed(new EngageQuickturn());
        quickTurnStop6 = new JoystickButton(driver, 6);
        quickTurnStop6.whenReleased(new DisenageQuickturn());
        shiftUp1 = new JoystickButton(driver, 1);
        shiftUp1.whenPressed(new SetHighGear());
        turnRight90deg8 = new JoystickButton(driver, 8);
        turnRight90deg8.whenPressed(new TurnRight90());
        turnAround5 = new JoystickButton(driver, 5);
        turnAround5.whenPressed(new Turn180());
        shiftDown2 = new JoystickButton(driver, 2);
        shiftDown2.whenPressed(new SetLowGear());
        turnLeft90deg7 = new JoystickButton(driver, 7);
        turnLeft90deg7.whenPressed(new TurnLeft90());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("CatchBall", new CatchBall());
        SmartDashboard.putData("Regulate", new Regulate());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Autonomous singleShot", new AutonomoussingleShot());
        SmartDashboard.putData("CockCatapult", new CockCatapult());
        SmartDashboard.putData("ShootCatapult", new ShootCatapult());
        SmartDashboard.putData("Drive", new Drive());
        SmartDashboard.putData("SetHighGear", new SetHighGear());
        SmartDashboard.putData("SetLowGear", new SetLowGear());
        SmartDashboard.putData("EngageQuickturn", new EngageQuickturn());
        SmartDashboard.putData("DisenageQuickturn", new DisenageQuickturn());
        SmartDashboard.putData("ExtendLimbs", new ExtendLimbs());
        SmartDashboard.putData("RetractLimbs", new RetractLimbs());
        SmartDashboard.putData("AutoShootLeftSide", new AutoShootLeftSide());
        SmartDashboard.putData("FireSequence", new FireSequence());
        SmartDashboard.putData("BackTiltSetOutward", new BackTiltSetOutward());
        SmartDashboard.putData("BackTiltSetInward", new BackTiltSetInward());
        SmartDashboard.putData("FrontTiltSetOutward", new FrontTiltSetOutward());
        SmartDashboard.putData("FrontTiltSetInward", new FrontTiltSetInward());
        SmartDashboard.putData("PassBack", new PassBack());
        SmartDashboard.putData("FrontRollerPass", new FrontRollerPass());
        SmartDashboard.putData("FrontRollerBringBallIn", new FrontRollerBringBallIn());
        SmartDashboard.putData("FrontRollerStop", new FrontRollerStop());
        SmartDashboard.putData("BackRollerPass", new BackRollerPass());
        SmartDashboard.putData("BackRollerBringBallIn", new BackRollerBringBallIn());
        SmartDashboard.putData("BackRollerStop", new BackRollerStop());
        SmartDashboard.putData("IntakeCatchStop", new IntakeCatchStop());
        SmartDashboard.putData("Turn180", new Turn180());
        SmartDashboard.putData("TurnLeft90", new TurnLeft90());
        SmartDashboard.putData("TurnRight90", new TurnRight90());
        SmartDashboard.putData("CockSequence", new CockSequence());
        SmartDashboard.putData("BackTiltSetInwardAuto", new BackTiltSetInwardAuto());
        SmartDashboard.putData("FrontTiltSetInwardAuto", new FrontTiltSetInwardAuto());
        SmartDashboard.putData("RetractLimbsAuto", new RetractLimbsAuto());
        SmartDashboard.putData("DryFire", new DryFire());
        SmartDashboard.putData("DryFireCommad", new DryFireCommad());
        SmartDashboard.putData("Autonomous twoBall", new AutonomoustwoBall());
        SmartDashboard.putData("Autonomous threeBall", new AutonomousthreeBall());
        SmartDashboard.putData("OpenIntakes", new OpenIntakes());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriver() {
        return driver;
    }
    public Joystick getCoDriver() {
        return coDriver;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}