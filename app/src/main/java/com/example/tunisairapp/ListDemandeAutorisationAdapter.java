package com.example.tunisairapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListDemandeAutorisationAdapter extends  RecyclerView.Adapter<ListDemandeAutorisationAdapter.DemandeAutorisViewHolder> {
    List<DemandeAutorisation> listeDemandeAutorisation;
    Context context;
    private ListDemandeAutorisationAdapter.OnDemandeAutorisationListener mOnDemandeAutorisationListener;

    public ListDemandeAutorisationAdapter(List<DemandeAutorisation> listeCamp, Context context, ListDemandeAutorisationAdapter.OnDemandeAutorisationListener mOnCampListener ) {
        this.listeDemandeAutorisation = listeCamp;
        this.context = context;
        this.mOnDemandeAutorisationListener = mOnCampListener;
    }

    @NonNull
    @Override
    public ListDemandeAutorisationAdapter.DemandeAutorisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vue= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_demande_conge_item,parent,false);
        ListDemandeAutorisationAdapter.DemandeAutorisViewHolder PVH=new ListDemandeAutorisationAdapter.DemandeAutorisViewHolder(vue, mOnDemandeAutorisationListener);
        return PVH;
    }

    @Override
    public void onBindViewHolder(@NonNull ListDemandeAutorisationAdapter.DemandeAutorisViewHolder holder, int position) {
        DemandeAutorisation demandeAutorisation = listeDemandeAutorisation.get(position);

        holder.heureDebut.setText(demandeAutorisation.getHeureDebut());
        holder.heureFin.setText(demandeAutorisation.getHeureFin());
        holder.raison.setText(demandeAutorisation.getRaison());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class DemandeAutorisViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView heureDebut, heureFin, raison;
        ListDemandeAutorisationAdapter.OnDemandeAutorisationListener onDemandeAutorisationListener;

        public DemandeAutorisViewHolder(@NonNull View itemView, ListDemandeAutorisationAdapter.OnDemandeAutorisationListener onDemandAutoListener) {
            super(itemView);

            heureDebut=itemView.findViewById(R.id.lib);
            heureFin= itemView.findViewById(R.id.sous_nom);
            raison =itemView.findViewById(R.id.sous_nom);

            this.onDemandeAutorisationListener = onDemandAutoListener;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onDemandeAutorisationListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnDemandeAutorisationListener
    {
        void onNoteClick(int position);
    }
}
