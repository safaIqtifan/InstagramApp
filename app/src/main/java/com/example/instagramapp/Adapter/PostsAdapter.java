package com.example.instagramapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagramapp.Model.PostsModel;
import com.example.instagramapp.R;
import com.example.instagramapp.databinding.ItemPostBinding;
import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.FarmViewHolder> {

    Context activity;
    ArrayList<PostsModel> list;

    public PostsAdapter(Context activity, ArrayList<PostsModel> categoriesList) {
        this.activity = activity;
        this.list = categoriesList;
    }

    @NonNull
    @Override
    public FarmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemPostBinding binding = ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new FarmViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FarmViewHolder holder, int position) {

        PostsModel postsModel = list.get(position);

        holder.binding.userNameTV.setText(postsModel.getName());

        Glide.with(activity).asBitmap().load(postsModel.getUserImg()).placeholder(R.drawable.profile).into(holder.binding.userImg);
        Glide.with(activity).asBitmap().load(postsModel.getPostPhoto()).placeholder(R.drawable.icon_camera).into(holder.binding.postPhotoImg);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setPosts(ArrayList<PostsModel> posts){
        notifyDataSetChanged();
    }

    public class FarmViewHolder extends RecyclerView.ViewHolder {
        ItemPostBinding binding;
        public FarmViewHolder(@NonNull ItemPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;


        }
    }
}
