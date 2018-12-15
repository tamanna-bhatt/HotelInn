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

import Adapter.PastRecycleAdapter;
import Adapter.UpcomingRecycleAdapter;
import ModelClass.HotelInnListModelClass;
import ModelClass.PastModelClass;
import ws.wolfsoft.hotelinn.R;


public class Fragment_Past extends Fragment {

    private ArrayList<PastModelClass> pastModelClasses;
    private RecyclerView recyclerView;
    private PastRecycleAdapter bAdapter;

    String txt[]={"Hotel Sunrise","Hotel Welcome"};
    String subtxt[] = {"Stayed","Canceled"};

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_past,container,false);

        recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        pastModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            PastModelClass beanClassForRecyclerView_contacts = new PastModelClass(txt[i],subtxt[i]);
            pastModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new PastRecycleAdapter(getActivity(),pastModelClasses);
        recyclerView.setAdapter(bAdapter);

        return view;
    }
}
