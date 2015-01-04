/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.RobotTemplate;

/**
 *
 * @author FIRST
 */
public class DriveTimeCommand extends CommandBase {
    double time, stoptime;
    double x;
    double y;
    boolean started = false;
    String timeFromDashboard;
    
    public DriveTimeCommand(double _x, double _y, double _time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(RobotMap.drive);
        x = _x;
        y = _y;
        time = _time;
        //setTimeout(time);
        requires(RobotTemplate.driveTrain);
    }
    public DriveTimeCommand (double _x, double _y, String _time){
        x = _x;
        y = _y;
        timeFromDashboard = _time;
        double testTime = SmartDashboard.getNumber(timeFromDashboard, 900.00);
        if(testTime > 200.00) { // No valid time from dashboard
            SmartDashboard.putNumber(timeFromDashboard, 5.0);
        }
        requires(RobotTemplate.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
         if(!started) {
            started = true;
            if(timeFromDashboard != null) {
                setTimeout(SmartDashboard.getNumber(timeFromDashboard));
            }
            else {
                setTimeout(time);
            }
        }
       
        RobotMap.drive.arcadeDrive(x , y);
        //RobotMap.drive.setExpiration(time);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        boolean rtn = isTimedOut();
        System.out.println("DTC execute: " + rtn);
        return rtn;
    }

    // Called once after isFinished returns true
    protected void end() {
        started = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.println("DTC interrupted");
        end();
    }
}
