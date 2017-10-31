package com.example.user.phimovies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.phimovies.Users.Men1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstTabFragment extends Fragment {
    private String title;
    private int page;
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    RecyclerAdapter mAdapter;
    public static FirstTabFragment newInstance(int page, String title) {
        FirstTabFragment fragmentFirst = new FirstTabFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }
    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tvLabel = view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);
        mRecyclerView =  view.findViewById(R.id.my_rec_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);



        // use a linear layout manager
        //mLayoutManager = new LinearLayoutManager(getActivity());
       // mRecyclerView.setLayoutManager(mLayoutManager);
        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(getContext(),2);
// Attach the layout manager to the recycler view
        mRecyclerView.setLayoutManager(gridLayoutManager);
       // List<String> items = new ArrayList<>();
        String names[] = {"Петя","Вася","Паша","Коля"};
        String surnames[] = {"Иванцов","Купцов","Никулин","Павличенко"};
        String photo[] = {"https://cdnimg.rg.ru/img/content/138/83/88/1_d_850.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRO9769VCMzOZngytdMBmCJTlyV14UxcnChZ8R3CAnBVIJpAUOT","http://podrobnosti.ua/media/pictures/2016/1/16/thumbs/740x415/di-kaprio-javljaetsja-na-opredelennuju-dolju-russkim_rect_73964f9ad23fe44bdccc31d53472a745.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIP12nh-Hkb-dCVrQ_NY8okOeuYQ0v-ikL4md8SDKHtc2f4hWb6A"};
        Men1 humans[] = new Men1[4];
        List<Men1> mens = new ArrayList<>();
        for (int i = 0; i<humans.length;i++)
        {
            humans[i]= new Men1();
            humans[i].setFirstname(names[i]);
            humans[i].setLastname(surnames[i]);
            humans[i].setPhoto(photo[i]);
            mens.add(humans[i]);
        }
        // specify an adapter (see also next example)
        mAdapter = new RecyclerAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.addAll(mens);
    }
}
