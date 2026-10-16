package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.mechanism.FieldCentric;

public class BioBuzzFieldCentricOpmode extends OpMode {
    FieldCentric drive = new FieldCentric();
    double forward, strafe, rotate;

    @Override
    public void init() {
        drive.init(hardwareMap);

    }


    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        drive.driveFieldRelative(forward,strafe,rotate);


    }
}
