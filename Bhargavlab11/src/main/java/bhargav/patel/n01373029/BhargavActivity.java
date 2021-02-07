/*
Bhargav Patel N01373029 section A
 */
package bhargav.patel.n01373029;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class BhargavActivity extends AppCompatActivity {

    //define the variable
    Button jpg;
    EditText textEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jpg = (Button)findViewById(R.id.btnJpg);
        textEdit = (EditText)findViewById(R.id.userInfo);

        // Button config
        jpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the editText value and convert to String

                String str = textEdit.getText().toString();

                //Creating Intent to move the object class to second
                Intent intent = new Intent(getApplicationContext(), PatelActivity.class);

                // Use putExtra
                intent.putExtra(getString(R.string.Private),str);

                //Start the Intent
                startActivity(intent);
            }
        });

    }
    //
    //
    //
    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnWebs:
                Toast toast = Toast.makeText(getApplicationContext(), R.string.ToastContext,
                        Toast.LENGTH_LONG);
                toast.show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.MyWebsite)));
                startActivity(intent);
                break;

            case R.id.btnJpg:
                intent = new Intent(this, PatelActivity.class);
                startActivity(intent);

            default:
                break;

        }
    }
}
//