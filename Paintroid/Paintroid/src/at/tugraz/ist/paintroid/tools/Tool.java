package at.tugraz.ist.paintroid.tools;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.PointF;
import at.tugraz.ist.paintroid.MainActivity.ToolType;

public interface Tool {
	// standard stroke widths in pixels
	public static final int stroke1 = 1;
	public static final int stroke5 = 5;
	public static final int stroke15 = 15;
	public static final int stroke25 = 25;

	public boolean handleDown(PointF coordinate);

	public boolean handleMove(PointF coordinate);

	public boolean handleUp(PointF coordinate);

	public void changePaintColor(int color);

	public void changePaintStrokeWidth(int strokeWidth);

	public void changePaintStrokeCap(Cap cap);

	public void setDrawPaint(Paint paint);

	public Paint getDrawPaint();

	public void draw(Canvas canvas);

	public ToolType getToolType();

	public int getAttributeButtonResource(int buttonNumber);

	public int getAttributeButtonColor(int buttonNumber);

	public void attributeButtonClick(int buttonNumber);

	/**
	 * Called by the drawing thread when the tools effect has been applied to the bitmap. Tools must
	 * use this method to reset their internal state, like rewinding paths.
	 */
	public void onAppliedToBitmap();
}