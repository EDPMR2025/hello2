package com.example.hello2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CAT = "PMR";
    private EditText edtInputNom;
    private Button btnOK;
    void alerter (String s) {
        Log.i(CAT,s);
        Toast myToast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        myToast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        alerter("onCreate");
        edtInputNom = (EditText) findViewById(R.id.inputNom);
        btnOK = (Button) findViewById(R.id.btnOK);

        btnOK.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        alerter("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        alerter("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        alerter("onResume");
    }

    @Override
    public void onClick(View v) {
        alerter("click !");
    }
}