#include <iostream>
#include <stdio.h>
using namespace std;
int choicedCount[10005] = {0,};
void recurFunc(int n){

	choicedCount[n]++;
	if(choicedCount[n] >= 2)
		return;
	else{
		int nextValue = n;
		if(nextValue < 10)
			nextValue *= 2;
		else{
			int totalSum = 0;
			int saveSum = nextValue;
			while(saveSum){
				totalSum += saveSum % 10;
				saveSum /= 10;
			}
			nextValue += totalSum;
		}
		if(nextValue > 10000)
			return;
		recurFunc(nextValue);
	}
}
int main(){

	for(int i = 1 ; i <= 10000; i++)
		recurFunc(i);

	for(int i = 1; i <= 10000; i++){
		if(choicedCount[i] == 1)
			cout << i <<'\n';
	}

	return 0;
}