package ie.gmit.computing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class HardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hard, menu);
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

    public void btnSmoothClick(View view) {
        Intent smoothActivity = new Intent(view.getContext(), SmoothEdges.class);
        startActivity(smoothActivity);
    }

    public void btnIrregularClick(View view) {
        Intent irregularActivity = new Intent(view.getContext(), IrregularEdges.class);
        startActivity(irregularActivity);
    }


    public void btnSolidClick(View view) {
        Intent solidActivity = new Intent(view.getContext(), SolidActivity.class);
        startActivity(solidActivity);
    }
}
