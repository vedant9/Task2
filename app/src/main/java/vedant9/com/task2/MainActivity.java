package vedant9.com.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.strMessage);
    }
    public void count(View view){
        count++;
        if(count%2!=0)
        {
            txt.setText("Goodbye World!");
        }
        else {
            txt.setText("Hello World!");
        }
    }
}
