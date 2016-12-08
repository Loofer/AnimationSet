package org.loofer.animationset.interpolator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.loofer.animationset.R;

/**
 * ============================================================
 * 版权： xx xx 版权所有（c）2016
 * <p>
 * 作者：Loofer
 * 版本：1.0
 * 创建日期 ：2016/12/8 17:12.
 * 描述：
 * <p>
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * Modified Date Modify Content:
 * <p>
 * ==========================================================
 */
public class InterpolatorActivity extends AppCompatActivity {

    private Animation acceleraterDeceleraterAnim, acceleraterAnim, antipateAnim, antipateovershotAnim;
    private Animation bounceAnim, cycleAnim, decelerateAnim, linearAnim, overshotAnim;
    private TextView mTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);
        mTv = (TextView) findViewById(R.id.tv);
        initAnimation();
        setTitle("Interpolator-xml");
    }

    private void initAnimation() {
        acceleraterDeceleraterAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_accelerater_decelerate);
        acceleraterAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_accelerater);
        decelerateAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_decelerate);
        antipateAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_anticipate);
        antipateovershotAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_anticipate_overshot);
        bounceAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_bounce);
        cycleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_cycle);
        linearAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_linear);
        overshotAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim_overshot);
    }


    public void accelerateDecelerate(View view) {
        mTv.startAnimation(acceleraterDeceleraterAnim);
    }

    public void accelerate(View view) {
        mTv.startAnimation(acceleraterAnim);
    }

    public void decelerate(View view) {
        mTv.startAnimation(decelerateAnim);
    }

    public void anticipate(View view) {
        mTv.startAnimation(antipateAnim);
    }

    public void anticipateOvershoot(View view) {
        mTv.startAnimation(antipateovershotAnim);
    }

    public void bounce(View view) {
        mTv.startAnimation(bounceAnim);
    }

    public void cycle(View view) {
        mTv.startAnimation(cycleAnim);
    }

    public void linear(View view) {
        mTv.startAnimation(linearAnim);
    }

    public void overshoot(View view) {
        mTv.startAnimation(overshotAnim);
    }
}
