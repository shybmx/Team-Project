package garits;

import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;

public class ReminderCount implements Runnable {

    PreparedStatement prestate;
    DBConnect db;
    boolean checked = false;
    
   
    ReminderCount() {
       db = new DBConnect();
        
    }

    public int getDate() {
        Calendar cal = Calendar.getInstance();
        int i = cal.get(Calendar.DATE);
        //System.out.println(i);
       
        return i;
    }

    public int getMonth() {
        Calendar cal = Calendar.getInstance();
        int i = cal.get(Calendar.MONTH);
        //System.out.println(i);
        return i;
    }
    


    @Override
    public void run() {
        try {

            Calendar cal = Calendar.getInstance();
            int lDay = cal.getActualMaximum(Calendar.DATE);
            int cDay = cal.get(Calendar.DATE);
            int m = cal.get(Calendar.MONTH);
            //System.out.println("HI" + lDay);
            forever:
            while (true) {
                if (checked == true) {
                    if (cDay == 1) {
                        checked = false;
                    }
                }
                if (cDay == lDay && (checked == false)) {
                    //System.out.println("Hi its last day of the month " + m + " " + lDay);
                    
                    try {
                        System.out.println("REMINDER");
                        prestate = db.conn.prepareStatement("UPDATE `jobSheets` SET `reminder count` = 1 WHERE `HasPaid` = 'No' AND `reminder count` = 0 ");
                        prestate.execute();
                     
                       
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    cal.add(Calendar.MONTH, 1);
                    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                    Date d = cal.getTime();
                    Calendar cal2 = Calendar.getInstance();
                    cal2.setTime(d);
                    lDay = cal2.get(Calendar.DAY_OF_MONTH);
                    //System.out.println(cal2.get(Calendar.DAY_OF_MONTH));
                    checked = true;
                    //continue forever;

                }
                //cDay = cal.get(Calendar.DATE);
                cDay = getDate();
                m = getMonth();
                //System.out.println(cDay);
                //cDay = cDay + 1;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
