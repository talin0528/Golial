#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	int nScoreNumber;
	int pScoreArr[1005] = {0,};
	double dEditAvg = 0;
	int nMaxScore = 0;
	cin >> nScoreNumber;
	for(int i = 0 ; i < nScoreNumber; i++){
		cin >> pScoreArr[i];
		if(pScoreArr[i] > nMaxScore)
			nMaxScore = pScoreArr[i];
	}
	for(int i = 0 ; i < nScoreNumber; i++){
		if(pScoreArr[i] <= nMaxScore)
			dEditAvg += (double)pScoreArr[i] / nMaxScore * 100;
	}
	dEditAvg /= nScoreNumber;
	//소수점 구하기
#if 0
	int number = dEditAvg;
	dEditAvg -= number;
	cout << number << '.';
	number = dEditAvg * 1000;
	if(number == 0){
		cout << "00\n";
	}else{
		int onePoint = number % 10;
		if(onePoint >= 5){
			number += 10 - onePoint;
		}else{
			number -= onePoint;
		}
		number /= 10;
		if(number == 0)
			cout << "00\n";
		else
			cout << number << '\n';
	}
#endif
	printf("%.2f\n",dEditAvg);
	return 0;
}