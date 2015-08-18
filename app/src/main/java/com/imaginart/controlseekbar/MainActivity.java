package com.imaginart.controlseekbar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SeekBar)findViewById(R.id.barra)).setOnSeekBarChangeListener(this);

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

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        ((TextView)findViewById(R.id.cantidad)).setText("Cantidad: " + progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        ((TextView)findViewById(R.id.action)).setText("Inicio: " + seekBar.getProgress());
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        ((TextView)findViewById(R.id.action)).setText("Se detuvo");
    }
}
