package com.example.apinstagramclone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//TextView txtHello;
Button btnSave;
EditText edtxtName,edtxtPunchSpeed,edtxtPunchPower,edtxtKickSpeed,edtxtKickPower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  txtHello = findViewById(R.id.txtHello);
        btnSave=findViewById(R.id.btnSave);
        edtxtName = findViewById(R.id.edtxtName);
        edtxtPunchSpeed = findViewById(R.id.edtxtPunchSpeed);
        edtxtPunchPower = findViewById(R.id.edtxtPunchPower);
        edtxtKickSpeed = findViewById(R.id.edtxtKickSpeed);
        edtxtKickPower = findViewById(R.id.edtxtKickPower);

    }
    public void btnSaveClicked(View view){
        try {
            final ParseObject boxer2 = new ParseObject("Boxer2");
            boxer2.put("name", edtxtName.getText().toString());
            boxer2.put("punchSpeed", Integer.parseInt(edtxtPunchSpeed.getText().toString()));
            boxer2.put("punchPower", Integer.parseInt(edtxtPunchPower.getText().toString()));
            boxer2.put("kickSpeed", Integer.parseInt(edtxtKickSpeed.getText().toString()));
            boxer2.put("kickPower", Integer.parseInt(edtxtKickPower.getText().toString()));
            boxer2.saveInBackground(new SaveCallback() {
                @Override
                public void done(ParseException e) {
                    if (e == null) {
                        FancyToast.makeText(MainActivity.this, boxer2.get("name") + " OBJ is Been Saved", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true).show();
                    } else {
                        FancyToast.makeText(MainActivity.this, e.getMessage(), FancyToast.LENGTH_LONG, FancyToast.ERROR, true).show();
                    }
                }
            });
        } catch (Exception e){
            FancyToast.makeText(MainActivity.this,e.getMessage(),FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
        }
    }
}
