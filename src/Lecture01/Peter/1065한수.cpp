#include <iostream>
#include <stdio.h>
using namespace std;

bool isHanCount(int arg){
	int diffAmount = -100;
	int prevValue = 0;
	int nextValue = 0;
	while (arg){
		if(arg / 10 == 0)
			break;
		prevValue = arg % 10;
		arg /= 10;
		nextValue = arg % 10;
		if(diffAmount == -100){
			diffAmount = nextValue - prevValue;
		}else{
			int nextDiffAmount = nextValue - prevValue;
			if(nextDiffAmount != diffAmount)
				return false;
		}
	}
	return true;
}

int main(){
	int inputNumber = 0;
	cin >> inputNumber;
	int hanCount = 0;
	if(inputNumber < 100)
		hanCount = inputNumber;
	else{
		int subCount = 0;
		for(int i = 100; i <= inputNumber; i++){
			if(isHanCount(i))
				subCount++;
		}
		hanCount = subCount + 99;
	}
	cout << hanCount << '\n';
	return 0;
}