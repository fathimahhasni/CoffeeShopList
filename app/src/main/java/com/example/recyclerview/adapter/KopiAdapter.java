package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.KopiModel;

import java.util.ArrayList;
import java.util.List;

public class KopiAdapter extends
RecyclerView.Adapter<KopiAdapter.MyViewHolder> {

    List<KopiModel> listItem;

    TextView tvName, tvRating, tvJadwal;
    View view;

    private Context ctx;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onClick(int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mOnItemClickListener = mItemClickListener;
    }

    public KopiAdapter(Context ctx) {
        this.ctx = ctx;
        listItem = new ArrayList<>();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View v) {
            super(v);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_kopi, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        KopiModel item = listItem.get(position);
        tvName = holder.itemView.findViewById(R.id.txt_name_kopi);
        tvJadwal = holder.itemView.findViewById(R.id.txt_jadwal);
        tvRating = holder.itemView.findViewById(R.id.txt_rating);
        tvName.setText(item.getName());
        tvRating.setText(item.getRating());
        tvJadwal.setText(item.getJadwal());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onClick(position);
            }

        });
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public void add(KopiModel item) {
        listItem.add(item);
        notifyItemInserted(listItem.size() + 1);
    }

    public void addAll(List<KopiModel> listItem) {
        for (KopiModel item : listItem) {
            add(item);
        }
    }

    public void removeAll() {
        listItem.clear();
        notifyDataSetChanged();
    }

    public void remove(int pos) {
        listItem.remove(pos);
        notifyDataSetChanged();
    }

    public void swap(List<KopiModel> datas) {
        if (datas == null || datas.size() == 0) listItem.clear();
        if (listItem != null && listItem.size() > 0)
            listItem.clear();
        listItem.addAll(datas);
        notifyDataSetChanged();
    }

    public KopiModel getItem(int pos) {
        return listItem.get(pos);
    }

    public void setFilter(List<KopiModel> list) {
        listItem = new ArrayList<>();
        listItem.addAll(list);
        notifyDataSetChanged();
    }

    public List<KopiModel> getListItem() {
        return listItem;
    }
}



