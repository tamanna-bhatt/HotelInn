package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ws.wolfsoft.hotelinn.R;


/**
 * Created by Rp on 8/30/2016.
 */
public class First_Fragment extends Fragment {

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.first_fragment, container, false);



        return view;

    }
    }
