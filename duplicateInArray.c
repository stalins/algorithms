#include <stdio.h>

int duplicate(int a[], int length) {

	int sum = 0;
	for (int i = 0; i < length; ++i)
	{
		sum += a[i];
	}

	int sum1 = (length-1) * (length-2) >> 1;
	printf("%d. %d. \n", sum, sum1);
	return sum - sum1;
}

int main() {

	int a[] = {1,0,3,2,4,2,5};
	printf("duplicate no: %d\n", duplicate(a, 7));
}