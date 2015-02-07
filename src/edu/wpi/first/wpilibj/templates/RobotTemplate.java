package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.*;

public class RobotTemplate extends IterativeRobot implements Pronstants{
    Compressor compressor;
    Pronstants pronstants;
    public void robotInit() {
        compressor = new Compressor(COMPRESSOR_1,COMPRESSOR_2,COMPRESSOR_3,COMPRESSOR_4);
        compressor.start();
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        
    }

    public void testPeriodic() {
    
    }
    
}
