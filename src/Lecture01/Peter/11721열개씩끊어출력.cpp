#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	char pInputArr[105] = {0,};
	cin >> pInputArr;
	int nArrIndex = 0;
	int printCount = 0;
	while(pInputArr[nArrIndex]){
		if(printCount == 10){
			printCount = 0;
			cout <<'\n';
		}
		cout << pInputArr[nArrIndex];
		nArrIndex++;
		printCount++;
	}
	cout << '\n';
	return 0;
}