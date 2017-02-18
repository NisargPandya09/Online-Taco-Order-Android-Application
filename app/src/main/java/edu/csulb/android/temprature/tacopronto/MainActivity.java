package edu.csulb.android.temprature.tacopronto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.telephony.SmsManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<name_value> items = new ArrayList();
//    String sms[];
      StringBuffer SMS = new StringBuffer();




   // obj.name_value(1,"Large", 21.50);
   // String item[];
    // Size
    public double large = 4;
    public double medium = 3;

    // Tortilla
    public double corn = 2;
    public double flour = 1.5;

    //Fillings
    public double beef = 1;
    public double chicken = 1;
    public double white_fish= 1.5;
    public double cheese = 1.5;
    public double sea_food = 2;
    public double rice = 1;
    public double beans = 1;
    public double pico_de_gallo = 1;
    public double guacamole = 2.5;
    public double LBT = 1;

    //Beverage
    public double soda = 2;
    public double cerveza = 2;
    public double margarita = 2;
    public double tequila = 2;

    public static double sum = 0;
    public String print;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                switch (v.getId())
                {     case R.id.button2:
                    RadioButton r_large = (RadioButton) findViewById(R.id.radioButton);
                    RadioButton r_medium = (RadioButton) findViewById(R.id.radioButton2);
                    RadioButton r_corn = (RadioButton) findViewById(R.id.radioButton3);
                    RadioButton r_flour = (RadioButton) findViewById(R.id.radioButton4);

                    CheckBox c_beef = (CheckBox) findViewById(R.id.checkBox);
                    CheckBox c_chicken = (CheckBox) findViewById(R.id.checkBox2);
                    CheckBox c_white_fish = (CheckBox) findViewById(R.id.checkBox3);
                    CheckBox c_cheese = (CheckBox) findViewById(R.id.checkBox4);
                    CheckBox c_seafood = (CheckBox) findViewById(R.id.checkBox5);
                    CheckBox c_rice = (CheckBox) findViewById(R.id.checkBox6);
                    CheckBox c_beans = (CheckBox) findViewById(R.id.checkBox7);
                    CheckBox c_pico_de_gallo = (CheckBox) findViewById(R.id.checkBox8);
                    CheckBox c_guacamole = (CheckBox) findViewById(R.id.checkBox9);
                    CheckBox c_LBT = (CheckBox) findViewById(R.id.checkBox10);

                    CheckBox c_soda = (CheckBox) findViewById(R.id.checkBox11);
                    CheckBox c_cerveza = (CheckBox) findViewById(R.id.checkBox12);
                    CheckBox c_margarita = (CheckBox) findViewById(R.id.checkBox13);
                    CheckBox c_tequila = (CheckBox) findViewById(R.id.checkBox14);

//                    if (text.getText().length() == 0)
//                    {
//                        Toast.makeText(this, "Please enter a valid number",
//                                Toast.LENGTH_LONG).show();
//                        return;
//                    }
//                    float inputValue = Float.parseFloat(text.getText().toString());

                  //  name_value obj= new name_value();

//                            new name_value(2, "Cheese", 15.99),
//                            new name_value(3, "Rice", 14.90),
//                            new name_value(4, "Beans", 7.99),
//                            new name_value(5, "Soda", 10.00),};

                    items.clear();
                    sum=0;
                    // This will clear the buffer
                    SMS.delete(0, SMS.length());




                    if (r_large.isChecked())
                    {
                        name_value obj = new name_value("Size: Large", large);
                        items.add(obj);
                        SMS.append("Size: Large"+"\n");

                        sum = sum + large;

                        r_large.setChecked(false);

                    }

                    if (r_medium.isChecked())
                    {
                        name_value obj = new name_value("Size: Medium", medium);
                        items.add(obj);

                        SMS.append("Size: Med"+"\n");

                        sum = sum + medium;
                        r_medium.setChecked(false);
                    }

                    if (r_corn.isChecked())
                    {
                        name_value obj = new name_value("Tortilla: Corn", corn);
                        items.add(obj);
                        SMS.append("Tortilla: Corn"+"\n");

                        sum = sum + corn;
                        r_corn.setChecked(false);
                    }

                    if (r_flour.isChecked())
                    {
                        name_value obj = new name_value("Tortilla: Flour", flour);
                        items.add(obj);
                        SMS.append("Tortilla: Flour"+"\n");

                        sum = sum + flour;
                        r_flour.setChecked(false);
                    }
                    if (c_beef.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Beef", beef);
                        items.add(obj);
                        SMS.append("Fillings: Beef"+"\n");

                        //sms[2]="Fillings: beef";

                        sum = sum + beef;
                        c_beef.setChecked(false);


                    }

                    if (c_chicken.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Chicken", chicken);
                        items.add(obj);
                        SMS.append("Fillings: Chicken"+"\n");

                        sum = sum + chicken;
                        c_chicken.setChecked(false);
                    }

                    if (c_white_fish.isChecked())
                    {
                        name_value obj = new name_value("Fillings: White Fish", white_fish);
                        items.add(obj);
                        SMS.append("Fillings: White Fish"+"\n");

                        sum = sum + white_fish;
                        c_white_fish.setChecked(false);
                    }

                    if (c_cheese.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Cheese", cheese);
                        items.add(obj);
                        SMS.append("Fillings: Cheese"+"\n");

                        sum = sum + cheese;
                        c_cheese.setChecked(false);
                    }
                    if (c_seafood.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Sea Food", sea_food);
                        items.add(obj);
                        SMS.append("Fillings: Sea Food"+"\n");

                        sum = sum + sea_food;
                        c_seafood.setChecked(false);
                    }
                    if (c_rice.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Rice", rice);
                        items.add(obj);
                        SMS.append("Fillings: Rice"+"\n");

                        sum = sum + rice;
                        c_rice.setChecked(false);
                    }

                    if (c_beans.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Beans", beans);
                        items.add(obj);
                        SMS.append("Fillings: Beans"+"\n");

                        sum = sum + beans;
                        c_beans.setChecked(false);
                    }

                    if (c_pico_de_gallo.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Pico de Gallo", pico_de_gallo);
                        items.add(obj);
                        SMS.append("Fillings: Pico de Gallo"+"\n");

                        sum = sum + pico_de_gallo;
                        c_pico_de_gallo.setChecked(false);
                    }
                    if (c_guacamole.isChecked())
                    {
                        name_value obj = new name_value("Fillings: Guacamole", guacamole);
                        items.add(obj);
                        SMS.append("Fillings: Guacamole"+"\n");

                        sum = sum + guacamole;
                        c_guacamole.setChecked(false);
                    }
                    if (c_LBT.isChecked())
                    {
                        name_value obj = new name_value("Fillings: LBT", LBT);
                        items.add(obj);
                        SMS.append("Fillings: LBT"+"\n");

                        sum = sum + LBT;
                        c_LBT.setChecked(false);
                    }
                    if (c_soda.isChecked())
                    {
                        name_value obj = new name_value("Beverage: Soda", soda);
                        items.add(obj);
                        SMS.append("Beverage: Soda"+"\n");

                        sum = sum + soda;
                        c_soda.setChecked(false);
                    }

                    if (c_cerveza.isChecked())
                    {
                        name_value obj = new name_value("Beverage: Cerveza", cerveza);
                        items.add(obj);
                        SMS.append("Beverage: Cerveza"+"\n");

                        sum = sum + cerveza;
                        c_cerveza.setChecked(false);
                    }
                    if (c_margarita.isChecked())
                    {
                        name_value obj = new name_value("Beverage: Margarita", margarita);
                        items.add(obj);
                        SMS.append("Beverage: Margarita"+"\n");

                        sum = sum + margarita;
                        c_margarita.setChecked(false);
                    }
                    if (c_tequila.isChecked())
                    {
                        name_value obj = new name_value("Beverage: Tequila", tequila);
                        items.add(obj);
                        SMS.append("Beverage: Tequila"+"\n");

                        sum = sum + tequila;
                        c_tequila.setChecked(false);
                    }
                    //else
                 //   {
                    //    sum=0;
                        // Popup
                   // }

                    name_value obj = new name_value("Total: ", sum);
                    items.add(obj);

                    break;
                }


                goToSecondActivity();

            }

        });
    }

    private void goToSecondActivity() {



        Intent intent = new Intent(this, Main2Activity.class);
    //    intent.putExtra("Total",String.valueOf(sum));
        intent.putExtra("name_value", (Serializable) items);
        //intent.putExtra("pr",print.toString());
       // intent.putExtra("items",item);

        //sum=0;
        this.startActivity(intent);

//        String phoneNumber = "5623665959";
          String message = SMS+"\n"+"Total Amount: "+sum;
//        Intent intent1 = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:" + phoneNumber));
//        intent1.putExtra("sms_body", message);
//        this.startActivity(intent1);
//        startActivity(intent1);

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("+15623149923", null,message, null, null);

    }
}
