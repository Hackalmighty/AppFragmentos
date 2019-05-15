package com.example.tecsup.appfragmentos.Fragmentos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.tecsup.appfragmentos.Actvidades.SecondActivity;
import com.example.tecsup.appfragmentos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DescripcionFragment extends Fragment {
    Button b;

    public DescripcionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_descripcion, container, false);

        b = v.findViewById(R.id.btn_fragmento);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PresionoBoton();
            }
        });

        return v;
    }

    void PresionoBoton(){
        //Toast.makeText(getContext(),getContext().toString(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getContext(), SecondActivity.class);
        getContext().startActivity(i);
    }

}
