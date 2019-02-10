// // RobotBuilder Version: 2.0
// //
// // This file was generated by RobotBuilder. It contains sections of
// // code that are automatically generated and assigned by robotbuilder.
// // These sections will be updated in the future when you export to
// // Java from RobotBuilder. Do not put any code or make any change in
// // the blocks indicating autogenerated code or it will be lost on an
// // update. Deleting the comments indicating the section will prevent
// // it from being updated in the future.


// package org.usfirst.frc4534.DeepSpace2019.subsystems;


// import org.usfirst.frc4534.DeepSpace2019.commands.*;
// import edu.wpi.first.wpilibj.livewindow.LiveWindow;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.PIDOutput;
// import edu.wpi.first.wpilibj.PIDSource;

// import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
// // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
// import edu.wpi.first.wpilibj.Solenoid;

//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


// /**
//  *
//  */
// public class Intake extends Subsystem {

//     // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

//     // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//     private Solenoid intakeSolenoid;
//     private Solenoid drSolenoid;
//     private Solenoid hatchSolenoid;
//     private WPI_VictorSPX intakeJPL;
//     private WPI_TalonSRX vacuumJPL;

//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

//     public Intake() {
//         // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//         intakeSolenoid = new Solenoid(0, 2);
//         addChild("intakeSolenoid",intakeSolenoid); 
        
//         hatchSolenoid = new Solenoid(0, 3);
//         addChild("hatchSolenoid", hatchSolenoid);
               
//         intakeJPL = new WPI_VictorSPX(7);

//         drSolenoid = new Solenoid(0, 4);
//         addChild("drSolenoid", drSolenoid);
        

//         vacuumJPL = new WPI_TalonSRX(8);
        


//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//     }

//     @Override
//     public void initDefaultCommand() {
//         // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

//         // Set the default command for a subsystem here.
//         // setDefaultCommand(new MySpecialCommand());
//     }

//     @Override
//     public void periodic() {
//         // Put code here to be run every loop

//     }

//     // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


//     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

//     // Put methods for controlling this subsystem
//     // here. Call these from Commands.

//     public boolean getRocket(){
//         return intakeSolenoid.get();
    
//     }

//     public boolean getdrSolenoid(){
//         return drSolenoid.get();
//     }

//     public void setRocket(boolean state){
//         intakeSolenoid.set(state);
//         drSolenoid.set(state);
        
//     }

//     public void setdrSolenoid(boolean state){
//         drSolenoid.set(state);
//     }
//     public void setIntakeSpeed(double speeed){
//         intakeJPL.set(speeed);
//     }
//     public void setHatchPeen(boolean state){
//         hatchSolenoid.set(state);
//     }
//     public boolean getHatchPeen(){
//         return hatchSolenoid.get();
//     }
//     public void setVacuumPower(double powah) {
//         vacuumJPL.set(powah);
//     }
// }

