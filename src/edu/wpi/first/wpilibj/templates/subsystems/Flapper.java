/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author FIRST
 */
public class Flapper extends Subsystem {
    Solenoid flapLeft;
    Solenoid flapMiddle;
    Solenoid flapRight;
    boolean rightActive = true;
    boolean leftActive = true;
    boolean middleActive = true;

    public Flapper(){
        flapLeft = RobotMap.leftFlap;
        flapMiddle = RobotMap.midFlap;
        flapRight = RobotMap.rightFlap;
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
    public void flapRight (){
        rightActive = !rightActive;
        flapRight.set(rightActive);
        //System.out.println("flap Right");
    }
    public void flapLeft (){
        leftActive = !leftActive;
        flapLeft.set(leftActive);
        //System.out.println("flap Left");
    }
    public void flapMiddle (){
        middleActive = !middleActive;
        flapMiddle.set(middleActive);
        //System.out.println("flap Mid");
    }
    public void reset(){
        flapMiddle.set(false);
        flapLeft.set(false);
        flapRight.set(false);
        rightActive = false;
        leftActive = false;
        middleActive = false;
    }
}