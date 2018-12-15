package Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelInnListModelClass;
import ModelClass.SelectRoomModelClass;
import ws.wolfsoft.hotelinn.BookingSuccessfullAcitivity;
import ws.wolfsoft.hotelinn.HotelDetailActivity;
import ws.wolfsoft.hotelinn.HotelListActivity;
import ws.wolfsoft.hotelinn.HotelLocationActivity;
import ws.wolfsoft.hotelinn.HotelMapViewActivity;
import ws.wolfsoft.hotelinn.HotelPaymentActivity;
import ws.wolfsoft.hotelinn.MyTripActivity;
import ws.wolfsoft.hotelinn.R;
import ws.wolfsoft.hotelinn.ReviewActivity;
import ws.wolfsoft.hotelinn.ReviewBookingActivity;
import ws.wolfsoft.hotelinn.SelectGuestRoomsActivity;


public class SelectRoomRecycleAdapter extends RecyclerView.Adapter<SelectRoomRecycleAdapter.MyViewHolder>{

    Context context;


    private List<SelectRoomModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title,recommand,few,refund;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);
            recommand=(TextView)view.findViewById(R.id.recommand);
            few=(TextView)view.findViewById(R.id.few);
            refund=(TextView)view.findViewById(R.id.refund);




        }

    }


    public SelectRoomRecycleAdapter(Context context, List<SelectRoomModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public SelectRoomRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_select_room_list, parent, false);


        return new SelectRoomRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        SelectRoomModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        if(position == 0){

            holder.recommand.setVisibility(View.VISIBLE);
            holder.few.setVisibility(View.VISIBLE);
        }else {
            holder.recommand.setVisibility(View.GONE);
            holder.few.setVisibility(View.GONE);
        }


        if (position==1){

            holder.refund.setTextColor(Color.parseColor("#5c8c25"));

        }else {

            holder.refund.setTextColor(Color.parseColor("#f32e2e"));
        }


    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


