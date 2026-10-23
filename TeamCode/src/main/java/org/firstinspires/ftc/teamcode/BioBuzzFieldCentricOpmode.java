package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;


import org.firstinspires.ftc.teamcode.mechanism.FieldCentric;
import org.firstinspires.ftc.teamcode.mechanism.FlowerServo;
import org.firstinspires.ftc.teamcode.mechanism.Shooter;

@Disabled
@TeleOp(name = "BioBuzzFieldCentricOpmode", group = "StarterBot")

public class BioBuzzFieldCentricOpmode extends OpMode {
    FieldCentric drive = new FieldCentric();
    double forward, strafe, rotate;
    private IMU imu;
    FlowerServo flower = new FlowerServo();

    Shooter shooter = new Shooter();

    @Override
    public void init() {
        drive.init(hardwareMap);
        imu = hardwareMap.get(IMU.class, "imu");
        flower.init(hardwareMap);
        shooter.init(hardwareMap);

    }


    @Override
    public void loop() {
        if (gamepad1.x) {
            imu.resetYaw();
        }
        if (gamepad2.dpad_right) {
            flower.setFlower(0.45);
        } else {
            flower.setFlower(0.0);

        }
        double speed = gamepad1.left_bumper ? 0.3 : 1.0;



        forward = -gamepad1.left_stick_y * speed;
        strafe = gamepad1.left_stick_x * speed;
        rotate = gamepad1.right_stick_x * speed;

        drive.driveFieldRelative(forward, strafe, rotate);



        }


    }

