package com.blackjacksmart.reddragon.midtermassessmentapp.recycler;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.blackjacksmart.reddragon.midtermassessmentapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.midtermassessmentapp.MainActivity.dataLiked;
import static com.blackjacksmart.reddragon.midtermassessmentapp.MainActivity.dataProfileBackground;
import static com.blackjacksmart.reddragon.midtermassessmentapp.MainActivity.dataUsername;

/**
 * Created by RedDragon on 12/10/16.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    @Nullable @BindView(R.id.liked_textview) TextView likedTextView;
    @Nullable @BindView(R.id.username_textview) TextView userTextView;
    @Nullable @BindView(R.id.vines_card_view) CardView vinesCardView;

    public ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(int i) {

        if (!dataLiked.get(i).equals(null)) {
            likedTextView.setText(dataLiked.get(i).toString());
        }

        if (!dataUsername.get(i).equals(null)) {
            userTextView.setText(dataUsername.get(i).toString());
        }

        if (!dataProfileBackground.get(i).equals(null)) {
            int stringLength = dataProfileBackground.get(i).toString().length();

            vinesCardView.setCardBackgroundColor(Color.parseColor("#" +
                    dataProfileBackground.get(i).toString().substring(2, stringLength)));
        }else {
            vinesCardView.setCardBackgroundColor(Color.parseColor("#000000"));
        }

    }
}
