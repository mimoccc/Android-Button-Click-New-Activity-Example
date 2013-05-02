package com.androidbegin.buttonclick;
 
import android.os.Bundle;
import android.app.Activity;
 
public class NewActivity extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity); //Notice that I have replaced the layout with new_activity we have previously created
    }
}