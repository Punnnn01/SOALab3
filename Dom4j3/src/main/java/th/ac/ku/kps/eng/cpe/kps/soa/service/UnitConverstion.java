package th.ac.ku.kps.eng.cpe.kps.soa.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface UnitConverstion {
	@WebMethod double c2f(double degree);
	@WebMethod double cm2in(double cm);
	@WebMethod double f2c(double degree);
	@WebMethod double in2cm(double in);
}
