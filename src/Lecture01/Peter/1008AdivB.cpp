#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	double a,b;
	cin >> a >> b;
	printf("%.10lf",a/b);
	return 0;
}

#if 0
int main(){
	int a,b;
	cin >> a >> b;
	int divCount = 0;
	if(a == b)
		cout << 1 << endl;
	else{
		if(a > b){
			cout << a/b;
			a -= b;
		}else{
			cout << '0';
		}
		cout << '.';
		while(divCount < 14 && a != 0){
			a *= 10;
			cout << a / b;
			a %= b;
			divCount++;
		}
		cout << endl;
	}
	return 0;
}
#endif