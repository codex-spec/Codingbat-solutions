// Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, 
// ...6=Sat, and a boolean indicating if we are on vacation, 
// return a string of the form "7:00" indicating when the 
// alarm clock should ring. Weekdays, the alarm should be 
// "7:00" and on the weekend it should be "10:00". 
// Unless we are on vacation -- then on weekdays it should 
// be "10:00" and weekends it should be "off".


// alarmClock(1, false) → "7:00"
// alarmClock(5, false) → "7:00"
// alarmClock(0, false) → "10:00"

public String alarmClock(int day, boolean vacation) {
  String s = "";
  if(vacation && (day == 0 || day == 6))
    s = "off";
  else if(vacation && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5))
    s = "10:00";
  else if(vacation == false && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5))
    s = "7:00";
  else if(vacation == false && (day == 0 || day == 6))
    s = "10:00";
    
    return s;
}
