package com.example.jiggy.ab.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jiggy.ab.Activity.ApprovalActivity;
import com.example.jiggy.ab.Activity.DisapprovalActivity;
import com.example.jiggy.ab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MiscellaneousFragment extends Fragment {

    TextView tv_noti, tv_approve, tv_settings, tv_logout, tv_disapprove;

    public MiscellaneousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_miscellaneous, container, false);
        tv_noti = (TextView) v.findViewById(R.id.tv_noti);
        tv_approve = (TextView) v.findViewById(R.id.tv_approve);
        tv_disapprove = (TextView) v.findViewById(R.id.tv_disapprove);
        tv_settings = (TextView) v.findViewById(R.id.tv_settings);
        tv_logout = (TextView) v.findViewById(R.id.tv_logout);

        tv_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        tv_disapprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DisapprovalActivity.class));
            }
        });


        tv_approve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ApprovalActivity.class));
            }
        });

        tv_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
