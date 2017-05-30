package com.dashengz.bestnote;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 * RecyclerView Adapter for Notes
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    private ArrayList<Note> mDataset;
    private Context mContext;

    public NoteAdapter(ArrayList<Note> dataset, Context context) {
        mDataset = dataset;
        mContext = context;
    }

    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View frame = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list_item, parent, false);
        return new ViewHolder(frame);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String imageUrl = mDataset.get(position).getImageUrl();
        if (!imageUrl.isEmpty()) {
            holder.vImage.setVisibility(View.VISIBLE);
            Picasso
                    .with(mContext)
                    .load(imageUrl)
                    .into(holder.vImage);
        } else holder.vImage.setVisibility(View.GONE);
        holder.vTitle.setText(mDataset.get(position).getTitle());
        holder.vTimeCreated.setText(
                Utils.getFormattedDateTimeWithLocale(
                        Utils.getDateFromMillis(
                                mDataset.get(position).getTimeCreated()
                        ),
                        DateFormat.LONG,
                        DateFormat.SHORT
                )
        );
        holder.vBody.setText(mDataset.get(position).getNote());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatImageView vImage;
        TextView vTitle;
        TextView vTimeCreated;
        TextView vBody;

        ViewHolder(View item) {
            super(item);
            vImage = (AppCompatImageView) item.findViewById(R.id.image);
            vTitle = (TextView) item.findViewById(R.id.title);
            vTimeCreated = (TextView) item.findViewById(R.id.time_created);
            vBody = (TextView) item.findViewById(R.id.body);
        }
    }
}
