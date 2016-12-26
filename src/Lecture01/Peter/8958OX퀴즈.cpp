#include <iostream>
#include <string>
using namespace std;
int main(){
	int nCase;
	cin >> nCase;
	while(nCase--){
		char inputArr[100] = {0,};
		int totalScore = 0;
		int subScore = 0;
		int searchIndex = 0;
		cin >> inputArr;
		while(true){
			if(inputArr[searchIndex] == 0)
				break;
			
			if(inputArr[searchIndex] == 'O'){
				//O
				int nextIndex = searchIndex;
				while(inputArr[nextIndex] != 'X' && inputArr[nextIndex] != 0){
					subScore++;
					totalScore += subScore;
					nextIndex++;
				}
				searchIndex = nextIndex;
				subScore = 0;
			}else{
				//X
				searchIndex++;
			}
		}
		cout << totalScore << '\n';
	}
	return 0;
}