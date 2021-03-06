package ie.gmit.computing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class TreeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tree, menu);
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

    public void btnSolidClick(View view) {
        Intent solidActivity = new Intent(view.getContext(), SolidActivity.class);
        startActivity(solidActivity);
    }

    public void btnFlexibleClick(View view) {
        Intent flexibleActivity = new Intent(view.getContext(), FlexibleActivity.class);
        startActivity(flexibleActivity);
    }

    public void btnHomeClick(View view) {
        Intent homeActivity = new Intent(view.getContext(), MainActivity.class);
        startActivity(homeActivity);
    }
}
