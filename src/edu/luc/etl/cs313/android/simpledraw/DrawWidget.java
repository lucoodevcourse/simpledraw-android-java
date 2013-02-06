package edu.luc.etl.cs313.android.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawWidget extends View {

	public DrawWidget(final Context context, final AttributeSet attrs, final int defStyle) {
		this(context);
	}

	public DrawWidget(final Context context, final AttributeSet attrs) {
		this(context);
	}

	public DrawWidget(final Context context) { super(context); }

	@Override protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
		setMeasuredDimension(100, 100);
	}

	private final Paint paint = new Paint();

	@Override protected void onDraw(final Canvas canvas) {
		canvas.drawColor(Color.WHITE);

		canvas.drawLine(33, 0, 33, 100, paint);

		paint.setColor(Color.RED);
		paint.setStrokeWidth(10);
		canvas.drawLine(56, 0, 56, 100, paint);

		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(5);

		for (int y = 30, alpha = 255; alpha > 2; alpha >>= 1, y += 10) {
			paint.setAlpha(alpha);
			canvas.drawLine(0, y, 100, y, paint);
		}
	}
}