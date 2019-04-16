package com.csd.assignment2attempt3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csd.assignment2attempt3.R;
import com.csd.assignment2attempt3.adapters.ContactItemRecyclerViewAdapter;
import com.csd.assignment2attempt3.models.ContactItem;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {
    List<ContactItem> contacts = new ArrayList<>();
    ContactItem nnsp = new ContactItem("N N S Praneeth", "7240XXXXXX");
    ContactItem askc = new ContactItem("A S K Chaitanya", "9985XXXXXX");
    ContactItem nit = new ContactItem("Y Nitheesh", "7240XXXXXX");


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.rvcontact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        contacts.add(nnsp);
        contacts.add(askc);
        contacts.add(nit);
        ContactItemRecyclerViewAdapter adapter = new ContactItemRecyclerViewAdapter(getActivity(), contacts);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}
