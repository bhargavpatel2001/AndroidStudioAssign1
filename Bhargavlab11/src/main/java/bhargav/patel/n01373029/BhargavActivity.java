/*
Bhargav Patel N01373029 section A
 */
package bhargav.patel.n01373029;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class BhargavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //
    //
    //
    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnWebs:
                Toast toast = Toast.makeText(getApplicationContext(),"Bhargav Patel .You have accessed my favourite game website",
                        Toast.LENGTH_LONG);
                toast.show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.z8games.com/"));
                startActivity(intent);
                break;

            case R.id.btnUrl:
                intent = new Intent(this, BhargavActivity.class);
                startActivity(intent);

            default:
                break;

        }
    }
}
//