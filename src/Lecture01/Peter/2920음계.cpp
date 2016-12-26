#include <iostream>
using namespace std;
int main(){
	bool isUP = false;
	bool isMixed = false;
	int prevValue = 0;
	for(int i = 0 ; i < 8; i++){
		int inputValue = 0;
		cin >> inputValue;
		if(i == 1){
			if(prevValue > inputValue)
				isUP = false;
			else
				isUP = true;
		}else if(i > 1){
			if(isUP){
				if(prevValue > inputValue){
					isMixed = true;
					break;
				}
			}else{
				if(prevValue < inputValue){
					isMixed = true;
					break;
				}
			}
		}
		prevValue = inputValue;
	}
	if(isMixed)
		cout << "mixed\n";
	else{
		if(isUP)
			cout << "ascending\n";
		else
			cout << "descending\n";
	}
	return 0;
}