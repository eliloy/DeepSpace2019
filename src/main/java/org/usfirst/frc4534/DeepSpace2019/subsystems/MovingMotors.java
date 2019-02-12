/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.subsystems;

import org.usfirst.frc4534.DeepSpace2019.Robot;
import org.usfirst.frc4534.DeepSpace2019.commands.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;

/**
 * Add your docs here.
 */
public class MovingMotors extends Subsystem {
    private WPI_TalonSRX vacuumMotor;
    private WPI_VictorSPX intakeMotor;
    private WPI_VictorSPX liftMotor;
    private Encoder liftEncoder;

    public MovingMotors() {
        vacuumMotor = new WPI_TalonSRX(8);
        intakeMotor = new WPI_VictorSPX(7);
        liftMotor = new WPI_VictorSPX(6);

        liftEncoder = new Encoder(4, 5, false, EncodingType.k4X);
        addChild("liftEncoder",liftEncoder);
        liftEncoder.setDistancePerPulse(1.0);
        liftEncoder.setPIDSourceType(PIDSourceType.kRate);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new TestLift());
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

    public void liftSet(double rate) {
        liftMotor.set(rate);
    }

    public void intakeOn() {
        intakeMotor.set(0.8);
    }

    public void resetLiftEncoder() {
        liftEncoder.reset();
    }
    public double getLiftEncoder() {
        return liftEncoder.getDistance();
    }
}
