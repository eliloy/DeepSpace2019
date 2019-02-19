/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.subsystems;

import org.usfirst.frc4534.DeepSpace2019.Robot;
import org.usfirst.frc4534.DeepSpace2019.commands.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class MovingMotors extends Subsystem {
    private WPI_TalonSRX vacuumMotor;


    public MovingMotors() {
        vacuumMotor = new WPI_TalonSRX(8);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new ToggleVacuum());
    }

    @Override
    public void periodic() {
    }

    public void vacuumSet(double rate) {
        vacuumMotor.set(rate);
    }

    public double vacuumGet() {
        return vacuumMotor.get();
    }
}

