package org.usfirst.frc.team3710.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;

public class Drive {

    Talon talLeft;
    Talon talRight;

    
    Encoder encLeft;
    Encoder encRight;
	
    public Drive (Talon tL, Talon tR, Encoder eL, Encoder eR ){
    	
    	talLeft = tL;
        talRight = tR;

        
        encLeft = eL;
        encRight = eR;      
        
    }
}
