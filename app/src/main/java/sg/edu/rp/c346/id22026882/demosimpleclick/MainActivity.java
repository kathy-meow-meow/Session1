package sg.edu.rp.c346.id22026882.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton togButton;
    RadioGroup rgGender;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        togButton = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonMale){
                    stringResponse = getString(R.string.maleRes) + stringResponse;
                }
                else if(checkedRadioId == R.id.radioButtonFemale){
                    stringResponse = getString(R.string.femRes) + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });


        togButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (togButton.isChecked()==true) {
                    etInput.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                    btnDisplay.setEnabled(false);
                }

            }
        });

    }
}