package org.loofer.animationset.code;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import org.loofer.animationset.R;

/**
 * ============================================================
 * 版权： xx xx 版权所有（c）2016
 * <p>
 * 作者：Loofer
 * 版本：1.0
 * 创建日期 ：2016/12/8 17:08.
 * 描述：
 * <p>
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * Modified Date Modify Content:
 * <p>
 * ==========================================================
 */
public class CodeActivity extends AppCompatActivity {

    private AlphaAnimation mAlphaAnimation;
    private ScaleAnimation mScaleAnimation;
    private RotateAnimation mRotateAnimation;
    private TranslateAnimation mTranslateAnimation;
    private ImageView mIv;
    private AnimationSet mAnimationSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        setTitle("code-animation");
        mIv = (ImageView) findViewById(R.id.iv);
        initAnimation();
    }

    private void initAnimation() {
        mAlphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        mAlphaAnimation.setFillBefore(true);
        //持续时间
        mAlphaAnimation.setDuration(3000);

        mScaleAnimation = new ScaleAnimation(0.0f, 0.0f, 1.4f, 1.4f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        mScaleAnimation.setFillBefore(true);
        mScaleAnimation.setDuration(700);
        mScaleAnimation.setRepeatMode(Animation.RESTART);
        mScaleAnimation.setRepeatCount(1);


        mRotateAnimation = new RotateAnimation(0.0f, 0.65f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        mRotateAnimation.setFillBefore(true);
        mRotateAnimation.setDuration(3000);

        mTranslateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT,
                -0.8f, Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, -0.8f);

        mAnimationSet = new AnimationSet(false);
        mAnimationSet.addAnimation(mAlphaAnimation);
        mAnimationSet.addAnimation(mScaleAnimation);
        mAnimationSet.addAnimation(mRotateAnimation);
        mAnimationSet.addAnimation(mTranslateAnimation);
    }

    public void alpha(View view) {
        mIv.setAnimation(mAlphaAnimation);
    }

    public void scale(View view) {
        mIv.startAnimation(mScaleAnimation);
    }

    public void rotate(View view) {
        mIv.startAnimation(mRotateAnimation);
    }

    public void trans(View view) {
        mIv.startAnimation(mTranslateAnimation);
    }

    public void set(View view) {
        mIv.startAnimation(mAnimationSet);
    }
}
