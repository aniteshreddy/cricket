package com.example.crikskore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView one, two, four, six,total,wide,nobe,out,tot,fun,extra,pl1,pl2,wick;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b15,b16, b17, b11, b12,b18;
    private int noobe,f4,s6,single,do2,wiide,oout,flag1=0,flag2=0,tota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wick=findViewById(R.id.wic);
        pl1=findViewById(R.id.text5);
        pl2=findViewById(R.id.text6);
        extra=findViewById(R.id.ext);
        fun=findViewById(R.id.fn);
        tot=findViewById(R.id.res);
        one = findViewById(R.id.text1);
        two = findViewById(R.id.text2);
        four = findViewById(R.id.text3);
        six = findViewById(R.id.text4);
        wide= findViewById(R.id.text8);
        nobe=findViewById(R.id.text9);
        out=findViewById(R.id.text10);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b15 = findViewById(R.id.button15);
        b16 =findViewById(R.id.button16);

        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b17 = findViewById(R.id.button17);
        b18 = findViewById(R.id.button18);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (single <= 0) {
                    single = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                } else {
                    --single;
                    one.setText(single + "");


                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                single++;
                one.setText(single + "");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (do2 <= 0) {
                    do2 = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                } else {
                    do2 -=2;
                    two.setText(do2 + "");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do2+=2;
                two.setText(do2 + "");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f4 ==0) {
                    f4 = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                }else if (f4<0)
                {
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();
                }

                else {
                    f4 -=4;
                    four.setText(f4 + "");
                    --flag1;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f4+=4;
                four.setText(f4 + "");
                ++flag1;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s6 <= 0) {
                    s6 = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                } else {
                    s6 -= 6;
                    six.setText(s6 + "");
                    --flag1;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s6 +=6;
                six.setText(s6 + "");
                ++flag1;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wiide <= 0) {
                    wiide = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                } else {
                    --wiide;
                    wide.setText(wiide + "");
                    --flag2;
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++wiide;
                wide.setText(wiide + "");
                ++flag2;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (noobe <= 0) {
                    noobe = 0;
                    Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();

                }
                else {
                    --noobe;
                    nobe.setText(noobe + "");
                    --flag2;
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++noobe;
                nobe.setText(noobe + "");
                ++flag2;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(oout>=10){Toast.makeText(MainActivity.this, "not possible", Toast.LENGTH_SHORT).show();}

            else{
                ++oout;
                out.setText(oout + "");
            }
        }



            });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl1.setText("");
                tota=single+do2+f4+s6+wiide+noobe;
                tot.setText(tota+"");
                fun.setText(flag1+"");
                extra.setText(flag2+"");
                wick.setText(oout + "");

            }

        });


    }
}
