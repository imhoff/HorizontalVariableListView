package it.sephiroth.android.library.util;

public class SparseBooleanArrayUtils {
	/**
	 * Threadsafe clone for backward compatibility as
	 * {@link SparseBooleanArray#clone()} is supported first in 4.x APIs
	 * 
	 * @param orginal
	 * @return a clone
	 */
	public static SparseBooleanArray clone(final SparseBooleanArray orginal) {
		final SparseBooleanArray clone = new SparseBooleanArray();

		synchronized (orginal) {
			final int size = orginal.size();
			for (int i = 0; i < size; i++) {
				clone.put(i, orginal.get(i));
			}
		}

		return clone;
	}
}
