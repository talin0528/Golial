#include <iostream>
#include <stdio.h>
#include <string>
using namespace std;
int main(){
	string getLineArr;
	int totalCount = 0;
	getline(cin,getLineArr);
	getLineArr.append("\n");
	int mainIndex = 0;
	int sz = getLineArr.size();
	while(true){
		if(getLineArr[mainIndex] == '\n')
			break;
		else if(getLineArr[mainIndex] == ' ')
			mainIndex++;
		else{
			int subIndex = mainIndex + 1;
			while(getLineArr[subIndex] != ' ' && getLineArr[subIndex] != '\n')
				subIndex++;
			mainIndex = subIndex;
			totalCount++;
		}
	}
	cout << totalCount << '\n';
	return 0;
}