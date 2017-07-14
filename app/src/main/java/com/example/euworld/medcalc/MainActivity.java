package com.example.euworld.medcalc;

// test change


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.euworld.medcalc.R.id.babyMass;
//import java.math.BigDecimal;

//git test

public class MainActivity extends AppCompatActivity {





//field variable


    private static final double ATROETTDOSE = 1;//global variables Instance VAriables
    private static final double CACLDOSE = 20;
    private static final double CAGLDOSE = 200;
    private final double DEXIVDOSE = 100;
    private final double DEXINFDOSE = 200;
    private final double EPIIVDOSE= 20;
    private final double EPIETTDOSE = 200;
    private final double LIDOIVDOSE = 100;
    private final double LIDOETTDOSE = 200;
    private final double LIDOINFDOSE = 20;
    private final double MGSO4DOSE = 200;
    private final double NALOXONEDOSE = 100;
    private final double PRODOSE = 200;
    private final double NABIDOSE = 20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.medication_array, android.R.layout.simple_spinner_item);

        final TextView t = (TextView) findViewById(R.id.outputScreen);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        t.setEnabled(true);






        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {



            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {  //interface

                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();

               EditText babyMass = (EditText) findViewById(R.id.babyMass);
                // double doubleBabyMass = Double.parseDouble(babyMass.getText().toString());


                double bMass;
                try
                {
                    bMass = Double.parseDouble(babyMass.getText().toString());
                }
                catch (NumberFormatException e)
                {


                    Log.i("status", "There is no value of bMass");


                    return;



                }

                // String sts = bMass;
                Log.i("status", "babyMass.toString() ");
                Log.i("status", babyMass.getText().toString());
                Log.i("dfc", "");






               // Log.i("status", babyMass.toString());



                switch (position) {
                    case 0:
                       clearscn();
                       t.append("Atro Dose will be : " + getAtroDose(bMass));
                        Log.i("status", "did it");
                       break;
                    case 1:
                        t.setText("");
                        caCl();
                        t.append("caCl");
                        break;
                    case 2:
                        t.setText("");
                        caGL();
                        break;
                    case 3:
                        t.setText("");
                        dextrose();
                        break;
                    case 4:
                        t.setText("");
                        dextrose10();
                        break;
                    case 5:
                        t.setText("");
                        ePIIV();
                        break;
                    case 6:
                        t.setText("");
                        ePIETT();
                        break;
                    case 7:
                        t.setText("");
                        lidoIV();
                        break;
                    case 8:
                        t.setText("");
                        lidoETT();
                        break;
                    case 9:
                        t.setText("");
                        lidoInf();
                        break;
                    case 10:
                        t.setText("");
                        mgSO4();
                        break;
                    case 11:
                        t.setText("");
                        nax();
                        break;
                    case 12:
                        t.setText("");
                        pro();
                        break;
                    case 13:
                        t.setText("");
                        naBi();
                        break;

                    default:
                        t.append("Nigga! Try again");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

            private void naBi() {
                // TODO Auto-generated method stub
                //performs calculation


            }


            private void pro() {
                // TODO Auto-generated method stub



            }


            private void nax() {
                // TODO Auto-generated method stub



            }


            private void mgSO4() {
                // TODO Auto-generated method stub


            }


            private void lidoInf() {
                // TODO Auto-generated method stub


            }


            private void lidoETT() {
                // TODO Auto-generated method stub




            }


            private void lidoIV() {
                // TODO Auto-generated method stub




            }


            private void ePIETT() {
                // TODO Auto-generated method stub

            }


            private void ePIIV() {
                // TODO Auto-generated method stub

            }


            private void dextrose10() {
                // TODO Auto-generated method stub

            }



            private void dextrose() {
                // TODO Auto-generated method stub


            }


            private void caGL() {
                // TODO Auto-generated method stub





            }

            private void caCl() {
                // TODO Auto-generated method stub

            }

            private double getAtroDose(double bMass) {
                clearscn();
                //t.append("Atro Dose is " + bMass * ATROETTDOSE);
                //Log.i("getAtroDose", babyMass);
                return bMass * ATROETTDOSE;


            }

            private void clearscn() {
                t.setText("");;
            }




        });
    }

    private void clearscn() {
    }


}



