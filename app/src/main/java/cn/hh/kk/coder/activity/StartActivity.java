package cn.hh.kk.coder.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.hh.kk.coder.R;

/**
 * Created by dong.wei on 2017/3/28.
 */

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);
    }

    /**
     * 打开一个activity
     * @param context
     */
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, StartActivity.class);
        context.startActivity(intent);
    }
}
