package garits;

import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;

public class ReminderCount implements Runnable {
    PreparedStatement prestate;
    DBConnect db;
    boolean checked = false;
    ReminderCount() {
        //Creating a new connection to the database
       db = new DBConnect();
    }

    public int getDate() {
        //Getting the date and placing it ina a variable
        Calendar cal = Calendar.getInstance();
        //Placing the date into a int variable
        int i = cal.get(Calendar.DATE);
        //returning the date
        return i;
    }

    public int getMonth() {
        //Getting the month and placing it ina a variable
        Calendar cal = Calendar.getInstance();
        //Placing the month into a int variable
        int i = cal.get(Calendar.MONTH);
        //returning the month
        return i;
    }
    
    @Override
    public void run() {
        try {
            //Getting todats date
            Calendar cal = Calendar.getInstance();
            //Getting the last day of the month
            int lDay = cal.getActualMaximum(Calendar.DATE);
            //Getting the current day of the month
            int cDay = cal.get(Calendar.DATE);
            //Getting the current month
            int m = cal.get(Calendar.MONTH);
            //Loop forever
            forever:
            while (true) {
                //if check is true
                if (checked == true) {
                    //And its the first day of the month
                    if (cDay == 1) {
                        //Make check become false
                        checked = false;
                    }
                }
                //If its the last day of the month and check is false
                if (cDay == lDay && (checked == false)) {
                    try {
                        //Creating a MySQL to change the reminder count
                        prestate = db.conn.prepareStatement("UPDATE `jobSheets` SET `reminder count` = 1 WHERE `HasPaid` = 'No' AND `reminder count` = 0 ");
                        //Execute the query
                        prestate.execute();
                    } catch (Exception ex) {
                        //Print all the errors to the terminal
                        ex.printStackTrace();
                    }
                    //Add to the first day of the month
                    cal.add(Calendar.MONTH, 1);
                    //Set a the max day of the month
                    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                    //getting the current time
                    Date d = cal.getTime();
                    //Getting current time and date
                    Calendar cal2 = Calendar.getInstance();
                    //Setting a time
                    cal2.setTime(d);
                    //Setting the last day of the month
                    lDay = cal2.get(Calendar.DAY_OF_MONTH);
                    //Making check become true
                    checked = true;
                }
                //Getting the current date
                cDay = getDate();
                //Getting the current month
                m = getMonth();
            }
        } catch (Exception ex) {
            //Print any errors to the terminal
            ex.printStackTrace();
        }
    }
}