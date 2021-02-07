/*
Bhargav Patel N01373029 section A
 */
package bhargav.patel.n01373029;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class PatelActivity extends AppCompatActivity {

    TextView editText_stored;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel);

        //receiver
        editText_stored = (TextView)findViewById(R.id.editTextValue);

        //intent object
        Intent intent = getIntent();

        //receiving the value by getStringsExtra() method
        String str = intent.getStringExtra(getString(R.string.Private));

        //Displaying the message
        editText_stored.setText(str);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                R.string.Snackbar_Info, Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}