package arun_sharma.first.resortmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable())
        {
            public void run(){
                Intent intent = new Intent (Splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
        }, delayMillis:2000);
        }
    }
}
