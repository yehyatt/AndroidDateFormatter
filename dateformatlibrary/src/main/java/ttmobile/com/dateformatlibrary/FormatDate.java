package ttmobile.com.dateformatlibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * ttmobile.com.dateformatlibrary
 * Created by Yahya Titi on 5/1/17.
 */

public class FormatDate
{
    public static String getCustomDate(String milliSeconds, String dateFormat)
    {

        String FormattedDate = "";
        try
        {
            // Create a DateFormatter object for displaying date in specified format.
            SimpleDateFormat formatter = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
            long longMilliSeconds = Long.parseLong(milliSeconds);
            // Create a calendar object that will convert the date and time value in milliseconds to date.
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longMilliSeconds);
            FormattedDate = formatter.format(calendar.getTime());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return FormattedDate;
    }
}
