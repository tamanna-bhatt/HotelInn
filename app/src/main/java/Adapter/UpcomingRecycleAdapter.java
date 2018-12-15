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
import ws.wolfsoft.hotelinn.HotelListActivity;
import ws.wolfsoft.hotelinn.HotelLocationActivity;
import ws.wolfsoft.hotelinn.HotelMapViewActivity;
import ws.wolfsoft.hotelinn.HotelPaymentActivity;
import ws.wolfsoft.hotelinn.MyTripActivity;
import ws.wolfsoft.hotelinn.R;
import ws.wolfsoft.hotelinn.ReviewActivity;
import ws.wolfsoft.hotelinn.ReviewBookingActivity;
import ws.wolfsoft.hotelinn.SelectGuestRoomsActivity;


public class UpcomingRecycleAdapter extends RecyclerView.Adapter<UpcomingRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelInnListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title,txt;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);
            txt=(TextView)view.findViewById(R.id.txt);




        }

    }


    public UpcomingRecycleAdapter(Context context, List<HotelInnListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public UpcomingRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_upcoming_list, parent, false);


        return new UpcomingRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelInnListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        if (position==0){
            holder.txt.setText("Stayed");
            holder.txt.setTextColor(Color.parseColor("#5d921f"));

        }
        else if (position==1){

            holder.txt.setText("Cancelled");
            holder.txt.setTextColor(Color.parseColor("#ff5151"));


        }





    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


