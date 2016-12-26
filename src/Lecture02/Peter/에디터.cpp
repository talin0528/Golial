#include <iostream>
#include <list>
using namespace std;
int main(){
	list<char> lst;
	char inputArr[100005] = {0,};
	cin >> inputArr;
	for(int i = 0 ; inputArr[i] ; i++)
		lst.push_back(inputArr[i]);
	int cursorPos = lst.size();
	int cmdCount = 0;
	cin >> cmdCount;
	
	list<char>::iterator it = lst.end();
	while(cmdCount--){
		char cmd,value;
		cin >> cmd;
		switch(cmd){
		case 'L':
			if(cursorPos > 0){
				cursorPos--;
				it--;
			}
			break;
		case 'D':
			if(cursorPos < lst.size()){
				cursorPos++;
				it++;
			}
			break;
		case 'B':
			if(cursorPos > 0){
				it--;
				it = lst.erase(it);
				cursorPos--;
			}
			break;
		case 'P':
			cin >> value;
			lst.insert(it,value);
			cursorPos++;
			break;
		}
	}
	for(it = lst.begin(); it != lst.end(); it++)
		cout << *it;
	cout << '\n';
	return 0;
}

#if 0
template<typename T>
class my_Node{
public:
	typedef T value_type;
	typedef T* pointer_value_type;
	typedef my_Node<T> node_type;
	typedef my_Node<T>* pointer_node_type;

	explicit my_Node(pointer_value_type newValue) : value(*newValue){}

	value_type value;
	pointer_node_type nextNode;
	pointer_node_type prevNode;
};


template<typename T>
class my_List{
public:
	typedef T value_type;
	typedef T* pointer_value_type;
	typedef my_Node<T> node_type;
	typedef my_Node<T>* pointer_node_type;
	typedef my_List<T> this_type;
	typedef my_List<T>* pointer_this_type;

	explicit my_List() : head(NULL),tail(NULL),sz(0){}

	pointer_node_type head;
	pointer_node_type tail;
	size_t sz;

	size_t size() { return sz; }
	
	void push_back(pointer_value_type push_value){
		pointer_node_type newNode = new my_Node(&push_value);
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
};
#endif
