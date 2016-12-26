#include <iostream>
using namespace std;

int main(){
	int nInput = 0;
	cin >> nInput;
	int sum = nInput + 1;
	int division = nInput / 2;
	if(nInput & 0x01){
		cout << sum * division + division + 1 << '\n';
	}else{
		cout << sum * division << '\n';
	}
	return 0;
}

#if 0
int main(){
	int nInput = 0;
	cin >> nInput;
	int nTotal = 0;
	for(int i = 1; i <= nInput; i++)
		nTotal += i;
	cout << nTotal << endl;
	return 0;
}
#endif