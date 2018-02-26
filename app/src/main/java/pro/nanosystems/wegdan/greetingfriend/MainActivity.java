package pro.nanosystems.wegdan.greetingfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText personName ;
private TextView result ;
Button greetingbut ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  personName = personName;
      //  result = result ;
       // clickbtn = clickbtn ;
        result = findViewById(R.id.result);
        greetingbut = findViewById(R.id.greetingbut);

        personName = findViewById(R.id.editText);
       // personName.setText("Input Your Name");


    }



    public void clickbtn(View view) {
        String msg = "Greetings ";
        result.setText(msg + personName.getText().toString());
    }
}
