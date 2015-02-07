package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.*;

public class RobotTemplate extends IterativeRobot implements Pronstants{
    Compressor compressor;
    Pronstants pronstants;
    public void robotInit() {
        compressor = new Compressor(COMPRESSOR_ID1,COMPRESSOR_ID2,COMPRESSOR_ID3,COMPRESSOR_ID4);
        compressor.start();
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        
    }

    public void testPeriodic() {
    
    }
    
}
