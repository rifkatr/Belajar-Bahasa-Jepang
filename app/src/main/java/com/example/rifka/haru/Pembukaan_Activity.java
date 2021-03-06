package com.example.rifka.haru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

/**
 * Created by Rifka on 16/01/2018.
 */

public class Pembukaan_Activity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_pembukaan);

        start = (LinearLayout)findViewById(R.id.LinearLayout1);
        start.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.LinearLayout1:
                i = new Intent(Pembukaan_Activity.this, MenuUtama_Activity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
