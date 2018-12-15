package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.FictionAdapter;
import ModelClass.FictionModel;
import ws.wolfsoft.hotelinn.R;

public class LibraryFragment extends Fragment {
    private ArrayList<FictionModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private FictionAdapter bAdapter;

    String txt1[]={"4.5/5","4.5/5","4.5/5","4.5/5","4.5/5","4.5/5","4.5/5","4.5/5","4.5/5","4.5/5"};
    String txt2[]={"Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe","Zeroo Cafe",};
    String txt3[]={"Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants","Indain Restaurants",};
    String txt4[]={"1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km","1.5km",};



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_library , container, false);

        recyclerView = view.findViewById(R.id.fictionRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < txt1.length; i++) {
            FictionModel beanClassForRecyclerView_contacts = new FictionModel(txt1[i],txt2[i],txt3[i],txt4[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FictionAdapter(getActivity(),homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);

        return  view;

    }

}