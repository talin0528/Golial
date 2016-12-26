#include <iostream>
#include <stdio.h>
using namespace std;

void printDay(int day){
	switch (day)
	{
	case 0:
		cout << "SUN\n"; 
		break;
	case 1:
		cout << "MON\n"; 
		break;
	case 2:
		cout << "TUE\n"; 
		break;
	case 3:
		cout << "WED\n"; 
		break;
	case 4:
		cout << "THU\n"; 
		break;
	case 5:
		cout << "FRI\n"; 
		break;
	case 6:
		cout << "SAT\n"; 
		break;	
	}


}

int main(){
	int totalValue = 0;
	int month,day;
	int addValue[] = {
		31,//1
		28,//2
		31,//3
		30,//4
		31,//5
		30,//6
		31,//7
		31,//8
		30,//9
		31,//10
		30,//11
	};
	cin >> month >> day;
	for(int i = 1 ; i < month; i++)
		totalValue += addValue[i-1];
	
	totalValue += day;
	printDay(totalValue % 7);
	return 0;
}


