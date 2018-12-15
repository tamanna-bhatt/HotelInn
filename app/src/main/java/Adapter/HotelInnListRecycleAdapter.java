package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelInnListModelClass;
import ws.wolfsoft.hotelinn.BookingSuccessfullAcitivity;
import ws.wolfsoft.hotelinn.CouponsActivity;
import ws.wolfsoft.hotelinn.FilterActivity;
import ws.wolfsoft.hotelinn.HomeActivity;
import ws.wolfsoft.hotelinn.HotelDetailActivity;
import ws.wolfsoft.hotelinn.HotelListActivity;
import ws.wolfsoft.hotelinn.HotelLocationActivity;
import ws.wolfsoft.hotelinn.HotelMapViewActivity;
import ws.wolfsoft.hotelinn.HotelPaymentActivity;
import ws.wolfsoft.hotelinn.HotelProfileActivity;
import ws.wolfsoft.hotelinn.HotelSelectRoomActivity;
import ws.wolfsoft.hotelinn.LoginActivity;
import ws.wolfsoft.hotelinn.LongHotelActivity;
import ws.wolfsoft.hotelinn.MobileNumberActivity;
import ws.wolfsoft.hotelinn.MyTripActivity;
import ws.wolfsoft.hotelinn.NearbyLandmarkActivity;
import ws.wolfsoft.hotelinn.OtpVerificationActivity;
import ws.wolfsoft.hotelinn.ProfileActivity;
import ws.wolfsoft.hotelinn.R;
import ws.wolfsoft.hotelinn.ReviewActivity;
import ws.wolfsoft.hotelinn.ReviewBookingActivity;
import ws.wolfsoft.hotelinn.SelectDateActivity;
import ws.wolfsoft.hotelinn.SelectGuestRoomsActivity;


public class HotelInnListRecycleAdapter extends RecyclerView.Adapter<HotelInnListRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelInnListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public HotelInnListRecycleAdapter(Context context, List<HotelInnListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HotelInnListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel_inn_list, parent, false);


        return new HotelInnListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelInnListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, LoginActivity.class);
                    context.startActivity(i);
                }else  if (position ==1){
                    Intent i = new Intent(context, MobileNumberActivity.class);
                    context.startActivity(i);
                }else  if (position ==2){
                    Intent i = new Intent(context, OtpVerificationActivity.class);
                    context.startActivity(i);
                }else  if (position ==3){
                    Intent i = new Intent(context, HomeActivity.class);
                    context.startActivity(i);
                }else  if (position ==4){
                    Intent i = new Intent(context, SelectDateActivity.class);
                    context.startActivity(i);
                }else  if (position ==5){
                    Intent i = new Intent(context, SelectGuestRoomsActivity.class);
                    context.startActivity(i);
                }else  if (position ==6){
                    Intent i = new Intent(context, HotelLocationActivity.class);
                    context.startActivity(i);
                }else  if (position ==7){
                    Intent i = new Intent(context, HotelListActivity.class);
                    context.startActivity(i);
                }else  if (position ==8){
                    Intent i = new Intent(context, HotelMapViewActivity.class);
                    context.startActivity(i);
                }else  if (position ==15){
                    Intent i = new Intent(context, CouponsActivity.class);
                    context.startActivity(i);
                }else  if (position ==11){
                    Intent i = new Intent(context, ReviewActivity.class);
                    context.startActivity(i);
                }else  if (position ==13){
                    Intent i = new Intent(context, HotelSelectRoomActivity.class);
                    context.startActivity(i);
                }else  if (position ==14){
                    Intent i = new Intent(context, ReviewBookingActivity.class);
                    context.startActivity(i);
                }else  if (position ==16){
                    Intent i = new Intent(context, HotelPaymentActivity.class);
                    context.startActivity(i);
                }else  if (position ==17){
                    Intent i = new Intent(context, ProfileActivity.class);
                    context.startActivity(i);
                }else  if (position ==18){
                    Intent i = new Intent(context, MyTripActivity.class);
                    context.startActivity(i);
                }else  if (position ==19){
                    Intent i = new Intent(context, HotelDetailActivity.class);
                    context.startActivity(i);
                }else  if (position ==20){
                    Intent i = new Intent(context, BookingSuccessfullAcitivity.class);
                    context.startActivity(i);
                }else  if (position ==9){
                    Intent i = new Intent(context, LongHotelActivity.class);
                    context.startActivity(i);
                }else  if (position ==12){
                    Intent i = new Intent(context, FilterActivity.class);
                    context.startActivity(i);
                }else  if (position ==10){
                    Intent i = new Intent(context, NearbyLandmarkActivity.class);
                    context.startActivity(i);
                }
            }

        });



    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


