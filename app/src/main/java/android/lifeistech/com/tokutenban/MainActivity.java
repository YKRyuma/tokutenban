package android.lifeistech.com.tokutenban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count1;
    int count2;
    TextView textView1;
    TextView textView2;
    ListView listView1;
    ArrayAdapter adapter1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView) findViewById(R.id.textView1);
        textView2=(TextView) findViewById(R.id.textView2);
        listView1=(ListView)findViewById(R.id.listView1);
        adapter1  = new ArrayAdapter(this, android.R.layout.simple_list_item_1);


        listView1.setAdapter(adapter1);

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

    public void reset2(View v){
        count1=0;
        count2=0;
        textView1.setText(String.valueOf(count1));
        textView2.setText(String.valueOf(count2));

        adapter1.clear();
    }


    public void set(View v){
        String text1;
        String text2;
        text1=textView1.getText().toString();
        text2=textView2.getText().toString();



        adapter1.add(text1 +"-" + text2);







        count1=0;
        count2=0;
        textView1.setText(String.valueOf(count1));
        textView2.setText(String.valueOf(count2));



    }



}

