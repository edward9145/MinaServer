package net.itrigo.yixing.util;

public class Formula {

	public static float calorie(int stepSum, float stride, float weight) {
		return (float) (stepSum * stride * weight * 6.530 * 0.000001);
	}

	public static float fat(Float calorieSum) {
		if(calorieSum == null) return 0;
		return calorieSum / 9;
	}
	
	public static float distance(int stepSum, float stride){
		return (float)stepSum * stride / 100;
	}

	
}
