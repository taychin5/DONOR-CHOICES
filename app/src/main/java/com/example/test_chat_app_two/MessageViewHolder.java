package com.example.test_chat_app_two;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Toddy on 27/02/2018.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {

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
