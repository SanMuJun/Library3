package library3.library3.controller.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import library3.library3.R;


public class SplashActivity extends Activity {
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (isFinishing()){
                return;
            }
            toMainOrLogin();
            finish();

        }
    };
    private void toMainOrLogin() {
        startActivity(new Intent(this,LoginActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.sendMessageDelayed(Message.obtain(), 3000);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        handler.removeCallbacksAndMessages(null);
    }
}