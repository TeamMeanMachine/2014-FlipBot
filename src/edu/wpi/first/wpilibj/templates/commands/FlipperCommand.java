/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotTemplate;
import edu.wpi.first.wpilibj.templates.subsystems.Flipper;

/**
 *
 * @author programming
 */

public class FlipperCommand extends CommandBase{
    
    Flipper flipes;
    
    public FlipperCommand() {
        requires(RobotTemplate.flippy);
        flipes = RobotTemplate.flippy;
    }
    public void initialize(){
        
    }
    public void execute(){
        flipes.flip(OI.coStick.getAxis(Joystick.AxisType.kZ));
        //System.out.println("It be flippin in the command (executing)");
    }
    public void end (){
        flipes.flip(0);
    }
    public void interrupted(){
        flipes.flip(0);
    }
    public boolean isFinished(){
        return false;
    }
}
