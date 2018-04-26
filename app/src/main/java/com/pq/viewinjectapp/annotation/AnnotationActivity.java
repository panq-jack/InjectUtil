package com.pq.viewinjectapp.annotation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pq.viewinjectapp.R;

/**
 * Created by pan on 2018/4/26.
 */

public class AnnotationActivity extends AppCompatActivity {

    @ViewInject(R.id.text_view)
    private TextView textView;

    @ClickInject(R.id.button)
    public void clickBtn(View view){
        Toast.makeText(this,"click button",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtil.inject(this);

        textView.setText("annotation text");
    }
}
