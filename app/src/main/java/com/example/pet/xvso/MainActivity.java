package com.example.pet.xvso;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text, text1, text2, text3, text4, text5, text6, text7, text8, text9;
    private int xo[][] = new int[3][3];
    private boolean hert = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xo[i][j] = 0;
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[0][0] == 0) {
                    if (hert == true) {
                        text1.setText("X");
                        text1.setTextColor(Color.rgb(244,66,131));
                        xo[0][0] = 1;
                        hert = false;
                    } else {
                        text1.setText("O");
                        xo[0][0] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[0][1] == 0) {
                    if (hert == true) {
                        text2.setText("X");
                        text2.setTextColor(Color.rgb(244,66,131));
                        xo[0][1] = 1;
                        hert = false;
                    } else {
                        text2.setText("O");
                        xo[0][1] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[0][2] == 0) {
                    if (hert == true) {
                        text3.setText("X");
                        text3.setTextColor(Color.rgb(244,66,131));
                        xo[0][2] = 1;
                        hert = false;
                    } else {
                        text3.setText("O");
                        xo[0][2] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[1][0] == 0) {
                    if (hert == true) {
                        text4.setText("X");
                        text4.setTextColor(Color.rgb(244,66,131));
                        xo[1][0] = 1;
                        hert = false;
                    } else {
                        text4.setText("O");
                        xo[1][0] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[1][1] == 0) {
                    if (hert == true) {
                        text5.setText("X");
                        text5.setTextColor(Color.rgb(244,66,131));
                        xo[1][1] = 1;
                        hert = false;
                    } else {
                        text5.setText("O");
                        xo[1][1] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[1][2] == 0) {
                    if (hert == true) {
                        text6.setText("X");
                        text6.setTextColor(Color.rgb(244,66,131));
                        xo[1][2] = 1;
                        hert = false;
                    } else {
                        text6.setText("O");
                        xo[1][2] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[2][0] == 0) {
                    if (hert == true) {
                        text7.setText("X");
                        text7.setTextColor(Color.rgb(244,66,131));
                        xo[2][0] = 1;
                        hert = false;
                    } else {
                        text7.setText("O");
                        xo[2][0] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[2][1] == 0) {
                    if (hert == true) {
                        text8.setText("X");
                        text8.setTextColor(Color.rgb(244,66,131));
                        xo[2][1] = 1;
                        hert = false;
                    } else {
                        text8.setText("O");
                        xo[2][1] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xo[2][2] == 0) {
                    if (hert == true) {
                        text9.setText("X");
                        text9.setTextColor(Color.rgb(244,66,131));
                        xo[2][2] = 1;
                        hert = false;
                    } else {
                        text9.setText("O");
                        xo[2][2] = 2;
                        hert = true;
                    }
                    stugel(xo);
                }
            }
        });
    }

    public void stugel(int xo[][]) {
        for (int i = 0; i < 3; i++) {
            if (xo[0][i] == xo[1][i] && xo[0][i] == xo[2][i] && xo[0][i]!=0) {
                if (xo[0][i] == 1) {
                    text.setText("X Win");
                } else {
                    text.setText("O Win");
                }
            }
            if (xo[i][0] == xo[i][1] && xo[i][0] == xo[i][2] && xo[i][0]!=0) {
                if (xo[i][0] == 1) {
                    text.setText("X Win");
                } else {
                    text.setText("O Win");
                }
            }
        }
        if (xo[0][0] == xo[1][1] && xo[0][0] == xo[2][2] && xo[0][0]!=0) {
            if (xo[0][0] == 1) {
                text.setText("X Win");
            } else {
                text.setText("O Win");
            }
        }
        if (xo[0][2] == xo[1][1] && xo[2][0] == xo[1][1] && xo[0][2]!=0) {
            if (xo[0][2] == 1) {
                text.setText("X Win");
            } else {
                text.setText("O Win");
            }
        }
    }

//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.text1)
//            text1.setText("X");
//        if (v.getId() == R.id.text2)
//            text2.setText("X");
//        if (v.getId() == R.id.text3)
//            text3.setText("X");
//        if (v.getId() == R.id.text4)
//            text4.setText("X");
//        if (v.getId() == R.id.text5)
//            text5.setText("X");
//        if (v.getId() == R.id.text6)
//            text6.setText("X");
//        if (v.getId() == R.id.text7)
//            text7.setText("X");
//        if (v.getId() == R.id.text8)
//            text8.setText("X");
//        if (v.getId() == R.id.text9)
//            text9.setText("X");
//    }
}
