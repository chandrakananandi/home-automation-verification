package org.xtext.example.rules.analysis.codegen;

public class UpdateMaxAndMinTemperatures {
	public void update_max_and_min_temperatures() {
		Number Weather_Temp_Max = null;
		Number Weather_Temp_Min = null;
		Util.postUpdate(Weather_Temp_Max, Util.f(Weather_Temperature.state));
		Util.postUpdate(Weather_Temp_Min, Util.f(Weather_Temperature.state));
	}
}

/*
rule "Update max and min temperatures"
when
	Item Weather_Temperature changed or
	Time cron "0 0 0 * * ?" or
	System started
then	
	postUpdate(Weather_Temp_Max, Weather_Temperature.maximumSince(now.toDateMidnight).state)
	postUpdate(Weather_Temp_Min, Weather_Temperature.minimumSince(now.toDateMidnight).state)
	logInfo("Weather", "Temperature evolved of " + Weather_Temperature.deltaSince(now.minusMinutes(2)) + " degrees.")
end
*/
  