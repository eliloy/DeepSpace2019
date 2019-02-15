/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.subsystems;

import org.usfirst.frc4534.DeepSpace2019.Robot;
import org.usfirst.frc4534.DeepSpace2019.commands.*;

import edu.wpi.first.hal.sim.mockdata.PDPDataJNI;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class MovingMotors extends Subsystem {
    private WPI_TalonSRX vacuumMotor;
    private WPI_VictorSPX intakeMotor;
    private DigitalInput ballDetect;

    public MovingMotors() {
        vacuumMotor = new WPI_TalonSRX(8);
        intakeMotor = new WPI_VictorSPX(7);
        



        ballDetect = new DigitalInput(8);

        //vacuumMotor.getOutputCurrent();

        //pdp = new PowerDistributionPanel();
    }

    @Override
    public void initDefaultCommand() {
    
    }

    @Override
    public void periodic() {

    }

    public void intakeSet(double rate) {
        intakeMotor.set(rate);
    }

    public void vacuumSet(double rate) {
        vacuumMotor.set(rate);
    }

    public void intakeOn() {
        intakeMotor.set(0.8);
    }

    //public void getAmps() {
    //    SmartDashboard.putNumber("Motor Current", pdp.getCurrent(1));
    // }

    public boolean detectBall() {
        return ballDetect.get();
    }

    public void isBallGot() {
        SmartDashboard.putBoolean("Ball?", detectBall());
    }

}

