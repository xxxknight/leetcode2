package math;

import java.util.Arrays;

/**
 * ����һ����־�����ʶ�Ƿ�������
 * @author founder
 *
 */
public class _204_CountPrimes {
	public int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		Arrays.fill(notPrime, false);		//��ʼĬ�Ͼ�Ϊ������
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i]) {				//������������ͼ���
				continue;
			}
			cnt++;							//����������ͼ�һ
			for (int j = i; j < n; j += i) {
				notPrime[j] = true;			//���������ı���ȫ����Ϊtrue
			}
		}
		return cnt;
	}

}
