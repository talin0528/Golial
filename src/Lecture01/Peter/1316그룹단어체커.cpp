#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	int nCase; cin >> nCase;
	int totalStreamCount = 0;
	while(nCase--){
		char inputArr[105] = {0,};
		bool usedAlphabet[26] = {false,};
		bool isStream = false;
		char prevChar = inputArr[0];
		for(int i = 1; inputArr[i]; i++){
			if(prevChar == inputArr[i]){
				isStream = true;
			}else{
				

			}
		}
	}
	cout << totalStreamCount << '\n';
	return 0;
}