package org.loofer.animationset.viewpropertyanimator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

import org.loofer.animationset.R;

/**
 * ============================================================
 * 版权： Blue mobile 版权所有（c）2016
 * <p>
 * 作者：Loofer
 * 版本：1.0
 * 创建日期 ：2016/12/22 12:01.
 * 描述：
 * <p>
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * Modified Date Modify Content:
 * <p>
 * ==========================================================
 */
public class ViewPropertyActivity extends AppCompatActivity {

    private TextView mTvProperty;
    private int mMeasuredHeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewproperty);
        mTvProperty = (TextView) findViewById(R.id.tv_property);
        startAnimate();
    }


    private void startAnimate() {
        mTvProperty.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mMeasuredHeight = mTvProperty.getMeasuredHeight();
                mTvProperty.animate().translationYBy(-mMeasuredHeight).setDuration(0).start();
                mTvProperty.animate().translationYBy(mMeasuredHeight)
                        .setInterpolator(new OvershootInterpolator())
                        .setDuration(1000).start();
                mTvProperty.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    public void startAnimate(View view) {
        mTvProperty.animate().translationYBy(-mMeasuredHeight).setDuration(0).start();
        mTvProperty.animate().translationYBy(mMeasuredHeight)
                .setInterpolator(new OvershootInterpolator())
                .setDuration(1000).start();
    }
}
