package com.dashengz.bestnote;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * RecyclerView Adapter for Notes
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    private ArrayList<Note> mDataset;

    public NoteAdapter(ArrayList<Note> dataset) {
        mDataset = dataset;
    }

    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View frame = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list_item, parent, false);
        return new ViewHolder(frame);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.vBody.setText(mDataset.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView vBody;

        ViewHolder(View item) {
            super(item);
            vBody = (TextView) item.findViewById(R.id.body);
        }
    }
}
