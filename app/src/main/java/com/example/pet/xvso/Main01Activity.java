package com.example.pet.xvso;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main01Activity extends AppCompatActivity {
    private TextView textout;
    private TextView[] text = new TextView[9];
    private int xo[][] = new int[3][3];
    private boolean katarvac = false;
    private int qanak = 0, a = 1, b = 2, io, jo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xo[i][j] = 0;
            }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);
        textout = findViewById(R.id.text);
        text[0] = findViewById(R.id.text1);
        text[1] = findViewById(R.id.text2);
        text[2] = findViewById(R.id.text3);
        text[3] = findViewById(R.id.text4);
        text[4] = findViewById(R.id.text5);
        text[5] = findViewById(R.id.text6);
        text[6] = findViewById(R.id.text7);
        text[7] = findViewById(R.id.text8);
        text[8] = findViewById(R.id.text9);
        text[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 0, 0);
            }
        });
        text[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 0, 1);
            }
        });
        text[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 0, 2);
            }
        });
        text[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 1, 0);
            }
        });
        text[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 1, 1);
            }
        });
        text[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 1, 2);
            }
        });
        text[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 2, 0);
            }
        });
        text[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 2, 1);
            }
        });
        text[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                katarel(xo, 2, 2);
            }
        });
    }

    public void katarel(int xo[][], int i, int j) {
        katarvac = false;
        if (xo[i][j] == 0) {
            text[i * 3 + j].setText("X");
            xo[i][j] = 1;
            text[i*3+j].setTextColor(Color.rgb(244,66,131));
            stugel(xo);
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    if (xo[k][l] == 2 && qanak < 4) {
                        a = 2;
                        b = 2;
                        io = i;
                        jo = j;
                        i = k;
                        j = l;
                        if (i - 1 > -1 && katarvac == false) {
                            if (xo[i - 1][j] == a) {
                                if (i + 1 < 3) {
                                    if (xo[i + 1][j] == 0) {
                                        xo[i + 1][j] = b;
                                        text[(i + 1) * 3 + j].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (i + 1 < 3 && katarvac == false) {
                            if (xo[i + 1][j] == a) {
                                if (i - 1 > -1) {
                                    if (xo[i - 1][j] == 0) {
                                        xo[i - 1][j] = b;
                                        text[(i - 1) * 3 + j].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (j - 1 > -1 && katarvac == false) {
                            if (xo[i][j - 1] == a) {
                                if (j + 1 < 3) {
                                    if (xo[i][j + 1] == 0) {
                                        xo[i][j + 1] = b;
                                        text[i * 3 + j + 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (j + 1 < 3 && katarvac == false) {
                            if (xo[i][j + 1] == a) {
                                if (j - 1 > -1) {
                                    if (xo[i][j - 1] == 0) {
                                        xo[i][j - 1] = b;
                                        text[i * 3 + j - 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (j + 2 < 3 && katarvac == false) {
                            if (xo[i][j + 1] == a) {
                                if (xo[i][j + 2] == 0) {
                                    xo[i][j + 2] = b;
                                    text[i * 3 + j + 2].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (j - 2 > -1 && katarvac == false) {
                            if (xo[i][j - 1] == a) {
                                if (xo[i][j - 2] == 0) {
                                    xo[i][j - 2] = b;
                                    text[i * 3 + j - 2].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 2 > -1 && katarvac == false) {
                            if (xo[i - 1][j] == a) {
                                if (xo[i - 2][j] == 0) {
                                    xo[i - 2][j] = b;
                                    text[(i - 2) * 3 + j].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i + 2 < 3 && katarvac == false) {
                            if (xo[i + 1][j] == a) {
                                if (xo[i + 2][j] == 0) {
                                    xo[i + 2][j] = b;
                                    text[(i + 2) * 3 + j].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 1 > -1 && j - 1 > -1 && katarvac == false) {
                            if (xo[i - 1][j - 1] == a) {
                                if (i + 1 < 3 && j + 1 < 3) {
                                    if (xo[i + 1][j + 1] == 0) {
                                        xo[i + 1][j + 1] = b;
                                        text[(i + 1) * 3 + j + 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (i + 1 < 3 && j + 1 < 3 && katarvac == false) {
                            if (xo[i + 1][j + 1] == a) {
                                if (i - 1 > -1 && j - 1 > -1) {
                                    if (xo[i - 1][j - 1] == 0) {
                                        xo[i - 1][j - 1] = b;
                                        text[(i - 1) * 3 + j - 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (i - 1 > -1 && j + 1 < 3 && katarvac == false) {
                            if (xo[i - 1][j + 1] == a) {
                                if (i + 1 < 3 && j - 1 > -1) {
                                    if (xo[i + 1][j - 1] == 0) {
                                        xo[i + 1][j - 1] = b;
                                        text[(i + 1) * 3 + j - 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (i + 1 < 3 && j - 1 > -1 && katarvac == false) {
                            if (xo[i + 1][j - 1] == a) {
                                if (i - 1 > -1 && j + 1 < 3) {
                                    if (xo[i - 1][j + 1] == 0) {
                                        xo[i - 1][j + 1] = b;
                                        text[(i - 1) * 3 + j + 1].setText("O");
                                        stugel(xo);
                                        katarvac = true;
                                        ++qanak;
                                    }
                                }
                            }
                        }
                        if (i - 2 > -1 && j + 2 < 3 && katarvac == false) {
                            if (xo[i - 2][j + 2] == a) {
                                if (xo[i - 1][j + 1] == 0) {
                                    xo[i - 1][j + 1] = b;
                                    text[(i - 1) * 3 + j + 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i + 2 < 3 && j - 2 > -1 && katarvac == false) {
                            if (xo[i + 2][j - 2] == a) {
                                if (xo[i + 1][j - 1] == 0) {
                                    xo[i + 1][j - 1] = b;
                                    text[(i + 1) * 3 + j - 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i + 2 < 3 && katarvac == false) {
                            if (xo[i + 2][j] == a) {
                                if (xo[i + 1][j] == 0) {
                                    xo[i + 1][j] = b;
                                    text[(i + 1) * 3 + j].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (j + 2 < 3 && katarvac == false) {
                            if (xo[i][j + 2] == a) {
                                if (xo[i][j + 1] == 0) {
                                    xo[i][j + 1] = b;
                                    text[i * 3 + j + 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i + 2 < 3 && j + 2 < 3 && katarvac == false) {
                            if (xo[i + 2][j + 2] == a) {
                                if (xo[i + 1][j + 1] == 0) {
                                    xo[i + 1][j + 1] = b;
                                    text[(i + 1) * 3 + j + 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 2 > -1 && katarvac == false) {
                            if (xo[i - 2][j] == a) {
                                if (xo[i - 1][j] == 0) {
                                    xo[i - 1][j] = b;
                                    text[(i - 1) * 3 + j].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (j - 2 > -1 && katarvac == false) {
                            if (xo[i][j - 2] == a) {
                                if (xo[i][j - 1] == 0) {
                                    xo[i][j - 1] = b;
                                    text[i * 3 + j - 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 2 > -1 && j - 2 > -1 && katarvac == false) {
                            if (xo[i - 2][j - 2] == a) {
                                if (xo[i - 1][j - 1] == 0) {
                                    xo[i - 1][j - 1] = b;
                                    text[(i - 1) * 3 + j - 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 2 > -1 && j - 2 > -1 && katarvac == false) {
                            if (xo[i - 1][j - 1] == a) {
                                if (xo[i - 1][j - 1] == 0) {
                                    xo[i - 1][j - 1] = b;
                                    text[(i - 1) * 3 + j - 1].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }
                        if (i - 2 > -1 && j + 2 < 3 && katarvac == false) {
                            if (xo[i - 1][j + 1] == a) {
                                if (xo[i - 2][j + 2] == 0) {
                                    xo[i - 2][j + 2] = b;
                                    text[(i - 2) * 3 + j + 2].setText("O");
                                    stugel(xo);
                                    katarvac = true;
                                    ++qanak;
                                }
                            }
                        }

                        a = 1;
                        b = 2;
                        i = io;
                        j = jo;
                    }
                }
            }


            if (qanak < 4 && katarvac == false) {
                if (i - 1 > -1 && katarvac == false) {
                    if (xo[i - 1][j] == a) {
                        if (i + 1 < 3) {
                            if (xo[i + 1][j] == 0) {
                                xo[i + 1][j] = b;
                                text[(i + 1) * 3 + j].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (i + 1 < 3 && katarvac == false) {
                    if (xo[i + 1][j] == a) {
                        if (i - 1 > -1) {
                            if (xo[i - 1][j] == 0) {
                                xo[i - 1][j] = b;
                                text[(i - 1) * 3 + j].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (j - 1 > -1 && katarvac == false) {
                    if (xo[i][j - 1] == a) {
                        if (j + 1 < 3) {
                            if (xo[i][j + 1] == 0) {
                                xo[i][j + 1] = b;
                                text[i * 3 + j + 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (j + 1 < 3 && katarvac == false) {
                    if (xo[i][j + 1] == a) {
                        if (j - 1 > -1) {
                            if (xo[i][j - 1] == 0) {
                                xo[i][j - 1] = b;
                                text[i * 3 + j - 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (j + 2 < 3 && katarvac == false) {
                    if (xo[i][j + 1] == a) {
                        if (xo[i][j + 2] == 0) {
                            xo[i][j + 2] = b;
                            text[i * 3 + j + 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (j - 2 > -1 && katarvac == false) {
                    if (xo[i][j - 1] == a) {
                        if (xo[i][j - 2] == 0) {
                            xo[i][j - 2] = b;
                            text[i * 3 + j - 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 2 > -1 && katarvac == false) {
                    if (xo[i - 1][j] == a) {
                        if (xo[i - 2][j] == 0) {
                            xo[i - 2][j] = b;
                            text[(i - 2) * 3 + j].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && katarvac == false) {
                    if (xo[i + 1][j] == a) {
                        if (xo[i + 2][j] == 0) {
                            xo[i + 2][j] = b;
                            text[(i + 2) * 3 + j].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 1 > -1 && j - 1 > -1 && katarvac == false) {
                    if (xo[i - 1][j - 1] == a) {
                        if (i + 1 < 3 && j + 1 < 3) {
                            if (xo[i + 1][j + 1] == 0) {
                                xo[i + 1][j + 1] = b;
                                text[(i + 1) * 3 + j + 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (i - 2 > -1 && j - 2 > -1 && katarvac == false) {
                    if (xo[i - 1][j - 1] == a) {
                        if (xo[i - 1][j - 1] == 0) {
                            xo[i - 1][j - 1] = b;
                            text[(i - 1) * 3 + j - 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 2 > -1 && j + 2 < 3 && katarvac == false) {
                    if (xo[i - 1][j + 1] == a) {
                        if (xo[i - 2][j + 2] == 0) {
                            xo[i - 2][j + 2] = b;
                            text[(i - 2) * 3 + j + 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 1 < 3 && j + 1 < 3 && katarvac == false) {
                    if (xo[i + 1][j + 1] == a) {
                        if (i - 1 > -1 && j - 1 > -1) {
                            if (xo[i - 1][j - 1] == 0) {
                                xo[i - 1][j - 1] = b;
                                text[(i - 1) * 3 + j - 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (i - 1 > -1 && j + 1 < 3 && katarvac == false) {
                    if (xo[i - 1][j + 1] == a) {
                        if (i + 1 < 3 && j - 1 > -1) {
                            if (xo[i + 1][j - 1] == 0) {
                                xo[i + 1][j - 1] = b;
                                text[(i + 1) * 3 + j - 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (i + 1 < 3 && j - 1 > -1 && katarvac == false) {
                    if (xo[i + 1][j - 1] == a) {
                        if (i - 1 > -1 && j + 1 < 3) {
                            if (xo[i - 1][j + 1] == 0) {
                                xo[i - 1][j + 1] = b;
                                text[(i - 1) * 3 + j + 1].setText("O");
                                stugel(xo);
                                katarvac = true;
                                ++qanak;
                            }
                        }
                    }
                }
                if (i - 2 > -1 && j + 2 < 3 && katarvac == false) {
                    if (xo[i - 2][j + 2] == a) {
                        if (xo[i - 1][j + 1] == 0) {
                            xo[i - 1][j + 1] = b;
                            text[(i - 1) * 3 + j + 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && j - 2 > -1 && katarvac == false) {
                    if (xo[i + 2][j - 2] == a) {
                        if (xo[i + 1][j - 1] == 0) {
                            xo[i + 1][j - 1] = b;
                            text[(i + 1) * 3 + j - 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && katarvac == false) {
                    if (xo[i + 2][j] == a) {
                        if (xo[i + 1][j] == 0) {
                            xo[i + 1][j] = b;
                            text[(i + 1) * 3 + j].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (j + 2 < 3 && katarvac == false) {
                    if (xo[i][j + 2] == a) {
                        if (xo[i][j + 1] == 0) {
                            xo[i][j + 1] = b;
                            text[i * 3 + j + 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && j + 2 < 3 && katarvac == false) {
                    if (xo[i + 2][j + 2] == a) {
                        if (xo[i + 1][j + 1] == 0) {
                            xo[i + 1][j + 1] = b;
                            text[(i + 1) * 3 + j + 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 2 > -1 && katarvac == false) {
                    if (xo[i - 2][j] == a) {
                        if (xo[i - 1][j] == 0) {
                            xo[i - 1][j] = b;
                            text[(i - 1) * 3 + j].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (j - 2 > -1 && katarvac == false) {
                    if (xo[i][j - 2] == a) {
                        if (xo[i][j - 1] == 0) {
                            xo[i][j - 1] = b;
                            text[i * 3 + j - 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 2 > -1 && j - 2 > -1 && katarvac == false) {
                    if (xo[i - 2][j - 2] == a) {
                        if (xo[i - 1][j - 1] == 0) {
                            xo[i - 1][j - 1] = b;
                            text[(i - 1) * 3 + j - 1].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && j - 2 > -1 && katarvac == false) {
                    if (xo[i + 1][j - 1] == a) {
                        if (xo[i + 2][j - 2] == 0) {
                            xo[i + 2][j - 2] = b;
                            text[(i + 2) * 3 + j - 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i - 2 > -1 && j - 2 > -1 && katarvac == false) {
                    if (xo[i - 1][j - 1] == a) {
                        if (xo[i - 2][j - 2] == 0) {
                            xo[i - 2][j - 2] = b;
                            text[(i - 2) * 3 + j - 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (i + 2 < 3 && j + 2 < 3 && katarvac == false) {
                    if (xo[i + 1][j + 1] == a) {
                        if (xo[i + 2][j + 2] == 0) {
                            xo[i + 2][j + 2] = b;
                            text[(i + 2) * 3 + j + 2].setText("O");
                            stugel(xo);
                            katarvac = true;
                            ++qanak;
                        }
                    }
                }
                if (katarvac == false && qanak < 4) {
                    while (katarvac == false && qanak < 4) {
                        i = (int) ((Math.random()) * 2.9);
                        j = (int) ((Math.random()) * 2.9);
                        if (xo[i][j] == 0) {
                            xo[i][j] = 2;
                            text[i * 3 + j].setText("O");
                            stugel(xo);
                            katarvac = true;
                            qanak++;
                            break;
                        }
                    }
                }
            }
            katarvac = false;
        }
    }

    public void stugel(int xo[][]) {
        for (int i = 0; i < 3; i++) {
            if (xo[0][i] == xo[1][i] && xo[0][i] == xo[2][i] && xo[0][i] != 0) {
                if (xo[0][i] == 1) {
                    qanak = qanak + 5;
                    textout.setText("X Win");
                } else {
                    textout.setText("O Win");
                }
            }
            if (xo[i][0] == xo[i][1] && xo[i][0] == xo[i][2] && xo[i][0] != 0) {
                if (xo[i][0] == 1) {
                    qanak = qanak + 5;
                    textout.setText("X Win");
                } else {
                    textout.setText("O Win");
                }
            }
        }
        if (xo[0][0] == xo[1][1] && xo[0][0] == xo[2][2] && xo[0][0] != 0) {
            if (xo[0][0] == 1) {
                qanak = qanak + 5;
                textout.setText("X Win");
            } else {
                textout.setText("O Win");
            }
        }
        if (xo[0][2] == xo[1][1] && xo[2][0] == xo[1][1] && xo[0][2] != 0) {
            if (xo[0][2] == 1) {
                qanak = qanak + 5;
                textout.setText("X Win");
            } else {
                textout.setText("O Win");
            }
        }
    }
}
