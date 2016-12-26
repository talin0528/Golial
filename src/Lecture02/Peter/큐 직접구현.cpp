#include <iostream>
using namespace std;

template<typename T>
class my_Node{
public:
	typedef T value_type;
	typedef T* pointer_value_type;
	typedef my_Node<T> node_type;
	typedef my_Node<T>* pointer_node_type;
	my_Node() : prevNode(NULL),nextNode(NULL){}
	my_Node(value_type newValue) : value(newValue), prevNode(NULL),nextNode(NULL){}

	value_type value;
	pointer_node_type nextNode;
	pointer_node_type prevNode;
};


template<typename T>
class my_queue{
public:
	typedef T value_type;
	typedef T* pointer_value_type;
	typedef my_Node<T> node_type;
	typedef my_Node<T>* pointer_node_type;
	typedef my_queue<T> this_type;
	typedef my_queue<T>* pointer_this_type;

	my_queue() : head(NULL),tail(NULL),sz(0){}

	pointer_node_type head;
	pointer_node_type tail;
	size_t sz;

	void push(value_type push_value){
		pointer_node_type newNode = new node_type(push_value);
		if(sz == 0)
			head = tail = newNode;
		else if(sz == 1){
			tail = newNode;
			head->nextNode = tail;
			tail->prevNode = head;
		}else{
			tail->nextNode = newNode;
			newNode->prevNode = tail;
			tail = newNode;
		}
		sz++;
	}

	void pop(){
		pointer_node_type deleteValue = NULL;
		if(sz == 0)
			return;
		else if(sz == 1){
			deleteValue = head;
			head = tail = NULL;
		}else{
			deleteValue = head;
			head->nextNode->prevNode = NULL;
			head = head->nextNode;
		}
		sz--;
		delete deleteValue;
	}

	value_type front(){
		return head->value;
	}

	value_type back(){
		return tail->value;
	}

	bool empty(){ return sz == 0; }
	size_t size() {return sz;}
};

int main(){
	int nCase;
	cin >> nCase;
	my_queue<int> q;
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