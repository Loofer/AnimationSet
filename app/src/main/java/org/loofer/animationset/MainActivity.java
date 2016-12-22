package org.loofer.animationset;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.loofer.animationset.code.CodeActivity;
import org.loofer.animationset.interpolator.InterpolatorActivity;
import org.loofer.animationset.interpolator.InterpolatorCodeActivity;
import org.loofer.animationset.viewpropertyanimator.ViewPropertyActivity;
import org.loofer.animationset.xml.XmlActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startXml(View view) {
        startActivity(new Intent(this, XmlActivity.class));
    }

    public void startCode(View view) {
        startActivity(new Intent(this, CodeActivity.class));
    }

    public void startInterpolator(View view) {
        startActivity(new Intent(this, InterpolatorActivity.class));
    }

    public void startInterpolatorCode(View view) {
        startActivity(new Intent(this, InterpolatorCodeActivity.class));
    }

    public void startviewproty(View view) {
        startActivity(new Intent(this, ViewPropertyActivity.class));
    }
}
