package ttmobile.com.dateformatter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ttmobile.com.dateformatlibrary.FormatDate;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView DateText = (TextView) findViewById(R.id.DateText);
        DateText.setText(FormatDate.getCustomDate("1493642199438",FormatDate.ddMMyy()));
    }
}
