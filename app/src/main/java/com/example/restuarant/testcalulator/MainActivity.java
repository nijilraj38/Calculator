package com.example.restuarant.testcalulator;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static double s = 0;
    public double e,k;
    public double a,b;
    public String s1;
    public EditText ed;
    public int operationId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button zero, one,two,three,four,five, six, seven ,eight,nine,plus,minus,mul,div,equal;
//        EditText ed;


        Button zero=(Button) findViewById(R.id.button);
        Button one=(Button) findViewById(R.id.button3);
        Button two=(Button) findViewById(R.id.button4);
        Button three=(Button) findViewById(R.id.button5);
        Button four=(Button) findViewById(R.id.button6);
        Button five=(Button) findViewById(R.id.button7);
        Button six=(Button) findViewById(R.id.button8);
        Button seven=(Button) findViewById(R.id.button9);
        Button eight=(Button) findViewById(R.id.button10);
        Button nine=(Button) findViewById(R.id.button11);
        Button plus=(Button) findViewById(R.id.button12);
        Button minus=(Button) findViewById(R.id.button13);
        Button mul=(Button) findViewById(R.id.button2);
        Button div=(Button) findViewById(R.id.button14);
        Button equal=(Button) findViewById(R.id.button15);
        Button clear=(Button) findViewById(R.id.button16);
        Button dot=(Button) findViewById(R.id.button17);
        ed=(EditText) findViewById(R.id.editText);
//        final String[] operation ={,"R.id.button13","R.id.button2","R.id.button14"};


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               s= 0;
               ed.setText(ed.getText()+""+(int)s);

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               s= 1;
                ed.setText(ed.getText()+""+(int)s);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 2;
                ed.setText(ed.getText()+""+(int)s);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 3;
                ed.setText(ed.getText()+""+(int)s);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 4;
                ed.setText(ed.getText()+""+(int)s);

            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               s= 5;
                ed.setText(ed.getText()+""+(int)s);

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 6;
                ed.setText(ed.getText()+""+(int)s);

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 7;
                ed.setText(ed.getText()+""+(int)s);

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= 8;
                ed.setText(ed.getText()+""+(int)s);


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               s= 9;
               ed.setText(ed.getText()+""+(int)s);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ed.setText(ed.getText()+"*");
                s1= ".";
                ed.setText(ed.getText()+""+s1);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Double.parseDouble(ed.getText().toString());
//                ed.setText(ed.getText()+"+");
                ed.setText("");
                operationId=0;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(ed.getText().toString());
//                ed.setText(ed.getText()+"-");
                ed.setText("");
                operationId=1;

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ed.setText(ed.getText()+"*");
                a = Double.parseDouble(ed.getText().toString());
                ed.setText("");
                operationId=2;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ed.setText(ed.getText()+"/");
                a = Double.parseDouble(ed.getText().toString());
                ed.setText("");
                operationId=3;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               switch(operationId){

                   case 0:
                       b = Double.parseDouble(ed.getText().toString());
                       e=a+b;
                       ed.setText(""+e);
//                       Toast.makeText(MainActivity.this,"plus",Toast.LENGTH_SHORT).show();
                       Log.d("Bservice","plus");
                       e=0;
                       k=0;
                       s=0;
                       a=0;
                       b=0;
                       break;

                   case 1:
                       b = Double.parseDouble(ed.getText().toString());
                       e = a-b;
                       ed.setText(""+e);
                       Log.d("Bservice","minus");
                       e=0;
                       k=0;
                       s=0;
                       a=0;
                       b=0;
                       break;

                   case 2:
                       b = Double.parseDouble(ed.getText().toString());
                       e =a*b;
                       ed.setText(""+e);
                       Log.d("Bservice","mul");
                       e=0;
                       k=0;
                       s=0;
                       a=0;
                       b=0;
                       break;

                   case  3:
                       b = Double.parseDouble(ed.getText().toString());
                       e= a/b;
                       ed.setText(""+e);
                       Log.d("Bservice","div");
                       e=0;
                       k=0;
                       s=0;
                       a=0;
                       b=0;
                       break;

                   default:


               }

            }
        });
        ed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ed.setText("");
                return false;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearAll();

            }
        });




    }
    public void clearAll() {
        e=0;
        k=0;
        s=0;
        a=0;
        b=0;
        ed.setText("");
        s1="";

    }

}
