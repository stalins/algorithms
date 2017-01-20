#include <stdio.h>
#include <limits.h>

int max(int a, int b){
	return a>b?a:b;
}

int min(int a, int b) {
	return a<b?a:b;
}

int ed(int noOfEggs, int floors) {

	printf("%d. %d. \n", noOfEggs, floors);

	if (floors == 1 || floors == 0) return floors;
	if (noOfEggs == 1) return floors;

	int previouseMin = INT_MAX;

	for (int x = 1; x <= floors; ++x)
	{
		int breaks = ed(noOfEggs - 1, x - 1);
		int doesnotBreak = ed(noOfEggs, floors - x);

		printf("doesnotBreak = %d\n", doesnotBreak);

		previouseMin = min(previouseMin, max(breaks, doesnotBreak));				
	}

	return previouseMin + 1;
}

int main() {

	printf("optimal trials = %d\n", ed(2, 10));
}