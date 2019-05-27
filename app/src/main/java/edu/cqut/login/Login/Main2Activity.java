package edu.cqut.login.Login;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import edu.cqut.login.R;

public class Main2Activity extends Activity {

    //实例化类HeartView
    HeartView heartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        heartView = findViewById(R.id.surfaceView);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        heartView.reDraw();
        return super.onTouchEvent(event);
    }
    public  void reDraw(View v) {
        heartView.reDraw();
    }
}
