package com.example.test_chat_app_two.activities.chatMessageMain;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.test_chat_app_two.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Toddy on 27/02/2018.
 */



public class ChatAdapterRecylerView extends RecyclerView.Adapter<MessageViewHolder> {

    private static final int MESSAGE_RIGHT = 0;
    private static final int MESSAGE_LEFT = 1;
    private static final int MESSAGE_RIGHT_THINK = 2;
    private static final int MESSAGE_RIGHT_HURT = 3;
    private static final int MESSAGE_LEFT_HURT = 4;
    private static final int MESSAGE_Choose = 5;
    private static final int IMAGE =6;
    private static final int CHOOSE = 7;
    private static final int CHOOSE_DONATE = 8;


    private final List<ChatMessage> chatMessages;
    private final int mainImg =-1 ;

    public ChatAdapterRecylerView( List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }


    @Override
    public MessageViewHolder onCreateViewHolder(final ViewGroup parent,final int viewType) {
        View itemView;


        // Select Layout of message type
        switch (viewType) {
            case MESSAGE_RIGHT:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.right_chat, parent, false);

                break;

            case MESSAGE_LEFT:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.left_chat, parent, false);
                break;

            case MESSAGE_RIGHT_THINK:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.mid_chat, parent, false);
                break;
            case MESSAGE_RIGHT_HURT:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.right_chat, parent, false);
                break;
            case MESSAGE_Choose:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.mid_chat, parent, false);
                break;
            case IMAGE :
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.image_chat, parent, false);
                break;
            case CHOOSE :
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.chat_choose, parent, false);
                break;
            case CHOOSE_DONATE :
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.chat_choose, parent, false);
                break;
            default:itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.left_chat, parent, false);

        }

        return new MessageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        int pos =getItemViewType(position);
        if(pos != IMAGE) {
            String message = chatMessages.get(position).getMessage();
            holder.getMessageTextView().setText(message);
        }
        if(pos==MESSAGE_RIGHT || pos==MESSAGE_LEFT){
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
            String format = sdf.format(Calendar.getInstance().getTime());
        holder.txtInfo.setText(format);
        }
        if(pos==IMAGE || pos == MESSAGE_LEFT){
            holder.getCharacterImage().setImageResource(chatMessages.get(position).getCharacterimg());
        }


    }

    @Override
    public int getItemViewType(int position) {
        int isMeMessage = chatMessages.get(position).getIsme();
        return isMeMessage;
    }

    @Override
    public int getItemCount() {
        return chatMessages.size();
    }

    public void add(ChatMessage message){
        chatMessages.add(message);
    }
    public int addImg(int mainImg){return mainImg;}
}


class MessageViewHolder extends RecyclerView.ViewHolder {

    private TextView txtMessage;
    TextView txtInfo;
    private LinearLayout content;
    private LinearLayout contentWithBG;
    private GifImageView characterImage;


    public MessageViewHolder(View itemView) {
        super(itemView);
        txtMessage = (TextView) itemView.findViewById(R.id.txtMessage);
        txtInfo = (TextView) itemView.findViewById(R.id.txtInfo);
        characterImage = (GifImageView) itemView.findViewById(R.id.imgCharacter);

        //Typeface type = Typeface.createFromAsset(itemView.getContext().getAssets(),"fonts/2005_iannnnnAMD.ttf");
        //this.txtMessage.setTypeface(type);

    }

    public TextView getMessageTextView() {
        return txtMessage;
    }

    public GifImageView getCharacterImage(){
        return  characterImage;
    }


}

