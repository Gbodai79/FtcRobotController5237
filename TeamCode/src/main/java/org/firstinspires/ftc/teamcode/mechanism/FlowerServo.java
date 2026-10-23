package org.firstinspires.ftc.teamcode.mechanism;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class FlowerServo {

    private Servo flower;

    public void init(HardwareMap haMap){
        flower = haMap.get(Servo.class, "servo_flower");

    }

    public void setFlower(double angle){

        flower.setPosition(angle);
    }
}

