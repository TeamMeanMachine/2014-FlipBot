
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.JoystickMap;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotTemplate;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author bradmiller
 */
public class DriveLoop extends CommandBase {

    public DriveLoop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(RobotTemplate.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //System.out.println("DriveLoop: X=" + RobotTemplate.oi.driveStick.getX() + "   Y=" + RobotTemplate.oi.driveStick.getY());
//        System.out.println("DriveLoop exec" + "  left:  " + RobotMap.leftShifter.encoder.getRate() + "  right:  " + RobotMap.rightShifter.encoder.getRate());
        RobotMap.drive.arcadeDrive((OI.driveStick.getRawAxis(JoystickMap.Logitech.AxisX) * -1.0), (OI.driveStick.getRawAxis(JoystickMap.Logitech.AxisR) * -1.0));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
