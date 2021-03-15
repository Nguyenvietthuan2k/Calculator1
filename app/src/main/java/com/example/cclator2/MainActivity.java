package com.example.cclator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, enter,add,sub,mul,div,clear,sq,sqrt;
    Button cb,cbrt,dec,log10;
    TextView txt1, txt2;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // anh xa
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sq = findViewById(R.id.sq);
        sqrt = findViewById(R.id.sqrt);
        cb = findViewById(R.id.cub);
        cbrt= findViewById(R.id.cubroot);
        dec = findViewById(R.id.dec);
        log10 = findViewById(R.id.log);
        enter = findViewById(R.id.enter);
        clear = findViewById(R.id.clear);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"0");
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+".");
            }
        });
        log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                ans = Math.log10(var1);
                txt2.setText(ans.toString());
                enter.setEnabled(false);
                buttonFalse();
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();

                ans = Math.sqrt(var1);
                txt2.setText(ans.toString());
                enter.setEnabled(false);
                buttonFalse();
            }
        });
        //To calculate cube
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();

                ans = var1 * var1 * var1;
                txt2.setText(ans.toString());
                enter.setEnabled(false);
                buttonFalse();
            }
        });
        //To calculate Cube Root
        cbrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();

                ans = Math.cbrt(var1);
                txt2.setText(ans.toString());
                enter.setEnabled(false);
                buttonFalse();
            }
        });
        //To clear and refresh everything!
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txt1.getText().toString());
                if(addition) {
                    ans = var1+var2;
                }else if(subtract) {
                    ans = var1-var2;
                }else if(multiply) {
                    ans = var1*var2;
                }else if(divide) {
                    ans = var1/var2;
                }else {
                    ans = ans+0;
                }

                txt2.setText(ans.toString());
                enter.setEnabled(false);
            }
        });

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            buttonFalse();
            addition=true;
        }
    });

    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            buttonFalse();
            subtract=true;
        }
    });
    mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            buttonFalse();
            multiply=true;
        }
    });
    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            buttonFalse();
            divide=true;
        }
    });

    sq.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            ans=var1*var1;
            txt2.setText(ans.toString());
            enter.setEnabled(false);
            buttonFalse();
        }
    });

    }

    private void allReset() {
        enter.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        txt1.setText("");
        txt2.setText("");
    }

    private void setVar1() {
        var1 = Double.parseDouble(txt1.getText().toString());
    }

    private void buttonFalse() {
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        txt1.setText("");
    }
}