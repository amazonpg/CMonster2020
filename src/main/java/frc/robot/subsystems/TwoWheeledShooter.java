/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Spark;
  
  public class TwoWheeledShooter extends SubsystemBase {

  Spark leftSpark = RobotContainer.leftSpark;
  Spark rightSpark = RobotContainer.rightSpark;
  /**
   * Creates a new TwoWheeledShooter.
   */
  public TwoWheeledShooter() {
  }
  public void ShootBallOn(){
    leftSpark.set(1);
    rightSpark.set(1);
  }
  public void ShootBallOff(){
    leftSpark.set(0);
    rightSpark.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
