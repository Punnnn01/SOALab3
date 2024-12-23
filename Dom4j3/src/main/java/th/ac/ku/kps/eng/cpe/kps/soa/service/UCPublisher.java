package th.ac.ku.kps.eng.cpe.kps.soa.service;

import jakarta.xml.ws.Endpoint;
//import th.ac.ku.kps.eng.cpe.kps.soa.service.UnitConversionImpl;

public class UCPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/UC", new UnitConversionImpl());
	}
}
