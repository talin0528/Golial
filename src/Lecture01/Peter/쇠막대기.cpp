#include <iostream>
using namespace std;
int main(){
	char inputArr[100003] = {0,};
	cin >> inputArr;
	bool isLaserCMD = false;
	int cutCount = 0;
	int depthCount = 0;
	bool firstRBrace = false;
	for(int i = 0 ; inputArr[i] ; i++){
		switch (inputArr[i])
		{
		case '(':
			if( i != 0 && inputArr[i-1] == '(')
				depthCount++;
			break;
		case ')':
			bool doLaser = false;
			if(depthCount > 0 && inputArr[i-1] != ')'){
				cutCount += depthCount;
				doLaser = true;
			}
			if(depthCount > 0 && !doLaser){
				depthCount--;
				cutCount++;
			}
			break;
		}
	}
	cout << cutCount <<'\n';
	return 0;
}