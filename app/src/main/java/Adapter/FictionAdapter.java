package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.FictionModel;
import ws.wolfsoft.hotelinn.R;

public class FictionAdapter extends RecyclerView.Adapter<FictionAdapter.MyViewHolder>{

    Context context;


    private List<FictionModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {




        TextView txt1,txt2,txt3,txt4;

        public MyViewHolder(View view) {
            super(view);

            txt1=(TextView)view.findViewById(R.id.txt1);
            txt2=(TextView)view.findViewById(R.id.txt2);
            txt3=(TextView)view.findViewById(R.id.txt3);
            txt4=(TextView)view.findViewById(R.id.txt4);



        }

    }


    public FictionAdapter(Context mainActivityContacts, List<FictionModel> offerList) {
        this.context = mainActivityContacts;
        this.OfferList = offerList;
    }

    @Override
    public FictionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pop_up1, parent, false);


        return new FictionAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull FictionAdapter.MyViewHolder holder, int position) {
        FictionModel lists = OfferList.get(position);


        holder.txt1.setText(lists.getTxt1());

        holder.txt2.setText(lists.getTxt2());
        holder.txt3.setText(lists.getTxt3());
        holder.txt4.setText(lists.getTxt4());


    }

    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


