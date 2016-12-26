#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	char inputArr[105] = {0,};
	int firstFindArr[26] = {0,};
	for(int i = 0 ; i < 26 ; i++) firstFindArr[i] = -1;

	cin >> inputArr;
	for(int i = 0 ; inputArr[i] ; i++)
		if(firstFindArr[inputArr[i] - 'a'] == -1)
			firstFindArr[inputArr[i] - 'a'] = i;
	for(int i = 0 ; i < 26 ; i++)
		cout << firstFindArr[i] << ' ';
	cout << '\n';
	return 0;
}