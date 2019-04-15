package com.csd.assignment2attempt3.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.csd.assignment2attempt3.R;
import com.csd.assignment2attempt3.models.ContactItem;

import java.util.List;

public class ContactItemRecyclerViewAdapter extends RecyclerView.Adapter<ContactItemRecyclerViewAdapter.ViewHolder> {
    Context context;
    List<ContactItem> contacts;

    public ContactItemRecyclerViewAdapter(Context context, List<ContactItem> contacts) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contactitem_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ContactItem acontact = contacts.get(i);
        viewHolder.name.setText(acontact.getName());
        viewHolder.number.setText(acontact.getNumber());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        LinearLayout details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.details = itemView.findViewById(R.id.lldetails);
            this.name = itemView.findViewById(R.id.tvname);
            this.number = itemView.findViewById(R.id.tvnumber);
        }
    }
}
