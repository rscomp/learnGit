package in.devxcode.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;


        switch (view.getId()){
            case R.id.button:
                text = "This button will launch Media Streamer app!";
                break;
            case R.id.button2:
                text = "This button will launch Football Scores app!";
                break;
            case R.id.button3:
                text = "This button will launch Library app!";
                break;
            case R.id.button4:
                text = "This button will launch Gradle Project app!";
                break;
            case R.id.button5:
                text = "This button will launch xyz reader app!";
                break;
            case R.id.button6:
                text = "This button will launch my capstone app!";
                break;

        }

        if(mAppToast != null){
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();
    }
}
