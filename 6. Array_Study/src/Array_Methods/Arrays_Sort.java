package Array_Methods;

import java.util.Arrays;

public class Arrays_Sort {

	public static void main(String[] args) {
	
			int money[]=new int[6];
				
				money[0]=50;
				money[1]=20;
				money[2]=10;
				money[3]=40;
				money[4]=30;
				money[5]=60;
				
				Arrays.sort(money);
				
				System.out.println("Sorted array");
				for (int i=0;i<money.length;i++)
				{
					System.out.println(money[i]);
				}
				System.out.println("Descending order");
				for (int i=money.length-1;i>=0;i--)
				{
					System.out.println(money[i]);
				}
				
			}


			}

	


