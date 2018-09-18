package e.eric.messengerv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Messaging extends AppCompatActivity {

    private static final String TAG = "MessagingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
        Log.d(TAG, "onCreate");


    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent");
        if(getIntent().hasExtra("image") && getIntent().hasExtra("image_name")) {
            Log.d(TAG, "found intent");

            String image = getIntent().getStringExtra("image");
            String name = getIntent().getStringExtra("image_name");
        }
    }
}
