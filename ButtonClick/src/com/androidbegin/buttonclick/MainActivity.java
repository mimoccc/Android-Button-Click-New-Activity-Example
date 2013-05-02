package com.androidbegin.buttonclick;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class MainActivity extends Activity {
    private Button button; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title_activity_main);
        setContentView(R.layout.activity_main); 
 
        button = (Button)findViewById(R.id.MyButton);
 
        button.setOnClickListener(new OnClickListener() {
 
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
                MainActivity.this.startActivity(myIntent);
                // TODO Auto-generated method stub
            }
        });
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}