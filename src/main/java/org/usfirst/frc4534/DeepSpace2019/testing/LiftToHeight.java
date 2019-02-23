/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.testing;

import org.usfirst.frc4534.DeepSpace2019.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftToHeight extends Command {
    protected double m_setpoint;
    public LiftToHeight(double setpoint) {
        m_setpoint = setpoint; 
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.redesignedLift);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        if (Robot.redesignedLift.getLowerLimit() == true) {
            Robot.redesignedLift.resetLiftEncoder();
        }
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        if (Robot.redesignedLift.getLiftEncoder() < m_setpoint - 10) {
            Robot.redesignedLift.liftSet(-0.5);
        }
        if (Robot.redesignedLift.getLiftEncoder() < m_setpoint + 10 && Robot.redesignedLift.getLiftEncoder() > m_setpoint - 10) {
            if (Robot.redesignedLift.getLiftEncoder() < m_setpoint) {
                Robot.redesignedLift.liftSet(-0.1);
            }
            if (Robot.redesignedLift.getLiftEncoder() > m_setpoint) {
                Robot.redesignedLift.liftSet(0.1);
            }
        }
        if (Robot.redesignedLift.getLiftEncoder() > m_setpoint + 10) {
            Robot.redesignedLift.liftSet(0.5);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        if((m_setpoint + 5) > Robot.redesignedLift.getLiftEncoder() && Robot.redesignedLift.getLiftEncoder() > (m_setpoint - 5)) {
            return true;
        }
        if(Math.abs(Robot.oi.joystick2.getRawAxis(1)) > 0.05) {
            return true; 
        }
        else return false; 
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
