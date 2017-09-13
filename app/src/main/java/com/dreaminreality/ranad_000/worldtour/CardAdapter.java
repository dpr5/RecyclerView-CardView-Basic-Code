package com.dreaminreality.ranad_000.worldtour;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import com.bumptech.glide.Glide;

/**
 * Created by Ravi Tamada on 18/05/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {


    private Context context;
    private String[] values;
    private String titles[];
    private View view;
    private ViewHolder viewHolder;


    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.cardlayout, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {
        holder.textView.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.card_title);
        }
    }

    public CardAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }
}