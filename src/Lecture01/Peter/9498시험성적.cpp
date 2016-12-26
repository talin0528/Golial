#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	int nScore;
	cin >> nScore;
	if( nScore >= 90)
		cout << "A\n";
	else if( nScore >= 80)
		cout << "B\n";
	else if( nScore >= 70)
		cout << "C\n";
	else if( nScore >= 60)
		cout << "D\n";
	else
		cout << "F\n";
	return 0;
}