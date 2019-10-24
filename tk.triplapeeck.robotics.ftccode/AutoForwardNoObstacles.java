package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
@Autonomous

public class AutoForwardNoObstacles extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized, Starting Bot Functions");
        telemetry.update();
         leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
         rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
         leftDrive.setDirection(DcMotor.Direction.FORWARD);
         rightDrive.setDirection(DcMotor.Direction.REVERSE);
         waitForStart();
         runtime.reset();
        while (opModeIsActive()) {
            double drive = -gamepad1.left_stick_y;
            double turn  =  gamepad1.right_stick_x;
            leftPower    = Range.clip(1, 1.0) ;
            rightPower   = Range.clip(1, 1.0) ;
            leftDrive.setPower(leftPower);
            rightDrive.setPower(rightPower);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);
            elemetry.addData("STATUS", "Running");
            telemetry.update();
        }
    }
    // Trip, write your damn code here
}
