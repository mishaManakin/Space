package com.example.space;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class planetAdapter extends RecyclerView.Adapter<planetAdapter.ViewHolder> {


    private final LayoutInflater inflater;
    private final List<planet> planets;


    public planetAdapter(Context context, List<planet> planets) {
        this.inflater = LayoutInflater.from(context);
        this.planets = planets;
    }


    @Override
    public planetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(planetAdapter.ViewHolder holder, int position) {
        planet planet = planets.get(position);
        holder.planetView.setImageResource(planet.getPlanetResource());
        holder.nameView.setText(planet.getName());
        holder.planetDescriptionView.setText(planet.getPlanetDescription());

    }


    @Override
    public int getItemCount() {
        return planets.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView planetView;
        final TextView nameView, planetDescriptionView;


        ViewHolder(View view) {
            super(view);
            planetView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            planetDescriptionView = view.findViewById(R.id.animalDescription);

        }
    }
}