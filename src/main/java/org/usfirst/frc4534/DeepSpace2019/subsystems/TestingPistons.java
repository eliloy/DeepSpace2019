/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4534.DeepSpace2019.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TestingPistons extends Subsystem {
  private boolean state;
  private Solenoid solenoid1; 
  private Solenoid solenoid2;
  private Solenoid solenoid3;
  private Solenoid solenoid4;
  private Solenoid solenoid5;
  private Solenoid solenoid6;
  private Solenoid solenoid7;
  private Solenoid solenoid8;
  

  public TestingPistons(){
    solenoid1 = new Solenoid(30, 1);
    addChild("solenoid1", solenoid1);

    solenoid2 = new Solenoid(30, 2);
    addChild("solenoid2", solenoid2);

    solenoid3 = new Solenoid(30, 3);
    addChild("solenoid3", solenoid3);

    solenoid4 = new Solenoid(30, 4);
    addChild("solenoid4", solenoid4);

    solenoid5 = new Solenoid(30, 5);
    addChild("solenoid5", solenoid5);

    solenoid6 = new Solenoid(30, 6);
    addChild("solenoid6", solenoid6);

    solenoid7 = new Solenoid(30, 7);
    addChild("solenoid7", solenoid7);

    solenoid8 = new Solenoid(30, 8);
    addChild("solenoid8", solenoid8);

  
    
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void periodic(){

  }

  public boolean getSaul(){
    return solenoid1.get();
  }
public void setSaul(boolean state){
  solenoid1.set(state);
}

public boolean getSeoul(){
  return solenoid2.get();
}

public void setSeoul(boolean state){
  solenoid2.set(state);
}

public boolean getSeal(){
  return solenoid3.get();
}

public void setSeal(boolean state){
  solenoid3.set(state);
}

public boolean getSoul(){
  return solenoid4.get();
}

public void setSoul(boolean state){
  solenoid4.set(state);
}
}
