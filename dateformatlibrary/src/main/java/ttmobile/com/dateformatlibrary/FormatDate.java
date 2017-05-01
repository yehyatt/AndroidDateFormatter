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

    /**
     * Example 25 08 1981
     */
    //Example 25 08 1981
    public static String ddMMyyyy()
    {
        return "dd MM yyyy";
    }

    /**
     * Example 08 25 1981
     */
    public static String MMddyyyy()
    {
        return "MM dd yyyy";
    }

    /**
     * Example 25-08-1981
     */
    public static String ddMMyyyyDashSeparated()
    {
        return "dd-MM-yyyy";
    }

    /**
     * Example 08-25-1981
     */
    public static String MMddyyyyDashSeparated()
    {
        return "MM-dd-yyyy";
    }

    /**
     * Example 25/08/1981
     */
    public static String ddMMyyyySlashSeparated()
    {
        return "dd/MM/yyyy";
    }

    /**
     * Example 08/25/1981
     */
    public static String MMddyyyySlashSeparated()
    {
        return "MM/dd/yyyy";
    }

    /**
     * Example Aug 25, 1981
     */
    public static String MMMddyyyy()
    {
        return "MMM dd, yyyy";
    }

    /**
     * Example 25 08 81
     */
    public static String ddMMyy()
    {
        return "dd MM yy";
    }

    /**
     * Example 08 25 81
     */
    public static String MMddyy()
    {
        return "MM dd yy";
    }

    /**
     * Example 25-08-81
     */
    public static String ddMMyyDashSeparated()
    {
        return "dd-MM-yy";
    }

    /**
     * Example 08-25-81
     */
    public static String MMddyyDashSeparated()
    {
        return "MM-dd-yy";
    }

    /**
     * Example 25/08/81
     */
    public static String ddMMyySlashSeparated()
    {
        return "dd/MM/yy";
    }

    /**
     * Example 08/25/81
     */
    public static String MMddyySlashSeparated()
    {
        return "MM/dd/yy";
    }

    /**
     * Example Aug 25, 81
     */
    public static String MMMddyy()
    {
        return "MMM dd, yy";
    }


    public static String getCustomDate(String milliSeconds, String dateFormat)
    {

        String FormattedDate = "";
        try
        {
            SimpleDateFormat formatter = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
            long longMilliSeconds = Long.parseLong(milliSeconds);
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
