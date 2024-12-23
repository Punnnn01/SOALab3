package th.ac.ku.kps.eng.cpe.kps.soa.service;

import jakarta.jws.WebService;
//import th.ac.ku.kps.eng.cpe.kps.soa.service.*;

@WebService (endpointInterface = "th.ac.ku.kps.eng.cpe.kps.soa.service.UnitConverstion")
public class UnitConversionImpl implements UnitConverstion {
	
	public double c2f(double degrees) {
		return degrees * 9.0 / 5.0 + 32;
	}
	
	public double cm2in(double cm) {
		return cm / 2.54;
	}
	
	public double f2c(double degrees) {
		return (degrees - 32) * 5.0 / 9.0;
	}
	
	public double in2cm(double in) {
		return in * 2.54;
	}
}
