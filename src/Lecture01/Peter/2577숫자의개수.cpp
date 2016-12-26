#include <iostream>
using namespace std;
int main(){
	int A,B,C;
	cin >> A >> B >> C;
	A = A*B*C;
	int arr[10] = {0,};
	while(A){
		int oneValue = A % 10;
		arr[oneValue]++;
		A/=10;
	}
	for(int i = 0 ; i < 10 ; i++)
		cout << arr[i] <<'\n';
	return 0;
}