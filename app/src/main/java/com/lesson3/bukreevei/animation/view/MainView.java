package com.lesson3.bukreevei.animation.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.lesson3.bukreevei.animation.R;

public class MainView extends LinearLayout {


    private AnimationPanelView animation_panel;

    public MainView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.main_view, this);
        animation_panel = findViewById(R.id.animation_panel);
        animation_panel.bind();
    }
}
