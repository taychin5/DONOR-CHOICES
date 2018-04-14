package com.example.test_chat_app_two.activities.homePage.fragment_home;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.ChoosenActivity;
import com.example.test_chat_app_two.activities.homePage.Home_activity;
import com.example.test_chat_app_two.helper.RecyclerItemClickListener;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    ViewPager viewPager;
    ViewPager viewPager2;
    ScrollView sv;
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private RecyclerView itemContainer;
    private RecyclerView itemContainer2;
    private RecyclerView itemContainer3;


    private HomeFragmentRecyclerViewAdapter adapter;
    private HomeFragmentRecyclerViewAdapter2 adapter2;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.LayoutManager layoutManager2;


    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Context context = getActivity();

        int image_list[] = {R.drawable.template, R.drawable.template, R.drawable.template,R.drawable.template, R.drawable.template, R.drawable.template};
        itemContainer = (RecyclerView) view.findViewById(R.id.recyclerView);
        itemContainer.addOnItemTouchListener(new RecyclerItemClickListener(
                context, itemContainer, new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity(), "click" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ChoosenActivity.class);
                intent.putExtra("chooseTitle", Home_activity.mainStoryList.get(position).getStoryTitle());
                intent.putExtra("choosePosition", position);
                intent.putExtra("charityName",Home_activity.mainStoryList.get(position).getCharity());
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getActivity(), "LongClick", Toast.LENGTH_SHORT).show();
            }
        }));


        layoutManager = new GridLayoutManager(context,2);
        itemContainer.setLayoutManager(layoutManager);

        adapter = new HomeFragmentRecyclerViewAdapter(getActivity(), image_list);
        itemContainer.setAdapter(adapter);


        itemContainer3 = (RecyclerView) view.findViewById(R.id.recylerView3);
        layoutManager2 = new LinearLayoutManager(getActivity());
        itemContainer3.setLayoutManager(layoutManager2);

        adapter2 = new HomeFragmentRecyclerViewAdapter2(getActivity());
        itemContainer3.setAdapter(adapter2);





        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(context);
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);

        viewPager.setAdapter(viewPagerAdapter);
        indicator.setViewPager(viewPager);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);


        viewPager2 = (ViewPager) view.findViewById(R.id.viewPager2);
        viewPager2.setClipToPadding(false);
        viewPager2.setPadding(dpToPx(20),0,dpToPx(38),0);
        viewPager2.setPageMargin(dpToPx(4));
        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                System.out.println(position);
//                if(position==0){
//                    viewPager2.setPageMargin(dpToPx(4));
//                    viewPager2.setPadding(dpToPx(0),0,dpToPx(44),0);
//                }else{
//                    viewPager2.setPageMargin(dpToPx(10));
//                    viewPager2.setPadding(dpToPx(16),0,dpToPx(38),0);
//                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ViewPagerAdapter2 viewPagerAdapter2 = new ViewPagerAdapter2(context);
        viewPager2.setAdapter(viewPagerAdapter2);

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

    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public class MyTimerTask extends TimerTask {


        @Override
        public void run() {
            if(getActivity()==null)return;

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }else if(viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }else{
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}



class HomeFragmentRecyclerViewAdapter extends RecyclerView.Adapter<HomeFragmentRecyclerViewAdapter.HomeFragmentRecyclerViewHolder> {

    int image_list[];
    Context context;

    public HomeFragmentRecyclerViewAdapter(Context context, int[] image_list) {
        super();
        this.context = context;
        this.image_list = image_list;
    }

    @Override
    public HomeFragmentRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        itemView = inflater.inflate(R.layout.list_chose1, parent, false);
        return new HomeFragmentRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomeFragmentRecyclerViewHolder holder, int position) {
        holder.image_view_screen_item.setImageResource(Home_activity.mainStoryList.get(position).getMainImage());
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class HomeFragmentRecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView image_view_screen_item;

        public HomeFragmentRecyclerViewHolder(View itemView) {
            super(itemView);
            image_view_screen_item = (ImageView) itemView.findViewById(R.id.mainImage);
        }
    }
}

class HomeFragmentRecyclerViewAdapter2 extends RecyclerView.Adapter<HomeFragmentRecyclerViewAdapter2.HomeFragmentRecyclerViewHolder2>{

    Context context;
    int images[] ={R.drawable.a2,R.drawable.a2,R.drawable.a2,R.drawable.a2,R.drawable.a2,};

    public HomeFragmentRecyclerViewAdapter2(Context context) {
        super();
        this.context = context;
    }



    @Override
    public HomeFragmentRecyclerViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        itemView = inflater.inflate(R.layout.list_chose3, parent, false);
        return new HomeFragmentRecyclerViewAdapter2.HomeFragmentRecyclerViewHolder2(itemView);
    }

    @Override
    public void onBindViewHolder(HomeFragmentRecyclerViewHolder2 holder, int position) {
        holder.mainImg.setImageResource(images[position]);
        int positiontxt = position+1;
        holder.posNum.setText(""+positiontxt);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class HomeFragmentRecyclerViewHolder2 extends RecyclerView.ViewHolder {

        ImageView mainImg;
        TextView posNum;

        public HomeFragmentRecyclerViewHolder2(View itemView) {
            super(itemView);
            mainImg = (ImageView) itemView.findViewById(R.id.mainImage);
            posNum = (TextView) itemView.findViewById(R.id.positiontxt);
        }
    }
}

class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.banner, R.drawable.banner,R.drawable.banner};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_photo, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }



}

class ViewPagerAdapter2 extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.a1, R.drawable.a2,R.drawable.a3};

    public ViewPagerAdapter2(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container,final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_news, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChoosenActivity.class);
                intent.putExtra("chooseTitle", Home_activity.mainStoryList.get(position).getStoryTitle());
                intent.putExtra("choosePosition", position);
                intent.putExtra("charityName",Home_activity.mainStoryList.get(position).getCharity());
                context.startActivity(intent);
            }
        });
        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}

