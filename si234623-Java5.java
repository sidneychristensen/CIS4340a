public static int getAbsAdd(int x, int y) {
	assert x != Integer.MIN_VALUE;
	assert y != Integer.MAX_VALUE;
	int absX = Math.abs(x);
	int absY = Math.abs(y);
	assert (absX <= Integer.MAX_VALUE - absY);
	return absX + absY;
}

//Usage: getAbsAdd(Integer.MIN_VALUE, 1);