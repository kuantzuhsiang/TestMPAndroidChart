//package eric.keys;
//
//import android.support.annotation.Nullable;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import com.google.firebase.database.Query;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class MyAdapter extends FirebaseRecyclerAdapter<MyAdapter.ViewHolder, MyItem> {
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//
//        Button bButton;
//
//        public ViewHolder(View view) {
//            super(view);
//            bButton = (Button) view.findViewById(R.id.bButton);
//        }
//    }
//
//    public MyAdapter(Query query, @Nullable ArrayList<MyItem> items,
//                     @Nullable ArrayList<String> keys) {
//        super(query, items, keys);
//    }
//
//    @Override public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.timing_list, parent, false);
//
//        return new ViewHolder(view);
//    }
//
//    @Override public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
//        MyItem item = getItem(position);
//        if(item.getCode() > 0) {
//            holder.bButton.setText(item.getTime()+"\n(unavailable)");
//        } else {
//            holder.bButton.setText(item.getTime()+"\n(available)");
//        }
//    }
//
//    @Override protected void itemAdded(MyItem item, String key, int position) {
//        Log.d("MyAdapter", "Added a new item to the adapter.");
//    }
//
//    @Override protected void itemChanged(MyItem oldItem, MyItem newItem, String key, int position) {
//        Log.d("MyAdapter", "Changed an item.");
//    }
//
//    @Override protected void itemRemoved(MyItem item, String key, int position) {
//        Log.d("MyAdapter", "Removed an item from the adapter.");
//    }
//
//    @Override protected void itemMoved(MyItem item, String key, int oldPosition, int newPosition) {
//        Log.d("MyAdapter", "Moved an item.");
//    }
//}
