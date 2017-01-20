#include <stdio.h>
#include <limits.h>
int dp[5][3] = {-1};

int min(int a, int b) {

	return a<b?a:b;
}

/*

	amt = Change required for the amount
	coins = Array of denomination
	index = last index of the coin array
	n = coins count; initially it will be 0
		this actualy counts the depth of the recursion tree, 
		less depth is less coin used to provide change

*/
int coin(int amt, int coins[], int index, int n) {


	if (amt == 0) 
			return n;

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