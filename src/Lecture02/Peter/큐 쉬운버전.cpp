#include <iostream>
#include <queue>
using namespace std;

int main(){
	int nCase;
	cin >> nCase;
	queue<int> q;
	while(nCase--){
		char cmd[105] = {0,};
		cin >> cmd;
		switch (cmd[0])
		{
		case 'p':
			{
				if(cmd[1] == 'o'){//pop
					if(q.size() == 0)
						cout << "-1\n";
					else{
						int value = q.front();
						cout << value << "\n";
						q.pop();
					}
				}else{//push
					int insertValue = 0;
					cin >> insertValue;
					q.push(insertValue);
				}
			}
			break;
		case 's':
			cout << q.size() << "\n";
			break;
		case 'e':
			if(q.size() == 0) cout << "1\n";
			else cout << "0\n";
			break;
		case 'f':
			if(q.empty())
				cout << "-1\n";
			else
				cout << q.front() <<"\n";
			break;
		case 'b':
			if(q.empty())
				cout << "-1\n";
			else
				cout << q.back() <<"\n";
			break;
		}

	}
	return 0;
}