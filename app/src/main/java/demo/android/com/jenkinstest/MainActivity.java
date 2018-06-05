package demo.android.com.jenkinstest;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText etValue1,etValue2;
    TextView tvValue3;
    Button btCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue1 = findViewById(R.id.value1);
        etValue2 = findViewById(R.id.value2);
        tvValue3 = findViewById(R.id.value3);
        btCount = findViewById(R.id.count);
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(etValue1.getText()) && !TextUtils.isEmpty(etValue2.getText())){
                    int value3 = Integer.parseInt(etValue1.getText().toString()) + Integer.parseInt(etValue2.getText().toString());
                    tvValue3.setText(""+value3);
                }
            }
        });
    }
}
