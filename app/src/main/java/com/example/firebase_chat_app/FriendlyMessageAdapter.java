package com.example.firebase_chat_app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FriendlyMessageAdapter extends ArrayAdapter<FriendlyMessage> {

    public FriendlyMessageAdapter(Activity activity,ArrayList<FriendlyMessage> friendlyMessages){
        super(activity,0,friendlyMessages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // if any view is not present in garbage pile then inflate a new view with the help of layoutinflate
        if(convertView == null){
            LayoutInflater layoutInflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layoutInflater.inflate(R.layout.item_message,parent,false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageMessage);
        TextView textView1 = (TextView) convertView.findViewById(R.id.TextMessage);
        TextView author = (TextView) convertView.findViewById(R.id.sender);

        FriendlyMessage message = getItem(position);

        boolean isPhoto = message.getPhoto()!=null;
        if(isPhoto){
            textView1.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            // set the image here with glide
        }else{

            imageView.setVisibility(View.GONE);
            textView1.setVisibility(View.VISIBLE);
            textView1.setText(message.getText());
        }

        author.setText(message.getAuthor());
        return convertView;
    }
}
