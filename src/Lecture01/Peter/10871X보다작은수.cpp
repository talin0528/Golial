#include <iostream>
#include <stdio.h>
#include <algorithm>
using namespace std;

int main(){
	int nCount,nStandard;
	cin >> nCount >> nStandard;
	for(int i = 0 ; i < nCount ; i++){
		int nInput; cin >> nInput;
		if(nInput < nStandard)
			cout << nInput << ' ';
	}
	cout << '\n';
	return 0;
}