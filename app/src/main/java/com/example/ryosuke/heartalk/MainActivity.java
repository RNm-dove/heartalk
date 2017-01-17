package com.example.ryosuke.heartalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
            }



    @Override
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

        switch (item.getItemId()){ // if使うとエラー（itemがInt形式なため）
        case android.R.id.home:   // アプリアイコン（ホームアイコン）を押した時の処理
        NavUtils.navigateUpFromSameTask(this);
        return true;

        case R.id.menu_talking:   //スピーキングボタンが押された時
        Intent hoge = new Intent(this,TalkActivity.class);
        hoge.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(hoge);
        break;
        case R.id.menu_settings:
        // 設定ボタンを押した時
        Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        break;
        }
        return true;
    }
}
