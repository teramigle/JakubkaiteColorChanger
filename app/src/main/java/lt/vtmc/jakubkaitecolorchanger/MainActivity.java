package lt.vtmc.jakubkaitecolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int gray = getResources().getColor(R.color.gray);

        linearLayout1 = findViewById(R.id.linearLayout1);
        button1 = findViewById(R.id.button1);
        int green = getResources().getColor(R.color.green);
        linearLayout2 = findViewById(R.id.linearLayout2);
        button2 = findViewById(R.id.button2);
        int red = getResources().getColor(R.color.red);
        linearLayout3 = findViewById(R.id.linearLayout3);
        button3 = findViewById(R.id.button3);
        int blue = getResources().getColor(R.color.blue);
        linearLayout4 = findViewById(R.id.linearLayout4);
        button4 = findViewById(R.id.button4);
        int yellow = getResources().getColor(R.color.yellow);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(green);
                linearLayout2.setBackgroundColor(gray);
                linearLayout3.setBackgroundColor(gray);
                linearLayout4.setBackgroundColor(gray);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearLayout2.setBackgroundColor(red);
                linearLayout1.setBackgroundColor(gray);
                linearLayout3.setBackgroundColor(gray);
                linearLayout4.setBackgroundColor(gray);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearLayout3.setBackgroundColor(blue);
                linearLayout2.setBackgroundColor(gray);
                linearLayout1.setBackgroundColor(gray);
                linearLayout4.setBackgroundColor(gray);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearLayout4.setBackgroundColor(yellow);
                linearLayout2.setBackgroundColor(gray);
                linearLayout3.setBackgroundColor(gray);
                linearLayout1.setBackgroundColor(gray);

            }
        });
    }
}