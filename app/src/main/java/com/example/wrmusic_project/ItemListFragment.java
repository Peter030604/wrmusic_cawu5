package com.example.wrmusic_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemListFragment extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new ProductAdapter();

        new Product("Spear of Destiny", 2000000);
        new Product("Apple of Eden", 2500000);
        new Product("Healing Potion", 15000);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}