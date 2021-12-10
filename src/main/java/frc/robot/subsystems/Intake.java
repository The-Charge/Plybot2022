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

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Intake extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    private static final int MAX_TICKS_PER_SEC = 20000;
    private static final double SPEED_P_CONSTANT = 0.5;
    private static final double SPEED_I_CONSTANT = 0.05;
    private static final double SPEED_D_CONSTANT = 0.1;
    private static final double SPEED_F_CONSTANT = 0;
    private WPI_TalonFX intakeMotor;
    public Intake() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        intakeMotor = new WPI_TalonFX(8);
    }
    public void stop() {
        intakeMotor.set(0);
        intakeMotor.setNeutralMode(NeutralMode.Coast);
    }

    public void run(double speed) {
        intakeMotor.set(speed);
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
    public void initSpeedMode() {
        intakeMotor.set(ControlMode.Velocity, 0);

        intakeMotor.config_kP(1, SPEED_P_CONSTANT);
        intakeMotor.config_kI(1, SPEED_I_CONSTANT);
        intakeMotor.config_kD(1, SPEED_D_CONSTANT);
        intakeMotor.config_kF(1, SPEED_F_CONSTANT);

        intakeMotor.selectProfileSlot(1,0);
    }
    public void setPercentSpeedPID(double setSpeed) {
        intakeMotor.set(ControlMode.Velocity, MAX_TICKS_PER_SEC * setSpeed);
    }
}

