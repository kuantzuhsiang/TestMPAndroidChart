package eric.weatherprediction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    EditText userNameET;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);
        userNameET = (EditText) findViewById(R.id.userNameET);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        final SharedPreferences sharedPreferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);
        String userId = sharedPreferences.getString("userId", null);
        if (userId != null) {
            Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(myIntent);
        }

        // Firebase reference
        final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("users");

        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(myIntent);

                String userName = userNameET.getText().toString();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(MainActivity.this, "Please enter a username.", Toast.LENGTH_SHORT).show();
                } else {
                    Log.i("Button Click:", userName);
                    // get unique user id from firebase
                    String userId = mDatabase.push().getKey();
                    User user = new User(userName, 0);
                    mDatabase.child(userId).setValue(user);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("userId", userId);
                    editor.commit();
                }
            }
        });

    }
}
