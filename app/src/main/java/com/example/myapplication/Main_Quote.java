package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.*;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_Quote extends AppCompatActivity {
    Random random = new Random();
    String s1="Like",s2="Liked";
    public int[] arr= new int[20];
    int i=0;
    protected int Num2;
    ImageView i1,i2;
    Button b2,b3;
    String Quote = "";
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_quote);
        tv1 = findViewById(R.id.t2);
        tv2 = findViewById(R.id.t1);
        tv3 = findViewById(R.id.tv2);
        b2 = findViewById(R.id.b2);
        i1 = findViewById(R.id.I1);
        i2 = findViewById(R.id.I2);
        b3 = findViewById(R.id.b3);
        displayQuote();

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext() , com.example.myapplication.quotes.class) ;
                startActivity(in);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
//                shareIntent.setType("text/plain");
//                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"R.string.quote"+Num2);
//                String app_url = "R.string.quote"+"Num2";
//                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
//                startActivity(Intent.createChooser(shareIntent, "Share via"));
                String quote = tv1.getText().toString();

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, quote);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv2.getText().toString().equals(s2)) {
                    tv2.setText("Like");}
                displayQuote();

            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(tv2.getText().toString().equals(s1)){
                        tv2.setText("Liked");

                    } else if (tv2.getText().toString().equals(s2)) {
                        tv2.setText("Like");
                    }
                }
            });
    }
        public void displayQuote(){
            String[] stringsArray = getResources().getStringArray(R.array.my_strings);

            Random random = new Random();
            int randomIndex = random.nextInt(stringsArray.length);

            String randomString = stringsArray[randomIndex];

            tv1.setText(randomString);
        }
}
//            int randomNum = random.nextInt((19+1)-1)+1;
//            Num2=randomNum;
//            switch (randomNum){
//                case 1: Quote = getString(R.string.quote1);
//                    break;
//                case 2: Quote = getString(R.string.quote2);
//                    break;
//                case 3: Quote = getString(R.string.quote3);
//                    break;
//                case 4: Quote = getString(R.string.quote4);
//                    break;
//                case 5: Quote = getString(R.string.quote5);
//                    break;
//                case 6: Quote = getString(R.string.quote6);
//                    break;
//                case 7: Quote = getString(R.string.quote7);
//                    break;
//                case 8: Quote = getString(R.string.quote8);
//                    break;
//                case 9: Quote = getString(R.string.quote9);
//                    break;
//                case 10: Quote = getString(R.string.quote10);
//                    break;
//                case 11: Quote = getString(R.string.quote11);
//                    break;
//                case 12: Quote = getString(R.string.quote12);
//                    break;
//                case 13: Quote = getString(R.string.quote13);
//                    break;
//                case 14: Quote = getString(R.string.quote14);
//                    break;
//                case 15: Quote = getString(R.string.quote15);
//                    break;
//                case 16: Quote = getString(R.string.quote16);
//                    break;
//                case 17: Quote = getString(R.string.quote17);
//                    break;
//                case 18: Quote = getString(R.string.quote18);
//                    break;
//                case 19: Quote = getString(R.string.quote19);
//                    break;
//            }
//
 //       tv1.setText(Quote);
