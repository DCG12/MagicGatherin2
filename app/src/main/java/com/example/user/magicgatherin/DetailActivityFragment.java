package com.example.user.magicgatherin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

                        Intent i = getActivity().getIntent();

                        if (i != null) {
                        Card card = (Card) i.getSerializableExtra("card");

                                if (card != null) {
                                updateUi(card);
                            }
                    }

                        return view;
            }

                private void updateUi(Card card) {
                Log.d("CARD", card.toString());
    }
}

