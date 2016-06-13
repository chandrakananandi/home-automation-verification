package org.xtext.example.rules.analysis.resources;

public class ComputeHumidex {
	public void compute_humidex() {		
		Object Weather_Humidex = null;
		Object T = Util.f(Weather_Temperature.state);
		Object H = Util.f(Weather_Humidity.state);
		Object x = Util.f(T);
		Object e = Util.f(x, H);
		Object humidex = Util.f(T, e);
		Util.postUpdate(Weather_Humidex, humidex);
	}	
}

/*
rule "Compute humidex"
when
        Item Weather_Temperature changed or
		Item Weather_Humidity changed
then
	var Number T = Weather_Temperature.state as DecimalType
	var Number H = Weather_Humidity.state as DecimalType	
	var Number x = 7.5 * T/(237.7 + T)
	var Number e = 6.112 * Math::pow(10, x.doubleValue) * H/100
	var Number humidex = T + (new Double(5) / new Double(9)) * (e - 10)
	postUpdate(Weather_Humidex, humidex)
end

*/
