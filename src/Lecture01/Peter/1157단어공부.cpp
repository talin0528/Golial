#include <iostream>
#include <string>

using namespace std;

int main(){
	string inputStr;
	cin >> inputStr;
	int sz = inputStr.size();
	int choicedCount[26] = {0,};
	for(int i = 0 ; i < sz; i++){
		char choicedChar = inputStr.at(i);
		int alphaIndex = choicedChar >= 'a' ? choicedChar - 'a' : choicedChar - 'A';
		choicedCount[alphaIndex]++;
	}
	bool isMultiMax = false;
	int maxIndex = 0;
	int maxValue = 0;
	for(int i = 0 ; i < 26 ;i++){
		if(maxValue < choicedCount[i]){
			maxValue = choicedCount[i];
			maxIndex = i;
			isMultiMax = false;
		}else if(choicedCount[i] == maxValue)
			isMultiMax = true;
	}
	if(isMultiMax)
		cout << "?\n";
	else
		cout << (char)(maxIndex + 'A') << '\n';
	return 0;
}