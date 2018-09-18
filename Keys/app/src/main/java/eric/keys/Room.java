package eric.keys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Room extends AppCompatActivity implements View.OnClickListener {

    private Button bRoom1;
    private Button bRoom2;
    private Button bRoom3;
    private Button bRoom4;
    private Button bRoom5;
    private Button bRoom6;
    private Button bRoom7;
    private Button bRoom8;

//    private DatabaseReference mDatabase;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        bRoom1 = (Button) findViewById(R.id.bRoom1);
        bRoom1.setOnClickListener(this);

        bRoom2 = (Button) findViewById(R.id.bRoom2);
        bRoom2.setOnClickListener(this);

        bRoom3 = (Button) findViewById(R.id.bRoom3);
        bRoom3.setOnClickListener(this);

        bRoom4 = (Button) findViewById(R.id.bRoom4);
        bRoom4.setOnClickListener(this);

        bRoom5 = (Button) findViewById(R.id.bRoom5);
        bRoom5.setOnClickListener(this);

        bRoom6 = (Button) findViewById(R.id.bRoom6);
        bRoom6.setOnClickListener(this);

        bRoom7 = (Button) findViewById(R.id.bRoom7);
        bRoom7.setOnClickListener(this);

        bRoom8 = (Button) findViewById(R.id.bRoom8);
        bRoom8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view == bRoom1) {
            path = "Rooms/Room1";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room1");
        }

        if(view == bRoom2) {
            path = "Rooms/Room2";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room2");
        }

        if(view == bRoom3) {
            path = "Rooms/Room3";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room3");
        }

        if(view == bRoom4) {
            path = "Rooms/Room4";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room4");
        }

        if(view == bRoom5) {
            path = "Rooms/Room5";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room5");
        }

        if(view == bRoom6) {
            path = "Rooms/Room6";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room6");
        }

        if(view == bRoom7) {
            path = "Rooms/Room7";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room7");
        }

        if(view == bRoom8) {
            path = "Rooms/Room8";
//            mDatabase = FirebaseDatabase.getInstance().getReference("Rooms/Room8");
        }

        Intent timingIntent = new Intent(Room.this, Timings.class);
        //timingIntent.putExtra("directory", path);
        Room.this.startActivity(timingIntent);
    }
}
