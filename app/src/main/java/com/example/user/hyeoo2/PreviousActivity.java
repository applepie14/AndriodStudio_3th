package com.example.user.hyeoo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PreviousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button mBtn1 = (Button) findViewById(R.id.ToMain1); /*alt + enter*/

        mBtn1.setOnClickListener(new View.OnClickListener() { /*이름이 없는 익명의 클래스를 생성(Anonymous클래스 생성)*/
            @Override
            public void onClick(View v) { /*자동으로 써지는데, public void ~~~가 안뜨면 View.OnClickListener에서 alt + enter*/
                // 코드 작성
                Intent intent = new Intent(PreviousActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}