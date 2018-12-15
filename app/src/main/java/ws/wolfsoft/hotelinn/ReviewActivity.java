package ws.wolfsoft.hotelinn;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.util.ArrayList;

import Adapter.HotelInnListRecycleAdapter;
import Adapter.ReviewRecycleAdapter;
import ModelClass.HotelInnListModelClass;
import ModelClass.ReviewModelClass;

public class ReviewActivity extends AppCompatActivity {

    TextView textView;
    private ArrayList<ReviewModelClass> reviewModelClasses;
    private RecyclerView recyclerView;
    private ReviewRecycleAdapter Adapter;

    String txt[]= {"Must Go!","Awesome","Average"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        textView = (TextView)findViewById(R.id.title);

        textView.setText("Review");

        CircularProgressBar circularProgressBar = (CircularProgressBar)findViewById(R.id.circle_progress);
        circularProgressBar.setColor(ContextCompat.getColor(this, R.color.circle_blue));
        circularProgressBar.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
        circularProgressBar.setProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        circularProgressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        int animationDuration = 2500; // 2500ms = 2,5s
        circularProgressBar.setProgressWithAnimation(65, animationDuration); // Default duration = 1500ms

        CircularProgressBar circularProgressBar1 = (CircularProgressBar)findViewById(R.id.circle_progress1);
        circularProgressBar1.setColor(ContextCompat.getColor(this, R.color.circle_blue));
        circularProgressBar1.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
        circularProgressBar1.setProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        circularProgressBar1.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        int animationDuration1 = 2500; // 2500ms = 2,5s
        circularProgressBar1.setProgressWithAnimation(65, animationDuration); // Default duration = 1500ms


        CircularProgressBar circularProgressBar2 = (CircularProgressBar)findViewById(R.id.circle_progress2);
        circularProgressBar2.setColor(ContextCompat.getColor(this, R.color.circle_blue));
        circularProgressBar2.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
        circularProgressBar2.setProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        circularProgressBar2.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        int animationDuration2 = 2500; // 2500ms = 2,5s
        circularProgressBar2.setProgressWithAnimation(65, animationDuration); // Default duration = 1500ms

        CircularProgressBar circularProgressBar3 = (CircularProgressBar)findViewById(R.id.circle_progress3);
        circularProgressBar3.setColor(ContextCompat.getColor(this, R.color.circle_blue));
        circularProgressBar3.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
        circularProgressBar3.setProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        circularProgressBar3.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_width));
        int animationDuration3 = 2500; // 2500ms = 2,5s
        circularProgressBar3.setProgressWithAnimation(65, animationDuration); // Default duration = 1500ms


//     Review Recyclerview Code is Here

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ReviewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        reviewModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            ReviewModelClass beanClassForRecyclerView_contacts = new ReviewModelClass(txt[i]);
            reviewModelClasses.add(beanClassForRecyclerView_contacts);
        }
        Adapter = new ReviewRecycleAdapter(ReviewActivity.this,reviewModelClasses);
        recyclerView.setAdapter(Adapter);


    }
}
