package com.example.instagramapp.ui.home;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramapp.Adapter.PostsAdapter;
import com.example.instagramapp.Model.PostsModel;
import com.example.instagramapp.R;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<PostsModel>> mutableLiveData;

    public HomeViewModel() {

        mutableLiveData = new MutableLiveData<>();
        ArrayList<PostsModel> data = new ArrayList<>();

        data.add(new PostsModel("safa", R.drawable.a1, R.drawable.a));
        data.add(new PostsModel("safa", R.drawable.b1, R.drawable.b));
        data.add(new PostsModel("safa", R.drawable.c1, R.drawable.c));

        mutableLiveData.setValue(data);

    }
    public LiveData<ArrayList<PostsModel>> getlist() {
        return mutableLiveData;
    }

}