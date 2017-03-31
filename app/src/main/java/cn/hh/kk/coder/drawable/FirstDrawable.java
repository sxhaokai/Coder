package cn.hh.kk.coder.drawable;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

/**
 * Created by dong.wei on 2017/3/28.
 */

public class FirstDrawable extends Drawable {

    ValueAnimator animator = ValueAnimator.ofFloat(0 ,1);

    public FirstDrawable() {
    }

    @Override
    public void draw(Canvas canvas) {

    }
    @Override
    public void setAlpha(int alpha) {

    }
    @Override
    public void setColorFilter(ColorFilter cf) {

    }
    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
    }
}
