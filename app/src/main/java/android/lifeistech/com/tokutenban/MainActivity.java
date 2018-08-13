package android.lifeistech.com.tokutenban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count1;
    int count2;
    TextView textView1;
    TextView textView2;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView) findViewById(R.id.textView1);
        textView2=(TextView) findViewById(R.id.textView2);
        listView=(ListView)findViewById(R.id.listView);

        count1=0;
        count2=0;

    }
    public void add1(View v){

        count1 = count1 + 1;
        textView1.setText(String.valueOf(count1));
    }

    public void add2(View v){

        count2 = count2 + 1;
        textView2
                .setText(String.valueOf(count2));
    }

    public void  minus1(View v){

        count1 = count1 - 1;
        textView1.setText(String.valueOf(count1));
    }

    public void minus2(View v){
        count2 = count2 - 1;
        textView2.setText(String.valueOf(count2));

    }

    public void  reset1(View v){
        count1=0;
        count2=0;
        textView1.setText(String.valueOf(count1));
        textView2.setText(String.valueOf(count2));
    }

    public void set(View v){
        String 
    }



}

