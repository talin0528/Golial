#include <iostream>

using namespace std;

int main(){
	int totalWeight;
	cin >> totalWeight;
	int nBag5KG = totalWeight / 5;
	int nBag3KG = 0;
	if(totalWeight == 3)
		cout << 1 << endl;
	else{
		bool succ = false;
		while(true){
			if(succ || nBag5KG == -1)
				break;
			int remainWeight = totalWeight - 5 * nBag5KG;
			nBag3KG = remainWeight / 3;
			if(remainWeight % 3 == 0)
				succ = true;
			else
				nBag5KG--;
		}
		if(succ)
			cout << nBag5KG + nBag3KG << endl;
		else
			cout << -1 << endl;
	}
	return 0;
}