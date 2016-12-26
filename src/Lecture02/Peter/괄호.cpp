#include <iostream>
#include <stack>
#include <string>
using namespace std;


int main(){
	int nCase;
	cin >> nCase;
	while(nCase--){
		int depthCount = 0;
		char inputArr[100] = {0,};
		cin >> inputArr;
		bool isVPS = true;
		for(int i = 0 ; inputArr[i] ; i++){
			if(depthCount < 0){
				isVPS = false;
				break;
			}
			switch (inputArr[i])
			{
			case '(':
				depthCount++;
				break;
			case ')':
				depthCount--;
				break;
			}
		}
		if(!isVPS || depthCount != 0)
			cout << "NO\n";
		else
			cout << "YES\n";
	}
	return 0;
}