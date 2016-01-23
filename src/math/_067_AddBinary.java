package math;

public class _067_AddBinary {
	public String addBinary(String a, String b) {
		String result = "";
		int aNum = a.length() - 1;
		int bNum = b.length() - 1;
		int flag = 0;
		while (aNum >= 0 && bNum >= 0) {
			int sum = (int) (a.charAt(aNum) - '0')
					+ (int) (b.charAt(bNum) - '0') + flag;
			result = String.valueOf(sum % 2) + result;
			flag = sum / 2;
			aNum--;
			bNum--;
		}
		while (aNum >= 0) {
			int sum = (int) (a.charAt(aNum) - '0') + flag;
			result = String.valueOf(sum % 2) + result;
			flag = sum / 2;
			aNum--;
		}
		while (bNum >= 0) {
			int sum = (int) (b.charAt(bNum) - '0') + flag;
			result = String.valueOf(sum % 2) + result;
			flag = sum / 2;
			bNum--;
		}
		if (flag == 1) {
			result = "1" + result;
		}
		return result;
	}

}
