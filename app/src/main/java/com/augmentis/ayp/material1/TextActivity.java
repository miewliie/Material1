package com.augmentis.ayp.material1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TextActivity extends AppCompatActivity {

    protected static final String TEXT = "TEXT";

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        mTextView = (TextView) findViewById(R.id.display_text);

        if(getIntent() != null){
            mTextView.setText(getIntent().getStringExtra(TEXT));
        }
    }
}
