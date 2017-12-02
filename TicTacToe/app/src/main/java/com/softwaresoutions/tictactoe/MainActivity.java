package com.softwaresoutions.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset;
    int turn;

    @Override
    private void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        reset = (Button) findViewById(R.id.reset);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        reset.setOnClickListener(this);


    }

    @Override
    public void doReset()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

    @Override
    public void getResult () {
        if (b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }


        if (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }



        if (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X") ) {
            Toast.makeText(this.MainActivity(),"Player X Wins!",Toast.LENGTH_SHORT).show();

        }
        if (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O") ) {
            Toast.makeText(this.MainActivity(),"Player O Wins!",Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onClick(View view) {
        switch ()

    }
}
