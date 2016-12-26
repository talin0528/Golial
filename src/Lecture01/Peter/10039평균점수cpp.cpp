#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	int totalValue = 0;
	for(int i = 0; i < 5 ; i++){
		int inputValue; cin >> inputValue;
		totalValue += inputValue >= 40 ? inputValue : 40;
	}
	cout << totalValue / 5 << '\n';
	return 0;
}