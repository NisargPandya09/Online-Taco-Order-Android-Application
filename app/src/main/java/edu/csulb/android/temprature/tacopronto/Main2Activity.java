package edu.csulb.android.temprature.tacopronto;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Main2Activity extends AppCompatActivity {
    TextView total_summary;
    TextView items;
    List item = new ArrayList();

 //   TextView item;
    String phoneNumber = "5623365959";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView  listView1 = (ListView) findViewById(R.id.listView);

        Bundle values = getIntent().getExtras();
        String Total = values.getString("Total");
     //   String Items[] = values.getStringArray("items");
        item = (ArrayList) getIntent().getSerializableExtra("name_value");
//        total_summary = (TextView) findViewById(R.id.textView);
//        total_summary.setText("Your total is "+Total);

//        items = (TextView) findViewById(R.id.textView9);
//        items.setText("Item 1");

        ArrayAdapter<name_value> adapter = new ArrayAdapter<name_value>(this,
                android.R.layout.simple_list_item_1, item);

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                item );

        listView1.setAdapter(adapter);


        //  int listSize = item.size();

       // System.out.println("Helloooo");




        //     item = (TextView) findViewById(R.id.textView9);
    //    item.setText("Item 1");
//        item.append(Items[0]);
//        item.append("\n");

//        SmsManager smsManager = SmsManager.getDefault();
//        PendingIntent sentPI;
//        String SENT = "SMS_SENT";
//
//        sentPI = PendingIntent.getBroadcast(this, 0,new Intent(SENT), 0);
//        smsManager.sendTextMessage(phoneNumber, null,"New order", null, null);
        //total_summary.setText("Your total is "+pr);
    }
}
