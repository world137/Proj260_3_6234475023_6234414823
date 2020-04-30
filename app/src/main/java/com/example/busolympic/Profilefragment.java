package com.example.busolympic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.busolympic.profile.FragmentAssist;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


import com.example.busolympic.profile.Method;
import com.example.busolympic.profile.PInfo;
import com.example.busolympic.profile.PRegister;
import com.example.busolympic.profile.Profile;

public class Profilefragment extends Fragment {
    private ArrayList<String[]> events = new ArrayList<>();
    private String line;
    private String[] lineArr;
    private RecyclerView recyclerView;
    private String userID  ;
    private String password  ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView register = view.findViewById(R.id.register);
        ImageView signIn = view.findViewById(R.id.signIn);
        final EditText user = view.findViewById(R.id.username);
        final EditText pass = view.findViewById(R.id.password);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new PRegister();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, newFragment);
                transaction.commit();
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userID = user.getText().toString();
                password = pass.getText().toString();


                if (FragmentAssist.authenticate(userID, password, getContext())) {
                    Profile newProfile = new Profile(userID, password);
                    Method.saveProfile(getContext(), newProfile);
                    Method.saveLoginStatus(getContext(), true);
                    Toast.makeText(getActivity(),"Login Successful", Toast.LENGTH_SHORT).show();
                    Fragment newFragment = new PInfo();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.commit();
                }
                else {
                    Toast.makeText(getActivity(),"Incorrect Login Credential", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;

    }
}
