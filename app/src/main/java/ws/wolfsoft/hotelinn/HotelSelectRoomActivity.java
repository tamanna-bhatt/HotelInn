package ws.wolfsoft.hotelinn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.HotelInnListRecycleAdapter;
import Adapter.SelectRoomRecycleAdapter;
import ModelClass.HotelInnListModelClass;
import ModelClass.SelectRoomModelClass;

public class HotelSelectRoomActivity extends AppCompatActivity {


    private ArrayList<SelectRoomModelClass> selectRoomModelClasses;
    private RecyclerView recyclerView;
    private SelectRoomRecycleAdapter bAdapter;

    String txt[]={"Classic Room","King Room","Classic Room","King Room","Classic Room","King Room"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_select_room);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HotelSelectRoomActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        selectRoomModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            SelectRoomModelClass beanClassForRecyclerView_contacts = new SelectRoomModelClass(txt[i]);
            selectRoomModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new SelectRoomRecycleAdapter(HotelSelectRoomActivity.this,selectRoomModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
