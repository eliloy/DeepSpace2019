// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc4534.DeepSpace2019.commands;
// import org.usfirst.frc4534.DeepSpace2019.Robot;
// import edu.wpi.first.wpilibj.command.Command;

// public class ToggleHatch extends Command {
//   protected boolean state;
//   protected boolean isFinished;

//   public ToggleHatch() {
//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//     requires(Robot.intake);

//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     state = Robot.intake.getHatchPeen();
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     Robot.intake.setHatchPeen(!state);
//     isFinished = true;
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return isFinished;
//   }
//   //Ryder is gray
  
//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//   }
// }
