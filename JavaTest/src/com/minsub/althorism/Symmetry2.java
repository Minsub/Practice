package com.minsub.althorism;

import java.util.Scanner;

public class Symmetry2 {
		long m10(int m){ // �Լ�m10 : 10�� input�� ���ϱ�
	        long result=1;
	        for(int i=0;i<m;i++) result*=10;
	        return result;
	    }
	    long back(long input){ // �Լ� back : ���ڸ� �Ųٷ�
	    	Symmetry2 h=new Symmetry2();
	        long result=0; 
	        int l=0; //l:length �ڸ���. �ϴ� �ڸ���(l)�� ���Ѵ�
	        for(long m=1; input/m!=0 ; m*=10) l++;
	        if(input==0) l=1;
	        for(int i=0; i<l; i++) result+=((input/h.m10(i))%10)*h.m10(l-1-i);
	        return result;
	    }
	    public static void main(String[] args) {
	    	Symmetry2 h=new Symmetry2();
	        Scanner num=new Scanner(System.in);
	        int n, i, j, l=1, lh=1, n9=0; //l:length �ڸ���, lh:length_half
	        long half=0;
	        boolean check_odd=true; //�ڸ����� Ȧ�������� �ƴ��� ����
	        n=29;
	        long[] arr=new long[n];
	        for(i=0;i<n;i++){
	            if(check_odd){ //�ڸ����� Ȧ�����̸� : half�� ���������ڸ� �����ϰ� �ſ�ó�� �ݺ�
	                arr[i]=half*h.m10(lh-1);
	                arr[i]+=h.back(half/10);
	                half++;
	            }
	            else{ // �ڸ����� ¦�����̸� : half�� �ſ�ó�� �ݺ�
	                arr[i]=half*h.m10(lh);
	                arr[i]+=h.back(half);
	                half++;
			}
			// ���ڰ� 9�θ� �̷���� ���� ���,
			for (n9 = 0, j = 0;
					j < lh && (half / h.m10(j)) % 10 == 9;
					j++)
				n9++;
			
			if (n9 == lh) { // : �ϴ� arr[++i]�� ������ ��, �ڸ��� �ϳ� �ø��� half �缳��
				
				arr[++i] = (check_odd) ? half * h.m10(lh - 1) + (half / 10) : half * h.m10(lh) + half;
				
				check_odd = (!check_odd);
				l++;
				
				if (check_odd)
					lh++;
				
				half = h.m10(lh - 1);
			}
		}
		System.out.println(arr[--i]);
	    }
}
