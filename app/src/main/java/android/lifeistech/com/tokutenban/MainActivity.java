package android.lifeistech.com.tokutenban;

import android.content.DialogInterface;
import android.service.autofill.Dataset;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<list> mlist;
    listAdapter mlistAdapter;
    ListView mlistView;


    int count1;
    int count2;
    TextView textView1;
    TextView textView2;
    EditText editText1;
    EditText editText2;
    ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistView = (ListView) findViewById(R.id.listView1);
        mlist = new ArrayList<list>();
        mlistAdapter = new listAdapter(this, R.id.listView1, mlist);
        mlistView.setAdapter(mlistAdapter);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        listView1 = (ListView) findViewById(R.id.listView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        count1 = 0;
        count2 = 0;

//        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                ArrayAdapter adapter =(ArrayAdapter)listView1.getAdapter();
//                String item =(String)adapter.getItem(position);
//                adapter.remove(item);
//
//                return false;
//
//
//
//            }
//        });

        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("削除しますか？")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // remove item from ArrayList
                                mlist.remove(position);
                                // update ListView
                                mlistAdapter.notifyDataSetChanged();
                                Toast.makeText(MainActivity.this, "削除しました", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("キャンセル", null)
                        .setCancelable(true);
                // show dialog
                builder.show();
                return false;
            }
        });
    }


            public void add1(View v) {

                count1 = count1 + 1;

                if (count1 >= 25 && count1 - count2 >= 2) {
                    String text1;
                    String text2;
                    text1 = textView1.getText().toString();
                    text2 = textView2.getText().toString();


                    list scores = new list(count1, count2);
                    mlist.add(scores);

                    mlistAdapter.notifyDataSetChanged();
                    count1 = 0;
                    count2 = 0;
                    textView1.setText(String.valueOf(count1));
                    textView2.setText(String.valueOf(count2));

                }


                textView1.setText(String.valueOf(count1));


            }

            public void add2(View v) {

                count2 = count2 + 1;
                textView2.setText(String.valueOf(count2));

                if (count2 >= 25 && count2 - count1 >= 2) {
                    String text1;
                    String text2;
                    text1 = textView1.getText().toString();
                    text2 = textView2.getText().toString();


                    list scores = new list(count1, count2);
                    mlist.add(scores);

                    mlistAdapter.notifyDataSetChanged();
                    count1 = 0;
                    count2 = 0;
                    textView1.setText(String.valueOf(count1));
                    textView2.setText(String.valueOf(count2));

                }
            }

            public void minus1(View v) {

                count1 = count1 - 1;
                textView1.setText(String.valueOf(count1));
            }

            public void minus2(View v) {
                count2 = count2 - 1;
                textView2.setText(String.valueOf(count2));

            }

            public void reset1(View v) {
                count1 = 0;
                count2 = 0;
                textView1.setText(String.valueOf(count1));
                textView2.setText(String.valueOf(count2));
            }

            public void reset2(View v) {
                count1 = 0;
                count2 = 0;
                textView1.setText(String.valueOf(count1));
                textView2.setText(String.valueOf(count2));
                mlistAdapter.clear();

//        adapter1.clear();

            }

    public void add(View v){
        String text1;
        String text2;
        text1=textView1.getText().toString();
        text2=textView2.getText().toString();

        list scores = new list(Integer.valueOf(text1),Integer.valueOf(text2));
        mlist.add(scores);

        mlistAdapter.notifyDataSetChanged();
        count1=0;
        count2=0;
        textView1.setText(String.valueOf(count1));
        textView2.setText(String.valueOf(count2));

    }

            public void swap(View v) {
                String text3;
                String text4;
                text3 = editText1.getText().toString();
                text4 = editText2.getText().toString();

                editText1.setText(text4);
                editText2.setText(text3);

                for (int i = 0; i < mlist.size(); i++) {

                    mlist.get(i).swap();


                }
                mlistAdapter.notifyDataSetChanged();

                String text5;
                String text6;
                text5 = textView1.getText().toString();
                text6 = textView2.getText().toString();

                textView1.setText(text6);
                textView2.setText(text5);


            }



}