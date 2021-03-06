package defaults;

public class Param {
	// Throttle - Altitude 
	public static final int throttleMax = 500; //very high, will change
	 public static final int throttleMin = 130;
	 public static final int throttleDeltaMax = 10;
	 public static final double throttleScale = 1;
	 public static final double kP_t = 0.1;
	 public static final double kI_t = 0.02;
	 public static final double kD_t = 0.005;
	 
	 // Pitch - Laser Range Finder
	 public static final int pitchMax = 20; //very high, will change
	 public static final int pitchMin = -20;
	 public static final int pitchDeltaMax = 10;
	 public static final double pitchScale = 1;
	 public static final double kP_p = 0.1;
	 public static final double kI_p = 0.02;
	 public static final double kD_p = 0.005;
}
