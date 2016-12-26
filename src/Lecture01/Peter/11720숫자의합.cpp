#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	int nInputCount = 0;
	char pInputArr[104] = {0,};
	cin >> nInputCount >>pInputArr;
	int total = 0;
	for(int i = 0 ; i < nInputCount; i++)
		total += pInputArr[i] - '0';
	cout << total << '\n';
	return 0;
}