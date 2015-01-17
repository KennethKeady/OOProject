package ie.gmit.computing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class FlexibleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_flexible, menu);
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

    public void btnRootClick(View view) {
        Intent rootActivity = new Intent(view.getContext(), TreeActivity.class);
        startActivity(rootActivity);
    }

    public void btnFilamentousClick(View view) {
        Intent filamentousActivity = new Intent(view.getContext(), FilamentousActivity.class);
        startActivity(filamentousActivity);
    }

    public void btnLarge2DClick(View view) {
        Intent large2DActivity = new Intent(view.getContext(), Large2DActivity.class);
        startActivity(large2DActivity);
    }
}
