package org.loofer.animationset.xml;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import org.loofer.animationset.R;

/**
 * ============================================================
 * 版权： xx xx 版权所有（c）2016
 * <p>
 * 作者：Loofer
 * 版本：1.0
 * 创建日期 ：2016/12/8 16:46.
 * 描述：
 * <p>
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * Modified Date Modify Content:
 * <p>
 * ==========================================================
 */
public class XmlActivity extends AppCompatActivity {

    Animation alpaAnimation;
    Animation scaleAnimation;
    Animation rotateAnimation;
    Animation translateAnimation;
    Animation setAnimation;
    private ImageView mIv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
        setTitle("xml-animation");
        mIv = (ImageView) findViewById(R.id.iv);
        initAnimation();
    }

    private void initAnimation() {
        alpaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.set_anim);
    }


    public void alpha(View view) {
        mIv.startAnimation(alpaAnimation);
    }

    public void scale(View view) {
        mIv.startAnimation(scaleAnimation);
    }

    public void trans(View view) {
        mIv.startAnimation(translateAnimation);
    }

    public void set(View view) {
        mIv.startAnimation(setAnimation);
    }

    public void rotate(View view) {
        mIv.startAnimation(rotateAnimation);
    }
}
