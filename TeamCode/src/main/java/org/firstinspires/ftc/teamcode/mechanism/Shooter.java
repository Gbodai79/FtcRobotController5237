package org.firstinspires.ftc.teamcode.mechanism;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

public class Shooter {
    private DcMotorEx launcher;
    private DcMotor intake;
    private CRServo windmillServo;

    public final int LAUNCHER_TARGET_VELOCITY = 1250; //2678 RPM
    public final int LAUNCHER_MIN_VELOCITY = 1200; //2571 RPM


public void init(HardwareMap haMap){
    launcher = haMap.get(DcMotorEx.class, "launcher");
    intake = haMap.get(DcMotor.class, "intake");
    windmillServo= haMap.get(CRServo.class, "windmillServo");

    intake.setDirection(DcMotorSimple.Direction.REVERSE);

    intake.setZeroPowerBehavior(BRAKE);

    windmillServo.setPower(0);

    launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    launcher.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, new PIDFCoefficients(40, 0, 0, 12.5));

    windmillServo.setDirection(DcMotorSimple.Direction.FORWARD);


}
}


