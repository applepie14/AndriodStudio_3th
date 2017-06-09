package com.example.user.hyeoo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button mBtn1  = (Button ) findViewById(R.id.PreviousButton); /*alt + enter*/

        mBtn1.setOnLongClickListener(new View.OnLongClickListener() { /*이름이 없는 익명의 클래스를 생성(Anonymous클래스 생성)*/
            @Override
            public boolean onLongClick(View v) { /*자동으로 써지는데, public void ~~~가 안뜨면 View.OnClickListener에서 alt + enter*/
                // 코드 작성
                Intent intent = new Intent(MainActivity.this, PreviousActivity.class);
                startActivity(intent);
                return false;
            }
        });

        Button mBtn2 = (Button ) findViewById(R.id.NextButton); /*alt + enter*/

        mBtn2.setOnClickListener(new View.OnClickListener() { /*이름이 없는 익명의 클래스를 생성(Anonymous클래스 생성)*/
            @Override
            public void onClick(View v) { /*자동으로 써지는데, public void ~~~가 안뜨면 View.OnClickListener에서 alt + enter*/
                // 코드 작성
                Intent intent = new Intent( MainActivity.this, NextActivity.class);
                startActivity(intent);
            } // 메인에서 Next페이지로 넘어가는 이벤트 처리
        });


    }


    //    @Ovrride
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}