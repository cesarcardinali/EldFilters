package org.eldorado.effectclasses;



import android.graphics.Bitmap;

public interface Effect {
	
	/** Applies the effect and returns the resulting bitmap.
	 * 
	 * @param bitmap - Bitmap - The input image.
	 * @return Bitmap - The resulting image, after the effect applied.
	 */
	public Bitmap applyEffect(Bitmap bitmap);
	
	/** Returns the name of the effect.
	 * 
	 * @return String - the name of the effect.
	 */
	public String getName();
	
}
