/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author FIRST
 */
public class DANCE extends CommandGroup {
    
    public DANCE() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //addSequential(new FlapLeft());
        addSequential(new RotateTimeCommand(0.5, 0.0, 3.0));
       //addSequential(new DriveTimeCommand(0.5, 0.0, 0.5));
       //addSequential(new FlapLeft());
    }

}