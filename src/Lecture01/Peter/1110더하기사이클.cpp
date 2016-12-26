#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	int nInput;
	cin >> nInput;
	if(nInput < 10)
		nInput *= 10;
	int nCycleCount = 0;
	int saveValue = nInput;
	while(true){
		int nextten = saveValue % 10;

		int nextone = (saveValue / 10 + nextten) % 10;
		

		int nNewCount = nextten * 10 + nextone;
		saveValue = nNewCount;
		nCycleCount++;
		if(nNewCount == nInput)
			break;
	}
	cout << nCycleCount << '\n';
	return 0;
}