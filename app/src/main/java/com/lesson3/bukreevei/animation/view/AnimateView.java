package com.lesson3.bukreevei.animation.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;


public class AnimateView extends FrameLayout {

    final private ImageView viewById;

    public AnimateView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.animate_lock);
        viewById = findViewById(R.id.image_animated);
        animateImageView(viewById);
    }

    private void animateImageView(ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = ((Animatable) drawable);
            animatable.start();
        }
    }
}
