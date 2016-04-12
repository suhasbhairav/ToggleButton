package main.tempcon.com.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Switch aswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.result_text);
        textView.setVisibility(View.INVISIBLE);
        aswitch = (Switch)findViewById(R.id.toogle_button_2);
        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Wifi On");
                    textView.setVisibility(View.VISIBLE);
                }else{
                    textView.setText("Wifi Off");
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void changeVibrateState(View view){

        boolean checked = ((ToggleButton)view).isChecked();
        if(checked){
            textView.setText("Vibrate On");
            textView.setVisibility(View.VISIBLE);
        }else{
            textView.setText("Vibrate Off");
            textView.setVisibility(View.VISIBLE);
        }
    }
}
