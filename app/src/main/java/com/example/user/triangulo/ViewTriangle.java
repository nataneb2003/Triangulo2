package com.example.user.triangulo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by User on 07/04/2018.
 */

public class ViewTriangle extends View{

    Triangulo triangle;
    public ViewTriangle(Context context,Triangulo triangle) {
        super(context);
        this.triangle = triangle;
    }

    public ViewTriangle(Context context, @Nullable AttributeSet attrs,Triangulo triangle) {
        super(context, attrs);
        this.triangle = triangle;

    }

    public ViewTriangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr,Triangulo triangle) {
        super(context, attrs, defStyleAttr);
        this.triangle = triangle;

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        float[] points = {100,220,330,440};
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawLines(points,paint);
    }
}
