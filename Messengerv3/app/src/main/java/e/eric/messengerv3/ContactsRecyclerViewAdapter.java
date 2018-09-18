package e.eric.messengerv3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsRecyclerViewAdapter extends RecyclerView.Adapter<ContactsRecyclerViewAdapter.ViewHolder>{

    // Debug statement
    private static final String TAG = "ContactsRVAdapter";

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImageTexts = new ArrayList<>();
    private Context mContext;

    public ContactsRecyclerViewAdapter(ArrayList<String> images, ArrayList<String> imageNames, ArrayList<String> imageTexts, Context context) {
        mImages = images;
        mImageNames = imageNames;
        mImageTexts = imageTexts;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder called");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));
        holder.imageText.setText(mImageTexts.get(position));

        holder.contactsLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.d(TAG, "Clicked on: " + mImageNames.get(position));

               // Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();

               // Redirect to messaging activity
               Intent intent = new Intent(mContext, Messaging.class);
               intent.putExtra("image", mImages.get(position));
               intent.putExtra("image_name", mImageNames.get(position));
               mContext.startActivity(intent);
           }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        TextView imageText;
        RelativeLayout contactsLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageText = itemView.findViewById(R.id.image_text);
            contactsLayout = itemView.findViewById(R.id.contacts_layout);
        }
    }
}
