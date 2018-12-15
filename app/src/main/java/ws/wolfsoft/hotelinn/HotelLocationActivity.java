package ws.wolfsoft.hotelinn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HotelLocationActivity extends AppCompatActivity {
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_location);
        title =(TextView)findViewById(R.id.title);
        title.setText("Enter Destination");

    }
}
