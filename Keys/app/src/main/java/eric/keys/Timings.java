package eric.keys;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;


import android.support.v7.widget.LinearLayoutManager;

import com.google.firebase.database.Query;

import org.parceler.Parcels;

import java.util.ArrayList;

public class Timings extends AppCompatActivity implements View.OnClickListener {


    private Button bRoom1;
    private Button bRoom2;
    private Button bRoom3;
    private Button bRoom4;
    private Button bRoom5;
    private Button bRoom6;
    private Button bRoom7;
    private Button bRoom8;
    private Button bRoom9;
    private Button bRoom10;
    private Button bRoom11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timings);

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

        bRoom9 = (Button) findViewById(R.id.bRoom9);
        bRoom9.setOnClickListener(this);

        bRoom10 = (Button) findViewById(R.id.bRoom10);
        bRoom10.setOnClickListener(this);

        bRoom11 = (Button) findViewById(R.id.bRoom11);
        bRoom11.setOnClickListener(this);
    }

//    private final static String SAVED_ADAPTER_ITEMS = "SAVED_ADAPTER_ITEMS";
//    private final static String SAVED_ADAPTER_KEYS = "SAVED_ADAPTER_KEYS";
//
//    private Query mQuery;
//    private MyAdapter mMyAdapter;
//    private ArrayList<MyItem> mAdapterItems;
//    private ArrayList<String> mAdapterKeys;
//    private String path;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_timings);
//
//        Bundle extras = getIntent().getExtras();
//        if (extras == null) {
//            return;
//        }
//        // get data via the key
//        path = extras.getString("directory");
//        if (path != null) {
//            // do something with the data
//            handleInstanceState(savedInstanceState);
//            setupFirebase();
//            setupRecyclerview();
//        }
//    }
//
//    // Restoring the item list and the keys of the items: they will be passed to the adapter
//    private void handleInstanceState(Bundle savedInstanceState) {
//        if (savedInstanceState != null &&
//                savedInstanceState.containsKey(SAVED_ADAPTER_ITEMS) &&
//                savedInstanceState.containsKey(SAVED_ADAPTER_KEYS)) {
//            mAdapterItems = Parcels.unwrap(savedInstanceState.getParcelable(SAVED_ADAPTER_ITEMS));
//            mAdapterKeys = savedInstanceState.getStringArrayList(SAVED_ADAPTER_KEYS);
//        } else {
//            mAdapterItems = new ArrayList<MyItem>();
//            mAdapterKeys = new ArrayList<String>();
//        }
//    }
//
//    private void setupFirebase() {
////        DatabaseReference firebaseLocation=
////        Firebase.setAndroidContext(this);
////        String firebaseLocation = "https://keys-20101.firebaseio.com/";
////        mQuery = new Firebase(firebaseLocation);
//        mQuery = FirebaseDatabase.getInstance().getReference(path);
//    }
//
//    private void setupRecyclerview() {
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
////        mMyAdapter = new MyAdapter()
//        mMyAdapter = new MyAdapter(mQuery, mAdapterItems, mAdapterKeys);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(mMyAdapter);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        return item.getItemId() == R.id.action_settings || super.onOptionsItemSelected(item);
//    }
//
//    // Saving the list of items and keys of the items on rotation
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putParcelable(SAVED_ADAPTER_ITEMS, Parcels.wrap(mMyAdapter.getItems()));
//        outState.putStringArrayList(SAVED_ADAPTER_KEYS, mMyAdapter.getKeys());
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mMyAdapter.destroy();
//    }

    @Override
    public void onClick(View view) {
        Intent lobby2Intent = new Intent(Timings.this, Lobby2.class);
        Timings.this.startActivity(lobby2Intent);
    }
}
