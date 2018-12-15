package ws.wolfsoft.hotelinn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


import Adapter.HotelInnListRecycleAdapter;
import ModelClass.HotelInnListModelClass;


public class Hotel_Inn_List_Activity extends AppCompatActivity {

    private ArrayList<HotelInnListModelClass> cocoNewsListModelClasses;
    private RecyclerView recyclerView;
    private HotelInnListRecycleAdapter bAdapter;

    String txt[]= {"LoginActivity","MobileNumberActivity","OtpVerificationActivity","HotelHomeActivity",
            "SelectDateActivity", "SelectGuestRoomsActivity","HotelLocationActivity","HotelListActivity",
            "HotelMapViewActivity","LongHotelActivity","NearbyLandmarkActivity",
            "ReviewActivity","FilterActivity","HotelSelectRoomActivity","ReviewBookingActivity",
            "CouponsActivity", "HotelPaymentActivity","ProfileActivity","MyTripActivity"
            ,"HotelDetailActivity","BookingSuccessfullAcitivity"};

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_inn__list);

        textView = (TextView)findViewById(R.id.number);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917490844738"));
                startActivity(intent);

            }
        });


//        UI KITS LIST Recyclerview Code is here

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Hotel_Inn_List_Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cocoNewsListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            HotelInnListModelClass beanClassForRecyclerView_contacts = new HotelInnListModelClass(txt[i]);
            cocoNewsListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new HotelInnListRecycleAdapter(Hotel_Inn_List_Activity.this,cocoNewsListModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
