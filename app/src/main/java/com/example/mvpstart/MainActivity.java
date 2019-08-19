package com.example.mvpstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MVPView {

    private Calculator calculator = new Calculator();
    final EditText editText = findViewById(R.id.input);
    final TextView textView = findViewById(R.id.result);
    final Button button = findViewById(R.id.button);

    private Presenter presenter = new Presenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.showCorrectText(editText.getText().toString());

            }
        });


    }

    @Override
    public void renderGreaterThan100(){
        textView.setText("Greater than 100");
        Toast.makeText(this, "Greater than 100 ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void renderResult(int result){
        textView.setText("" + result);
    }


}
