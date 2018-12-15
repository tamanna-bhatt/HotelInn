package ws.wolfsoft.hotelinn;

import android.app.Dialog;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.HotelPagerAdapter;

public class FilterActivity extends AppCompatActivity {

    TextView textView,title,clear;

    Dialog myDialog;


    LinearLayout facilities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        facilities =(LinearLayout)findViewById(R.id.facilities);
        title=(TextView)findViewById(R.id.title);
        clear=(TextView)findViewById(R.id.clear);
        clear.setVisibility(View.VISIBLE);
        title.setText("Filter");

        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myDialog = new Dialog(FilterActivity.this);
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.filter_popup);
                myDialog.show();

            }
        });




    }
}
