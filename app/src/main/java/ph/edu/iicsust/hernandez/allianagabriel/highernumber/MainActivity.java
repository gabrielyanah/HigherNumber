package ph.edu.iicsust.hernandez.allianagabriel.highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText inputEditText1 = (EditText) findViewById(R.id.editText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int firstNum = Integer.parseInt(inputEditText1.getText().toString());
                int secondNum = Integer.parseInt(inputEditText2.getText().toString());

                if (firstNum < secondNum){
                    resultTextView.setText("The higher value between" + " " + firstNum + " " +
                            "and" + " " + secondNum + " " + "is"+ " " + secondNum);
                }
                else if (firstNum > secondNum){
                    resultTextView.setText("The higher value between" + " " + firstNum + " " +
                            "and" + " " + secondNum + " " + "is"+ " " + firstNum);
                }
                else if (firstNum == secondNum) {
                    resultTextView.setText("The two numbers have the same value");
                }
                else {
                    resultTextView.setText("E R R O R !");
                }


            }
        });
    }
}
