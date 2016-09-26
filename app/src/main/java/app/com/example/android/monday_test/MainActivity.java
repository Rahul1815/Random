package app.com.example.android.monday_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button civil2;
    private Button ironman2;
    private Button spider2;
    private Button button3;
    char a='b';

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spider2 =(Button) findViewById(R.id.spider2);
        civil2=(Button)findViewById(R.id.civil2);
        ironman2=(Button)findViewById(R.id.ironman2);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(getApplicationContext(),Main24Activity.class);
                intent1=intent1.putExtra("s",a);

                startActivity(intent1);


            }

        });
        spider2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Main24Activity.class);
                intent3 = intent3.putExtra("s", a);

                startActivity(intent3);


            }

        });


        civil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(getApplicationContext(),Main2Activity.class);
                intent1=intent1.putExtra("c",a);

                startActivity(intent1);


            }

        });
        ironman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Main22Activity.class);
                intent2 = intent2.putExtra("i", a);

                startActivity(intent2);
            }
        });


    }
}
