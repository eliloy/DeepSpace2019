/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.commands;
import org.usfirst.frc4534.DeepSpace2019.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;
import com.kauailabs.navx.frc.*;

public class GetNavxData extends Command {
  public GetNavxData() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.navx);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
            
      // Timer.delay(0.020);		/* wait for one motor update time period (50Hz)     */
      
      // boolean zero_yaw_pressed = false; //stick.getTrigger();
      // if ( zero_yaw_pressed ) {
      //     Robot.navx.ahrs.zeroYaw();
      // }

      // /* Display 6-axis Processed Angle Data                                      */
      // SmartDashboard.putBoolean(  "IMU_Connected",        Robot.navx.ahrs.isConnected());
      // SmartDashboard.putBoolean(  "IMU_IsCalibrating",    Robot.navx.ahrs.isCalibrating());
      // SmartDashboard.putNumber(   "IMU_Yaw",              Robot.navx.ahrs.getYaw());
      // SmartDashboard.putNumber(   "IMU_Pitch",            Robot.navx.ahrs.getPitch());
      // SmartDashboard.putNumber(   "IMU_Roll",             Robot.navx.ahrs.getRoll());
      
      // /* Display tilt-corrected, Magnetometer-based heading (requires             */
      // /* magnetometer calibration to be useful)                                   */
      
      // SmartDashboard.putNumber(   "IMU_CompassHeading",   Robot.navx.ahrs.getCompassHeading());
      
      // /* Display 9-axis Heading (requires magnetometer calibration to be useful)  */
      // SmartDashboard.putNumber(   "IMU_FusedHeading",     Robot.navx.ahrs.getFusedHeading());

      // /* These functions are compatible w/the WPI Gyro Class, providing a simple  */
      // /* path for upgrading from the Kit-of-Parts gyro to the navx MXP            */
      
      // SmartDashboard.putNumber(   "IMU_TotalYaw",         Robot.navx.ahrs.getAngle());
      // SmartDashboard.putNumber(   "IMU_YawRateDPS",       Robot.navx.ahrs.getRate());

      // /* Display Processed Acceleration Data (Linear Acceleration, Motion Detect) */
      
      // SmartDashboard.putNumber(   "IMU_Accel_X",          Robot.navx.ahrs.getWorldLinearAccelX());
      // SmartDashboard.putNumber(   "IMU_Accel_Y",          Robot.navx.ahrs.getWorldLinearAccelY());
      // SmartDashboard.putBoolean(  "IMU_IsMoving",         Robot.navx.ahrs.isMoving());
      // SmartDashboard.putBoolean(  "IMU_IsRotating",       Robot.navx.ahrs.isRotating());

      // /* Display estimates of velocity/displacement.  Note that these values are  */
      // /* not expected to be accurate enough for estimating robot position on a    */
      // /* FIRST FRC Robotics Field, due to accelerometer noise and the compounding */
      // /* of these errors due to single (velocity) integration and especially      */
      // /* double (displacement) integration.                                       */
      
      // SmartDashboard.putNumber(   "Velocity_X",           Robot.navx.ahrs.getVelocityX());
      // SmartDashboard.putNumber(   "Velocity_Y",           Robot.navx.ahrs.getVelocityY());
      // SmartDashboard.putNumber(   "Displacement_X",       Robot.navx.ahrs.getDisplacementX());
      // SmartDashboard.putNumber(   "Displacement_Y",       Robot.navx.ahrs.getDisplacementY());
      
      // /* Display Raw Gyro/Accelerometer/Magnetometer Values                       */
      // /* NOTE:  These values are not normally necessary, but are made available   */
      // /* for advanced users.  Before using this data, please consider whether     */
      // /* the processed data (see above) will suit your needs.                     */
      
      // SmartDashboard.putNumber(   "RawGyro_X",            Robot.navx.ahrs.getRawGyroX());
      // SmartDashboard.putNumber(   "RawGyro_Y",            Robot.navx.ahrs.getRawGyroY());
      // SmartDashboard.putNumber(   "RawGyro_Z",            Robot.navx.ahrs.getRawGyroZ());
      // SmartDashboard.putNumber(   "RawAccel_X",           Robot.navx.ahrs.getRawAccelX());
      // SmartDashboard.putNumber(   "RawAccel_Y",           Robot.navx.ahrs.getRawAccelY());
      // SmartDashboard.putNumber(   "RawAccel_Z",           Robot.navx.ahrs.getRawAccelZ());
      // SmartDashboard.putNumber(   "RawMag_X",             Robot.navx.ahrs.getRawMagX());
      // SmartDashboard.putNumber(   "RawMag_Y",             Robot.navx.ahrs.getRawMagY());
      // SmartDashboard.putNumber(   "RawMag_Z",             Robot.navx.ahrs.getRawMagZ());
      // SmartDashboard.putNumber(   "IMU_Temp_C",           Robot.navx.ahrs.getTempC());
      // SmartDashboard.putNumber(   "IMU_Timestamp",        Robot.navx.ahrs.getLastSensorTimestamp());
      
      // /* Omnimount Yaw Axis Information                                           */
      // /* For more info, see http://navx-mxp.kauailabs.com/installation/omnimount  */
      // AHRS.BoardYawAxis yaw_axis = Robot.navx.ahrs.getBoardYawAxis();
      // SmartDashboard.putString(   "YawAxisDirection",     yaw_axis.up ? "Up" : "Down" );
      // SmartDashboard.putNumber(   "YawAxis",              yaw_axis.board_axis.getValue() );
      
      // /* Sensor Board Information                                                 */
      // SmartDashboard.putString(   "FirmwareVersion",      Robot.navx.ahrs.getFirmwareVersion());
      
      // /* Quaternion Data                                                          */
      // /* Quaternions are fascinating, and are the most compact representation of  */
      // /* orientation data.  All of the Yaw, Pitch and Roll Values can be derived  */
      // /* from the Quaternions.  If interested in motion processing, knowledge of  */
      // /* Quaternions is highly recommended.                                       */
      // SmartDashboard.putNumber(   "QuaternionW",          Robot.navx.ahrs.getQuaternionW());
      // SmartDashboard.putNumber(   "QuaternionX",          Robot.navx.ahrs.getQuaternionX());
      // SmartDashboard.putNumber(   "QuaternionY",          Robot.navx.ahrs.getQuaternionY());
      // SmartDashboard.putNumber(   "QuaternionZ",          Robot.navx.ahrs.getQuaternionZ());
      
      // /* Connectivity Debugging Support                                           */
      // SmartDashboard.putNumber(   "IMU_Byte_Count",       Robot.navx.ahrs.getByteCount());
      // SmartDashboard.putNumber(   "IMU_Update_Count",     Robot.navx.ahrs.getUpdateCount());
  }
  

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
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
