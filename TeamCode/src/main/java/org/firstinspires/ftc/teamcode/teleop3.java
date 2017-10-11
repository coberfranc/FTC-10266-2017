//package org.firstinspires.ftc.teamcode;
//import com.ftdi.j2xx.D2xxManager;
//import com.qualcomm.robotcore.robocol.PeerApp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import com.qualcomm.robotcore.hardware.DigitalChannel;

/* Teleop Motro Speed Control  */

@TeleOp(name="Teleop3", group="Iterative OpMode")  // @Autonomous(...) is the other common choic
//@Disabled
public class Teleop3 extends OpMode {
    /* Declare OpMode members. */
    private ElapsedTime runtime = new ElapsedTime();

    DcMotor frontLeftMotor;
    DcMotor frontRightMotor;

    DcMotor backLeftMotor;
    DcMotor backRightMotor;

    DcMotor liftMotor;


    DigitalChannel digitalTouch;  // Hardware Device Object

    // DcMotor leftShooterMotor;
    // DcMotor rightShooterMotor;



    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");

        /* eg: Initialize the hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names assigned during the robot configuration
         * step (using the FTC Robot Controller app on the phone).
         */
//        frontLeftMotor = hardwareMap.dcMotor.get("frontLeftDrive");
//        frontRightMotor = hardwareMap.dcMotor.get("frontRightDrive");
//        backLeftMotor = hardwareMap.dcMotor.get("backLeftDrive");
//        backRightMotor = hardwareMap.dcMotor.get("backRightDrive");
        liftMotor = hardwareMap.dcMotor.get("liftMotor");



        // eg: Set the drive motor directions:
        // Reverse the motor that runs backwards when connected directly to the battery
//         frontLeftMotor.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
//         frontRightMotor.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
//        backLeftMotor.setDirection(DcMotor.Direction.FORWARD);
//        backRightMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {


    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    //@Override
    public void loop() {

        //telemetry.addData("Status", "Running: " + runtime.toString());
//        telemetry.addData("Front Left Ticks:", frontLeftMotor.getCurrentPosition());
//        telemetry.addData("Front Right Ticks", frontRightMotor.getCurrentPosition());
//        telemetry.addData("Motor Output", "Front Left" + frontLeftMotor.getPower());
//        telemetry.addData("Motor Output", "Front Right" + frontRightMotor.getPower());
//        telemetry.addData("Motor Output", "Rear Left" + backLeftMotor.getPower());
//        telemetry.addData("Motor Output", "Rear Right" + backRightMotor.getPower());
//
//
//        frontLeftMotor.setPower(gamepad1.left_stick_y);
//        frontRightMotor.setPower(-gamepad1.right_stick_y);
//
//        backLeftMotor.setPower(gamepad1.left_stick_y);
//        backRightMotor.setPower(-gamepad1.right_stick_y);
//
//
//        if (gamepad1.left_bumper) {
//            frontRightMotor.setPower(-0.8);
//            frontLeftMotor.setPower(0.8);
//         }
//
//        if (gamepad1.right_bumper) {
//            frontRightMotor.setPower(-0.5);
//            frontLeftMotor.setPower(0.5);
//        }

        digitalTouch = hardwareMap.get(DigitalChannel.class, "sensor_digital");
        // set the digital channel to input.
        digitalTouch.setMode(DigitalChannel.Mode.INPUT);

        if (digitalTouch.getState() == true) {
            telemetry.addData("Digital Touch", "Is Not Pressed");
        } else {
            telemetry.addData("Digital Touch", "Is Pressed");
        }

//        if (digitalTouch.getState() == true) {
//            liftMotor.setPower(0);
//        }

        if (gamepad1.y) {
            liftMotor.setPower(.35);
        }
        else    if (gamepad1.a) {
            liftMotor.setPower(-.35);
        }
        else {
            liftMotor.setPower(0);
        }

        // if(gamepad2.dpad_down) {
        //  intakeHighMotor.setPower(1);
        //}
        // KEEP, worked for grabber arm
        /*
        if (gamepad1.a) {
            servo0.setPosition(1);
            servo1.setPosition(0);
        } else {
            servo0.setPosition(0);
            servo1.setPosition(1);
        }
        */
        //if (gamepad1.a) {
        //    servo0.setPosition(1);
        //} else {
        //    servo0.setPosition(0);
//        /}
        //if (gamepad2.x) {
        //  positionx += INCREMENT;
        //  if (positionx >= MAX_POS) {
        //positionx = MAX_POS;

        // }
        //servo3.setPosition(positionx);
        //  }
        // else {
        //   positionx -= INCREMENT;
        //  if (positionx <= MIN_POS) {
        //    positionx = MIN_POS;

        // }
        // servo3.setPosition(positionx);
        // }

        //if (gamepad2.b) {
        //   positionb += INCREMENT;
        //  if (positionb >= MAX_POS) {
        //     positionb = MAX_POS;
        //     servo2.setPosition(positionb);
        // }

        // } else {
        //   positionb -= INCREMENT;
        // if (positionb <= MIN_POS) {
        //    positionb = MIN_POS;
        // }
        //  servo2.setPosition(positionb);
        //  }

        //  if (gamepad2.left_bumper) {
        //     intakeLowMotor.setPower(-1);
        // } else if (gamepad2.right_bumper) {
        //     intakeHighMotor.setPower(-1);
        //} else {
        ///    intakeLowMotor.setPower(0);
        //   intakeHighMotor.setPower(0);
        // }
        // if (gamepad2.y) {
        //    leftShooterMotor.setPower(1);
        //    rightShooterMotor.setPower(-1);
        // } else {
        //  leftShooterMotor.setPower(0);
        //   rightShooterMotor.setPower(0);


        // }

    }


    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}


