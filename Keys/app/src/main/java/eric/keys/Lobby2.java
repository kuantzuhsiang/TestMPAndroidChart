package eric.keys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lobby2 extends AppCompatActivity implements View.OnClickListener {

    private EditText editHeader;
    private Button bLogout;
    private Button bBook;
    private EditText editBooking;
    private EditText editBooking2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby2);

        editHeader = (EditText) findViewById(R.id.etHeader);
        editHeader.setEnabled(false);

        editBooking = (EditText) findViewById(R.id.etBooking);
        editBooking.setEnabled(false);

        editBooking2 = (EditText) findViewById(R.id.etBooking2);
        editBooking2.setEnabled(false);

        bLogout = (Button) findViewById(R.id.bLogout);
        bBook = (Button) findViewById(R.id.bBook);

        //attaching listener to logout button
        bLogout.setOnClickListener(this);

        //attaching listener to booking button
        bBook.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == bLogout) {
            //redirect to login activity on click
            Intent loginIntent = new Intent(Lobby2.this, LoginActivity.class);
            Lobby2.this.startActivity(loginIntent);
            Toast.makeText(Lobby2.this,"Logout successful",Toast.LENGTH_LONG).show();
        }

        if(view == bBook) {
            //redirect to register activity on click
            Intent roomIntent = new Intent(Lobby2.this, Room.class);
            Lobby2.this.startActivity(roomIntent);
        }
    }
}
