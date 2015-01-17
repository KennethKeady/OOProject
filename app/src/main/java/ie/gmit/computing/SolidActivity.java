package ie.gmit.computing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SolidActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solid);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_solid, menu);
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
        Intent treeActivity = new Intent(view.getContext(), TreeActivity.class);
        startActivity(treeActivity);
    }

    public void btnHardClick(View view) {
        Intent hardActivity = new Intent(view.getContext(), HardActivity.class);
        startActivity(hardActivity);
    }

    public void btnSquashedClick(View view) {
        Intent squashedActivity = new Intent(view.getContext(), SquashedActivity.class);
        startActivity(squashedActivity);
    }

}
