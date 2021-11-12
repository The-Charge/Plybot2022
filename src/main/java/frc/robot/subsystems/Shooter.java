// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Shooter extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonFX shooterMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private static final int MAX_TICKS_PER_SEC = 20000;

    private static final double SPEED_P_CONSTANT = 0.5;
    private static final double SPEED_I_CONSTANT = 0.05;
    private static final double SPEED_D_CONSTANT = 0.1;
    private static final double SPEED_F_CONSTANT = 0;

    /**
    *
    */
    public Shooter() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
shooterMotor = new WPI_TalonFX(0);
 
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void stop() {
        shooterMotor.set(0);
        shooterMotor.setNeutralMode(NeutralMode.Coast);
    }

    public void run(double speed) {
        shooterMotor.set(speed);
    }

    public void initSpeedMode() {
        shooterMotor.set(ControlMode.Velocity, 0);

        shooterMotor.config_kP(1, SPEED_P_CONSTANT);
        shooterMotor.config_kI(1, SPEED_I_CONSTANT);
        shooterMotor.config_kD(1, SPEED_D_CONSTANT);
        shooterMotor.config_kF(1, SPEED_F_CONSTANT);
        shooterMotor.selectProfileSlot(1,0);

    }

    public void setPercentSpeedPID(double setSpeed) {
        shooterMotor.set(ControlMode.Velocity, MAX_TICKS_PER_SEC * setSpeed);
    }

}
