package ws.wolfsoft.hotelinn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.HotelListRecycleAdapter;
import ModelClass.ReviewModelClass;

public class HotelListActivity extends AppCompatActivity {

    TextView textView;
    private ArrayList<ReviewModelClass> reviewModelClasses;
    private RecyclerView recyclerView;
    private HotelListRecycleAdapter mAdapter;

    String txt[] = {"Hotel Sunrise", "Hotel Sunrise", "Hotel Sunrise"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        textView = (TextView) findViewById(R.id.title);
        textView.setText("Montreal, canada");


//        HotelName List Recyclerview code is here.

        recyclerView = findViewById(R.id.recyclerView);

        reviewModelClasses = new ArrayList<>();


        for (int i = 0; i < txt.length; i++) {
            ReviewModelClass beanClassForRecyclerView_contacts = new ReviewModelClass(txt[i]);

            reviewModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new HotelListRecycleAdapter(HotelListActivity.this, reviewModelClasses);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HotelListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
