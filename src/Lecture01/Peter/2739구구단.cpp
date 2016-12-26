#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	int n;
	cin >>n;
	for(int i = 1; i <10; i++){
		char printArr[100] = {0,};
		sprintf(printArr,"%d * %d = %d",n,i,n*i);
		cout << printArr << '\n';
	}
	return 0;
}