package ws.wolfsoft.hotelinn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HotelPaymentActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_payment);

        textView = (TextView)findViewById(R.id.title);

        textView.setText("Payment");
    }
}
