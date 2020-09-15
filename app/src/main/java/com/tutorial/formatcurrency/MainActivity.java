package com.tutorial.formatcurrency;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.santalu.maskedittext.MaskEditText;

public class MainActivity extends AppCompatActivity {
    private MaskEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edtNumber);
    }


    public void showText(View view) {
        Toast.makeText(this, editText.getRawText(), Toast.LENGTH_SHORT).show();
    }
}