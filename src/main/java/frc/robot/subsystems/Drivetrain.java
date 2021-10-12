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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Drivetrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonFX leftFrontMotor;
    private WPI_TalonFX leftMidMotor;
    private WPI_TalonFX leftBackMotor;
    private WPI_TalonFX rightFrontMotor;
    private WPI_TalonFX rightMidMotor;
    private WPI_TalonFX rightBackMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
    *
    */
    public Drivetrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftFrontMotor = new WPI_TalonFX(1);

        leftMidMotor = new WPI_TalonFX(2);

        leftBackMotor = new WPI_TalonFX(3);

        rightFrontMotor = new WPI_TalonFX(4);

        rightMidMotor = new WPI_TalonFX(5);

        rightBackMotor = new WPI_TalonFX(6);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        leftMidMotor.follow(leftFrontMotor);
        leftBackMotor.follow(leftFrontMotor);

        rightMidMotor.follow(rightFrontMotor);
        rightBackMotor.follow(rightFrontMotor);
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

    public void run(double l, double r){
        leftFrontMotor.set(l);
        rightFrontMotor.set(r);
        //test, test, test
    }

}
