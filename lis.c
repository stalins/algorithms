#include <stdio.h>
#include <stdlib.h>

void lis(int arr[], int lenght) {

	int *lengthArr = (int *)malloc(sizeof(int)*lenght);
	int i = 0, j = 1, lis_length = 0;

	for (int i = 0; i < lenght; ++i) {
		lengthArr[i] = 1;		
	}

	while(j < lenght) {

		for (int i = 0; i < j; ++i) {		

			if (arr[j] > arr[i]) {

				lengthArr[j] =  lengthArr[j] > lengthArr[i] + 1?lengthArr[j]:lengthArr[i] + 1;				
			}		
		}

		j++;
	}


	for (int i = 0; i < lenght; ++i)
	 	{
	 		printf("%d ", lengthArr[i]);
	 	} 	
}

int main() {

	int arr[] = {5, 6, 2, 7, 9, 4, 1};
	lis(arr, 7);
}

