package com.example.tunisairapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemandeAutorisationFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemandeAutorisationFrag extends Fragment implements ListDemandeAutorisationAdapter.OnDemandeAutorisationListener {

    // list Demande autorisation adapter

    private ListDemandeAutorisationAdapter pad;
    private RecyclerView.LayoutManager LM;
    private List<DemandeAutorisation> lstDemandAutorisation = new ArrayList<DemandeAutorisation>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DemandeAutorisationFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DemandeAutorisationFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static DemandeAutorisationFrag newInstance(String param1, String param2) {
        DemandeAutorisationFrag fragment = new DemandeAutorisationFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // list Demandes

        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));
        lstDemandAutorisation.add(new DemandeAutorisation("nom","soustitre", "description"));


        View view = inflater.inflate(R.layout.fragment_demande_autorisation, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_demande_autoris);
        pad=new ListDemandeAutorisationAdapter(lstDemandAutorisation, getContext(),this);
        recyclerView.setAdapter(pad);
        LM=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(LM);
        return view;
    }

    @Override
    public void onNoteClick(int position) {
        Intent i = new Intent(getContext(), DetailsDemandeActivity.class);
        startActivity(i);
    }
}