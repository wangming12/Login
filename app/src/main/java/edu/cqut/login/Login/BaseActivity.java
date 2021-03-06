package edu.cqut.login.Login;

import android.app.Activity;
import android.os.Bundle;


//抽象类
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    //初始化
    private void init() {
        setContentView();
        findViews();
        getData();
        showContent();
    }

    //抽象方法
    public abstract void setContentView();
    public abstract void findViews();
    public abstract void getData();
    public abstract void showContent();
}
