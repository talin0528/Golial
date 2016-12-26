#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <memory.h>
using namespace std;

int main(){
	char inputStr[1000] = {0,};
	int value = 0;
	int idx = 0;
	while((value = getchar()) != EOF ){
		if(value == '\n'){
			cout << inputStr << endl;
			idx = 0;
			memset(inputStr,0,1000);
		}else{
			inputStr[idx++] = value;
		}
	}
	return 0;
}