package com.example.text;

// Код на Kotlin

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CounterFragment extends Fragment {

    private TextView tvCounter;
    private int counterValue = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout, container, false);

        tvCounter = view.findViewById(R.id.search_bar_text_view);
        Button btnAdd = view.findViewById(R.id.buttonPlusOne);
        Button btnSubtract = view.findViewById(R.id.buttonMinusOne);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                updateCounter();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue--;
                updateCounter();
            }
        });

        return view;
    }

    private void updateCounter() {
        tvCounter.setText(String.valueOf(counterValue));
    }
}

