/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.commands;
import org.usfirst.frc4534.DeepSpace2019.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetHatchHook extends Command {
    protected boolean isFinished;
    protected boolean state;
    public SetHatchHook(boolean s) { 
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.testingPistons);
        state = s;
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        Robot.testingPistons.setSill(state);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        isFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
