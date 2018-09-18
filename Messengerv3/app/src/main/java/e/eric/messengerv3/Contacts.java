package e.eric.messengerv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class Contacts extends AppCompatActivity {

    private static final String TAG = "Contacts";

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mTexts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Log.d(TAG, "onCreate");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps");

        // Access FireBase here


        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ContactsRecyclerViewAdapter adapter = new ContactsRecyclerViewAdapter(mImages, mNames, mTexts, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
