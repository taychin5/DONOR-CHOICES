package com.example.test_chat_app_two.activities.homePage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.test_chat_app_two.helper.ItemClickListener;
import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;


/**
 * Created by Toddy on 01/03/2018.
 */

public class ChoseAdapterRecyclerView extends RecyclerView.Adapter<ChoseViewHolder> {

    Context context;
    int image_list[];

    public ChoseAdapterRecyclerView(int[] image_list,Context context) {
        super();
        this.image_list = image_list;
        this.context = context;
    }

    @Override
    public ChoseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        itemView = inflater.inflate(R.layout.list_chose1,parent,false);
        return new ChoseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChoseViewHolder holder, int position) {
        holder.image_view_screen_item.setImageResource(image_list[position]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {



                    Toast.makeText(context,"Long Click"+position,Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(context, MainChatActivity.class);
                    context.startActivity(intent);
                    Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    public int getItemCount() {
        return image_list.length;
    }
}

class ChoseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

    ImageView image_view_screen_item;
    private CardView cardView;


    private ItemClickListener itemClickListener;

    public ChoseViewHolder(View itemView) {
        super(itemView);
        image_view_screen_item = (ImageView) itemView.findViewById(R.id.mainImage);
        cardView = (CardView) itemView.findViewById(R.id.card_view);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);



    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }

    @Override
    public boolean onLongClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),true);
        return true;
    }
}