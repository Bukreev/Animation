package com.lesson3.bukreevei.animation.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.lesson3.bukreevei.animation.R;
import com.lesson3.bukreevei.animation.databinding.AnimationPanelBinding;

public class AnimationPanelView extends FrameLayout {

    private AnimationPanelBinding binding;
    public AnimationPanelView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.animation_panel,
                this, true);
    }

    public final void bind() {
        binding.setCallback(this);
    }

    public final void onClickButton() {

    }
}
