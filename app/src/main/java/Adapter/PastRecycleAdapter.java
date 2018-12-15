package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.HotelInnListModelClass;
import ModelClass.PastModelClass;
import ws.wolfsoft.hotelinn.R;


public class PastRecycleAdapter extends RecyclerView.Adapter<PastRecycleAdapter.MyViewHolder>{

    Context context;


    private List<PastModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title,subtitle;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);
            subtitle=(TextView)view.findViewById(R.id.subtitle);




        }

    }


    public PastRecycleAdapter(Context context, List<PastModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public PastRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_past_list, parent, false);


        return new PastRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        PastModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());
        holder.subtitle.setText(lists.getSubtitle());

        if (position==1){
            holder.subtitle.setTextColor(Color.parseColor("#ff5151"));
        }else {
            holder.subtitle.setTextColor(Color.parseColor("#5d921f"));
        }


    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


