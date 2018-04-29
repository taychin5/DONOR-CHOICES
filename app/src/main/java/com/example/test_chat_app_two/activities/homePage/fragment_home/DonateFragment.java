package com.example.test_chat_app_two.activities.homePage.fragment_home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.value_class.DonateList;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DonateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DonateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonateFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static ArrayList<DonateList> donateListArrayList = new ArrayList<DonateList>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    // TODO: Rename and change types and number of parameters
    private RecyclerView donateContainer;
    private RecyclerView.LayoutManager layoutManager;
    private DonateFragmentRecyclerViewAdapter adapter;

    public DonateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonateFragment.
     */
    // TODO: Rename and change types and number of parameters

    public static DonateFragment newInstance(String param1, String param2) {
        DonateFragment fragment = new DonateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donate, container, false);
        Context context = getActivity();


        donateContainer = (RecyclerView) view.findViewById(R.id.recyclerView);
        donateContainer.setHasFixedSize(true);
        donateContainer.setSelected(true);

        layoutManager = new LinearLayoutManager(getActivity());
        donateContainer.setLayoutManager(layoutManager);

        //load dummy history


        SearchView searchView = (SearchView) view.findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }
        });


        System.out.println("test  " + donateListArrayList.size());
        adapter = new DonateFragmentRecyclerViewAdapter(getActivity(), donateListArrayList);
        //adapter.getFilter().filter("hello");
        donateContainer.setAdapter(adapter);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {

        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

class DonateFragmentRecyclerViewAdapter extends RecyclerView.Adapter<DonateFragmentRecyclerViewAdapter.DonateFragmentRecyclerViewHolder>
        implements Filterable {

    Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<DonateList> donateListArrayList;
    private ArrayList<DonateList> mArrayList;

    public DonateFragmentRecyclerViewAdapter(Context context, ArrayList<DonateList> donateListArrayList) {
        this.context = context;
        this.donateListArrayList = donateListArrayList;
        this.mArrayList = donateListArrayList;
    }

    @Override
    public DonateFragmentRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        itemView = inflater.inflate(R.layout.list_chose2, parent, false);
        return new DonateFragmentRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DonateFragmentRecyclerViewHolder holder, int position) {
        holder.textview.setText(donateListArrayList.get(position).getChooseDescription());
        holder.dateTxt.setText(donateListArrayList.get(position).getWhen());
        holder.timeTxt.setText(donateListArrayList.get(position).getTime());


    }

    @Override
    public int getItemCount() {
        return donateListArrayList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    donateListArrayList = mArrayList;
                } else {
                    ArrayList<DonateList> filteredList = new ArrayList<>();

                    for (DonateList androidVersion : mArrayList) {

                        if (androidVersion.getChooseDescription().toLowerCase().contains(charString) /*|| androidVersion.getName().toLowerCase().contains(charString) || androidVersion.getVer().toLowerCase().contains(charString)*/) {

                            filteredList.add(androidVersion);
                        }
                    }

                    donateListArrayList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = donateListArrayList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                donateListArrayList = (ArrayList<DonateList>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }


    class DonateFragmentRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textview;
        TextView dateTxt;
        TextView timeTxt;

        public DonateFragmentRecyclerViewHolder(View itemView) {
            super(itemView);
            textview = (TextView) itemView.findViewById(R.id.Name);
            dateTxt = itemView.findViewById(R.id.Date);
            timeTxt = itemView.findViewById(R.id.Time);

        }
    }

}
