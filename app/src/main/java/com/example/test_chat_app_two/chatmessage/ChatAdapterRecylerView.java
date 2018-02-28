package com.example.test_chat_app_two.chatmessage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test_chat_app_two.MessageViewHolder;
import com.example.test_chat_app_two.R;

import java.util.List;

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

