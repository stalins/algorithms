#include <stdio.h>


void swap(int *a, int *b) {
	int t = *a;
	*a = *b;
	*b = t;

}
int duplicate(int a[], int length) {

	int i = 0;
	while (i < length)
	{		
		if (a[i] == i) {
			i++;
			continue;
		}
		if (a[i] == a[a[i]])
			return a[i];

		swap(&a[i], &a[a[i]]);
	}

	return -1;
}

int main() {

	int a[] = {3, 1, 2, 0, 2, 5, 3};	
	printf("%d\n", duplicate(a, 7));
	for (int i = 0; i < 7; ++i)
	{
		printf("%d ", a[i]);
	}
	return 0;
}