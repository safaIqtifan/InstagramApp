package com.example.instagramapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramapp.Adapter.PostsAdapter;
import com.example.instagramapp.Model.PostsModel;
import com.example.instagramapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView rv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rv = root.findViewById(R.id.recyclerView);

        homeViewModel.getlist().observe(getViewLifecycleOwner(), new Observer<ArrayList<PostsModel>>() {
            @Override
            public void onChanged(ArrayList<PostsModel> postsModels) {

                rv.setLayoutManager(new LinearLayoutManager(getActivity()));
                PostsAdapter postsAdapter= new PostsAdapter(getActivity(), postsModels);
                rv.setAdapter(postsAdapter);
            }
        });

        return root;
    }
}