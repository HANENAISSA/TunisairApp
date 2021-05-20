package com.example.tunisairapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListDemandeCongeAdapter extends RecyclerView.Adapter<ListDemandeCongeAdapter.DemandeCongeViewHolder> {

    List<DemandeConge> listeDemandeConge;
    Context context;
    private OnDemandeCongeListener mOnDemandeCongeListener;

    public ListDemandeCongeAdapter(List<DemandeConge> listeCamp, Context context, OnDemandeCongeListener mOnCampListener ) {
        this.listeDemandeConge = listeCamp;
        this.context = context;
        this.mOnDemandeCongeListener = mOnCampListener;
    }

    @NonNull
    @Override
    public DemandeCongeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vue= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_demande_conge_item,parent,false);
        DemandeCongeViewHolder PVH=new DemandeCongeViewHolder(vue, mOnDemandeCongeListener);
        return PVH;
    }

    @Override
    public void onBindViewHolder(@NonNull DemandeCongeViewHolder holder, int position) {

        DemandeConge demandeConge = listeDemandeConge.get(position);

        holder.dateDebut.setText(demandeConge.getDateDebut());
        holder.dateFin.setText(demandeConge.getDatefin());
        holder.description.setText(demandeConge.getDescription());
        holder.fichier.setText(demandeConge.getFichier());
        holder.typeConge.setText(demandeConge.getTypeConge());

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Libelle: "+listeCamp.get(position).getLibelle()+ "\n quantite :" + listeCamp.get(position).getQuantité(), Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return listeDemandeConge.size();
    }

    public static class DemandeCongeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView dateDebut, dateFin, description, fichier, typeConge;
        OnDemandeCongeListener onDemandeCongeListener;

        public DemandeCongeViewHolder(@NonNull View itemView, OnDemandeCongeListener onCampListener) {
            super(itemView);

            dateDebut=itemView.findViewById(R.id.lib);
            dateFin= itemView.findViewById(R.id.lib2);
            description =itemView.findViewById(R.id.sous_nom);
            fichier= itemView.findViewById(R.id.sous_nom);
            typeConge= itemView.findViewById(R.id.sous_nom);

            this.onDemandeCongeListener = onCampListener;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onDemandeCongeListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnDemandeCongeListener
    {
        void onNoteClick(int position);
    }
}
