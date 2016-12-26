#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	int nCase;
	cin >> nCase;
	for(int i = 0; i < nCase ;i++){
		int nStudent;
		cin >> nStudent;
		int pArrStudent[1003] = {0,};
		double avg = 0;
		int overCount = 0;
		for(int j = 0 ; j < nStudent; j++){
			cin >>pArrStudent[j];
			avg += pArrStudent[j];
		}
		avg /= nStudent;
		for(int j = 0 ; j < nStudent; j++)
			if(pArrStudent[j] > avg)
				overCount++;
		avg = (double)overCount / nStudent * 100;
		printf("%.3f",avg);
		cout << "%\n";
	}
	return 0;
}