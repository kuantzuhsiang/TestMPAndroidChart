package eric.keys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BookingsLobby extends AppCompatActivity implements View.OnClickListener {

    private EditText editHeader;
    private Button bLogout;
    private Button bBook;
    private EditText editBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings_lobby);

        editHeader = (EditText) findViewById(R.id.etHeader);
        editHeader.setEnabled(false);

        editBooking = (EditText) findViewById(R.id.etBooking);
        editBooking.setEnabled(false);

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
            Intent loginIntent = new Intent(BookingsLobby.this, LoginActivity.class);
            BookingsLobby.this.startActivity(loginIntent);
            Toast.makeText(BookingsLobby.this,"Logout successful",Toast.LENGTH_LONG).show();
        }

        if(view == bBook) {
            //redirect to register activity on click
            Intent roomIntent = new Intent(BookingsLobby.this, Room.class);
            BookingsLobby.this.startActivity(roomIntent);
        }
    }
}
