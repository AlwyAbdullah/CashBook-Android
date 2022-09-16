package com.alwy.cashbooksertifikasi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.alwy.cashbooksertifikasi.Adapter.listAdapter;
import com.alwy.cashbooksertifikasi.DB.DBHelper;
import com.alwy.cashbooksertifikasi.Models.DetailModel;

import java.util.ArrayList;

public class DetailFragment extends Fragment {
    DetailFragment binding;
    RecyclerView recyclerView, recycleview2;
    DBHelper db;
    private ArrayList<DetailModel> DetailArrayList;
    listAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}