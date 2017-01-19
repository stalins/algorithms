#include <stdio.h>
#include <limits.h>
int dp[5][3] = {-1};

int min(int a, int b) {

	return a<b?a:b;
}

int pre = INT_MAX;

int coin(int amt, int coins[], int index, int n) {


	if (amt == 0) {

		printf("index = %d,  n = %d\n",index, n);
		return n;
	}

	if (index < 0 || amt < 0) return INT_MAX;

	int l = coin(amt-coins[index],  coins, index, n+1);
	int r = coin(amt, coins, index-1, n);

	int res = min(l, r);


	return res;	
}


int main() {

	int coins [] = {1,2,3};
	int amount = 7;

	printf("%d", coin(amount, coins, 2, 0));
}