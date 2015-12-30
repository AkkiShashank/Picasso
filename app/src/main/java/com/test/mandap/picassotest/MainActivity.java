package com.test.mandap.picassotest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button bSms=(Button)findViewById(R.id.bSms);
        bSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*try{
                    SmsManager sm=SmsManager.getDefault();
                    sm.sendTextMessage("+917503078228",null,"Hi",null,null);
                    Toast.makeText(MainActivity.this,"Sms Sent",Toast.LENGTH_LONG).show();
                }catch(Exception e){
                    Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }*/
            }
        });


        Picasso.with(this)
                .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.no_image)
                .into(imageView);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
