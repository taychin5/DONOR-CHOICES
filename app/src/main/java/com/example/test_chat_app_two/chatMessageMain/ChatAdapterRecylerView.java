package com.example.test_chat_app_two.chatMessageMain;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.test_chat_app_two.R;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Toddy on 27/02/2018.
 */



public class ChatAdapterRecylerView extends RecyclerView.Adapter<MessageViewHolder> {

    private static final int MESSAGE_LEFT = 0;
    private static final int MESSAGE_RIGHT = 1;

    private final List<ChatMessage> chatMessages;

    public ChatAdapterRecylerView( List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(final ViewGroup parent,final int viewType) {
        View itemView;

        if (viewType == MESSAGE_LEFT) {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.left_chat, parent, false);
        } else {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.right_chat, parent, false);
        }
        return new MessageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        String message = chatMessages.get(position).getMessage();
        holder.getMessageTextView().setText(message);
    }

    @Override
    public int getItemViewType(int position) {
        boolean isLeftMessage = chatMessages.get(position).getIsme();
        if (isLeftMessage) {
            return MESSAGE_LEFT;
        } else {
            return MESSAGE_RIGHT;
        }
    }

    @Override
    public int getItemCount() {
        return chatMessages.size();
    }

    public void add(ChatMessage message){
        chatMessages.add(message);
    }
}


class MessageViewHolder extends RecyclerView.ViewHolder {

    private TextView txtMessage;
    private TextView txtInfo;
    private LinearLayout content;
    private LinearLayout contentWithBG;
    private GifImageView characterImage;

    public MessageViewHolder(View itemView) {
        super(itemView);
        txtMessage = (TextView) itemView.findViewById(R.id.txtMessage);
        content = (LinearLayout) itemView.findViewById(R.id.content);
        contentWithBG = (LinearLayout) itemView.findViewById(R.id.contentWithBackground);
        txtInfo = (TextView) itemView.findViewById(R.id.txtInfo);
        characterImage = (GifImageView) itemView.findViewById(R.id.imgCharacter);
    }

    public TextView getMessageTextView() {
        return txtMessage;
    }

    public GifImageView getCharacterImage(){
        return  characterImage;
    }
}

