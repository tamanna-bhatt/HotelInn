package ws.wolfsoft.hotelinn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;

public class ProfileActivity extends AppCompatActivity {



    BottomBar bottomBar;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        title = (TextView)findViewById(R.id.title);
        title.setText("Profile");


        bottomBar = (BottomBar)findViewById(R.id.bottombar);



        for (int i = 0; i < bottomBar.getTabCount(); i++)
        { bottomBar.getTabAtPosition(i).setGravity(Gravity.CENTER_VERTICAL); }
    }
}
