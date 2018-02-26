package com.example.test_chat_app_two;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Toddy on 24/02/2018.
 */

class ChatAdapter extends BaseAdapter {

    private final List<ChatMessage> chatMessages;

    private Activity context;

    public ChatAdapter(Activity context, List<ChatMessage> chatMessages) {
        this.context = context;
        this.chatMessages = chatMessages;
    }

    @Override
    public int getCount() {
        if (chatMessages != null) {
            return chatMessages.size();
        } else {
            return 0;
        }
    }

    @Override
    public ChatMessage getItem(int position) {
        if (chatMessages != null) {
            return chatMessages.get(position);
        } else {
            return null;
        }
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        ChatMessage chatMessage = getItem(position);
        int finalPosition = chatMessages.size()-1;

        boolean myMsg = chatMessage.getIsme();
        System.out.println("position : "+position+"  SIde : "+myMsg);
        int layoutResource = 0;

      //  if(!chatMessage.isDone()) {


            if (myMsg) {
                layoutResource = R.layout.left_chat;
            } else {
                layoutResource = R.layout.right_chat;
            }

            if (convertView == null) {
                convertView = inflater.inflate(layoutResource, parent,false);
                holder = createViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }  // set recycle view


            if (position == finalPosition) {
                final Animation in = new AlphaAnimation(0.0f, 1.0f);
                in.setDuration(500);

                holder.txtMessage.startAnimation(in);
                holder.txtInfo.startAnimation(in);

                holder.txtMessage.setText(chatMessage.getMessage());
                holder.txtInfo.setText(chatMessage.getDate());

                //left side character generatetor
                if (layoutResource == R.layout.left_chat) {
//                holder.characterImage.startAnimation(in);
                    //  holder.characterImage.setImageResource(chatMessage.getCharacter());
                }

            } else {

                holder.txtMessage.setText(chatMessage.getMessage());
                holder.txtInfo.setText(chatMessage.getDate());

                // left side character generatator
                if (layoutResource == R.layout.left_chat) {
                    //   holder.characterImage.setImageResource(chatMessage.getCharacter());
                }
            }
     //   }else{

     //   }


        //to simulate whether it me or other sender
//        setAlignment(holder, myMsg);



        return convertView;
    }

    public void add(ChatMessage message){
        chatMessages.add(message);
    }
    public void add(List<ChatMessage> messages) {
        chatMessages.addAll(messages);
    }

   /* private void setAlignment(ViewHolder holder, boolean myMsg) {
        if(myMsg){
            holder.contentWithBG.setBackgroundResource(R.drawable.bubble_in_9); // set chat back ground

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) holder.contentWithBG.getLayoutParams();
            layoutParams.gravity = Gravity.RIGHT;
            holder.contentWithBG.setLayoutParams(layoutParams);

            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) holder.content.getLayoutParams();
            lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT,0);
            lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            holder.content.setLayoutParams(lp);
            layoutParams = (LinearLayout.LayoutParams) holder.txtMessage.getLayoutParams();
            layoutParams.gravity = Gravity.RIGHT;
            holder.txtMessage.setLayoutParams(layoutParams);

            layoutParams = (LinearLayout.LayoutParams) holder.txtInfo.getLayoutParams();
            layoutParams.gravity = Gravity.RIGHT;
            holder.txtInfo.setLayoutParams(layoutParams);

        }else {
            holder.contentWithBG.setBackgroundResource(R.drawable.bubble_in_9);

            LinearLayout.LayoutParams layoutParams =
                    (LinearLayout.LayoutParams) holder.contentWithBG.getLayoutParams();
            layoutParams.gravity = Gravity.LEFT;
            holder.contentWithBG.setLayoutParams(layoutParams);

            RelativeLayout.LayoutParams lp =
                    (RelativeLayout.LayoutParams) holder.content.getLayoutParams();
            lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
            lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            holder.content.setLayoutParams(lp);
            layoutParams = (LinearLayout.LayoutParams) holder.txtMessage.getLayoutParams();
            layoutParams.gravity = Gravity.LEFT;
            holder.txtMessage.setLayoutParams(layoutParams);

            layoutParams = (LinearLayout.LayoutParams) holder.txtInfo.getLayoutParams();
            layoutParams.gravity = Gravity.LEFT;
            holder.txtInfo.setLayoutParams(layoutParams);
        }
    }*/ // setAlignment

    @Override
    public int getViewTypeCount() {
        // return the total number of view types. this value should never change
        // at runtime. Value 2 is returned because of left and right views.
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        // return a value between 0 and (getViewTypeCount - 1)
        return position % 2;
    }

    private  ViewHolder createViewHolder(View v) {
        ViewHolder holder = new ViewHolder();

        holder.txtMessage = (TextView) v.findViewById(R.id.txtMessage);
        holder.content = (LinearLayout) v.findViewById(R.id.content);
        holder.contentWithBG = (LinearLayout) v.findViewById(R.id.contentWithBackground);
        holder.txtInfo = (TextView) v.findViewById(R.id.txtInfo);
        holder.characterImage = (GifImageView) v.findViewById(R.id.imgCharacter);


        return holder;
    }
    private static class ViewHolder {
        public TextView txtMessage;
        public TextView txtInfo;
        public LinearLayout content;
        public LinearLayout contentWithBG;
        public GifImageView characterImage;
    }

}
