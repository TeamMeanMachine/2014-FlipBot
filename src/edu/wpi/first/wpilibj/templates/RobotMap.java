package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.templates.subsystems.Flipper;

public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static SpeedController frontLeft;
    public static SpeedController frontRight;
    public static SpeedController backLeft;
    public static SpeedController backRight;
    public static SpeedController flipper;
    public static Solenoid leftFlap;
    public static Solenoid rightFlap;
    public static Solenoid midFlap;
    public static DigitalInput leftFlapLimit;
    public static DigitalInput rightFlapLimit;
    public static DigitalInput midFlapLimit;
    public static DigitalInput lowerFlipperLimit;
    public static DigitalInput upperFlipperLimit;
    public static CompressorControl compressor;
    public static RobotDrive drive;
    public static RobotDrive mechDrive;
    
    
     public static void  init() {
         frontLeft = new Jaguar(1);  
         frontRight = new Jaguar(2);
         backLeft = new Jaguar(3);
         backRight = new Jaguar(4);
         flipper = new Jaguar(5);
         lowerFlipperLimit = new DigitalInput(2);
         upperFlipperLimit = new DigitalInput(3);
         
         drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
         
         leftFlap = new Solenoid(1);
         midFlap = new Solenoid(2);
         rightFlap = new Solenoid(3);
         
         compressor = new CompressorControl(1, 1); //relay, chanps
     }
}
