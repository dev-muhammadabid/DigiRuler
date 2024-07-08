package com.example.digiruler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MeasureListAdapter extends RecyclerView.Adapter<MeasureListAdapter.ViewHolder> {

    private List<MeasureItem> measureList;
    private Context context;

    public MeasureListAdapter(List<MeasureItem> measureList, Context context) {
        this.measureList = measureList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.measure_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MeasureItem item = measureList.get(position);
        holder.measureTitle.setText(item.getTitle());

        View.OnClickListener listener = v -> {
            Intent intent = new Intent(context, item.getTargetActivityClass());
            context.startActivity(intent);
        };

        holder.measureTitle.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return measureList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button measureTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            measureTitle = itemView.findViewById(R.id.measure_list_item_button);
        }
    }
}
