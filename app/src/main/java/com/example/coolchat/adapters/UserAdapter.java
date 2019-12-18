package com.example.coolchat.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coolchat.R;
import com.example.coolchat.model.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private ArrayList<User> userArrayList;
    private OnUserClickListener onUserClickListener;

    public  interface OnUserClickListener{
        void onUserClick(int position);
    }

    public void setOnUserClickListener(OnUserClickListener listener){
         this.onUserClickListener = listener;
    }

    public UserAdapter(ArrayList<User> users){
        this.userArrayList = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        UserViewHolder userViewHolder = new UserViewHolder(view,onUserClickListener);
        return userViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    User currentUser = userArrayList.get(position);
    holder.user_avatar_image_view.setImageResource(currentUser.getAvatarUserMockUpResource());
    holder.user_name_text_view.setText(currentUser.getName());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{
        public ImageView user_avatar_image_view;
        public TextView user_name_text_view;

        public UserViewHolder(@NonNull View itemView, final OnUserClickListener listener) {
            super(itemView);
            user_avatar_image_view = itemView.findViewById(R.id.user_avatar_image_view);
            user_name_text_view = itemView.findViewById(R.id.user_name_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener !=null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onUserClick(position) ;
                        }
                    }
                }
            });
        }
    }
}
