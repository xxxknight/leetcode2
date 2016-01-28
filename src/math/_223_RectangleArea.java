package math;

public class _223_RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int area = (D - B) * (C - A) + (H - F) * (G - E); // 两个矩形面积相加减去重合部分
		if (C <= E || D <= F || A >= G || B >= H)
			return area;
		int top = Math.min(D, H);
		int bt = Math.max(B, F);
		int left = Math.max(A, E);
		int right = Math.min(C, G);
		return area - (top - bt) * (right - left);
	}
}
