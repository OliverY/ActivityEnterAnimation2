package com.yxj.activityenteranimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Author:  Yxj
 * Time:    2019/5/13 下午2:41
 * -----------------------------------------
 * Description:
 */
public class BaseAcitivity extends AppCompatActivity {

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.slide_right_in,R.anim.hold);
    }

    @Override
    public void finish() {
        super.finish();
//        overridePendingTransition(R.anim.hold,R.anim.slide_right_out);
    }
}
