/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
/**
 *
 */
public class  AutoFlapRight extends CommandGroup {
    public AutoFlapRight() {
       
       addSequential(new DriveTimeCommand(0.75, 0.0, 3.2));
       addSequential(new FlapRight());

    }
}
