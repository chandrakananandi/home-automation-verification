package org.xtext.example.rules.analysis.codegen;

public class UpdateRainToday {

	public void update_rain_today() {
		if (Util.cond(Rain_Garden_Counter.state)) {
			
			String Rain_Garden_Message = null;
		
			Number new_counter = Util.f(Rain_Garden_Counter.state);
			Number old_counter = Util.f(Rain_Garden_Counter.state);
			Number difference;
			Number todayRain;
			if( old_counter != new_counter )
			{
				difference = Util.f(old_counter, new_counter);
				if (Util.cond(difference)) {
					difference = Util.f(new_counter);
				}
				todayRain = Util.f(difference);
			}
			else
			{
				todayRain = 0;
			}
			String msg = Util.f(todayRain).toString();
			
			if( Util.cond(Rain_State_Garden.state))
			{
				msg = "(Rain) " + msg +" mm";
			}
			else
			{
				msg = msg +" mm";
			}

			if( Rain_Garden_Message != msg )
			{
				Util.postUpdate(Rain_Garden_Message, msg);
			}		
		}
	}
}

/*
rule "Update rain today"
when
	Time cron "0 5 0 * * ?"
	or
	Item Rain_Garden_Counter changed 
	or
	Item Rain_State_Garden changed
then	
	if( Rain_Garden_Counter.state != Uninitialized )
	{
		var Number new_counter = Rain_Garden_Counter.state as DecimalType
		var Number old_counter = Rain_Garden_Counter.historicState(now.toDateMidnight).state as DecimalType
		var Number difference
		var Number todayRain

		if( old_counter != new_counter )
		{
			difference = new_counter - old_counter
			if( difference < 0 ) difference = new_counter

			todayRain = difference * 295 / 1000
		}
		else
		{
			todayRain = 0
		}

		var String msg = new Double((Math::round((todayRain*10).doubleValue).doubleValue/10).doubleValue).toString;

		if( Rain_State_Garden.state != Uninitialized && Rain_State_Garden.state == 1 )
		{
			msg = "(Rain) " + msg +" mm"
		}
		else
		{
			msg = msg +" mm"
		}

		if( Rain_Garden_Message.state != msg )
		{
			postUpdate(Rain_Garden_Message, msg)
		}
	}
end
*/
