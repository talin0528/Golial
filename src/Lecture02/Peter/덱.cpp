#include <iostream>
#include <string.h>
#include <deque>
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
class my_d{
public:
	typedef T value_type;
	typedef T* pointer_value_type;
	typedef my_Node<T> node_type;
	typedef my_Node<T>* pointer_node_type;
	typedef my_d<T> this_type;
	typedef my_d<T>* pointer_this_type;

	my_d() : head(NULL),tail(NULL),sz(0){}

	pointer_node_type head;
	pointer_node_type tail;
	size_t sz;

	void push_back(value_type push_value){
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

	void push_front(value_type push_value){
		pointer_node_type newNode = new node_type(push_value);
		if(sz == 0)
			head = tail = newNode;
		else if(sz == 1){
			head = newNode;
			head->nextNode = tail;
			tail->prevNode = head;
		}else{
			head->prevNode = newNode;
			newNode->nextNode = head;
			head = newNode;
		}
		sz++;
	}

	void pop_back(){
		pointer_node_type deleteValue = NULL;
		if(sz == 0)
			return;
		else if(sz == 1){
			deleteValue = head;
			head = tail = NULL;
		}else{
			deleteValue = tail;
			tail->prevNode->nextNode = NULL;
			tail->prevNode = tail;
		}
		sz--;
		delete deleteValue;
	}

	void pop_front(){
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
	my_d<int> d;
	while(nCase--){
		char cmd[105] = {0,};
		cin >> cmd;
		int insertValue = 0;
		if(strcmp(cmd,"push_back") == 0){
			cin >> insertValue;
			d.push_back(insertValue);
		}else if(strcmp(cmd,"push_front") == 0){
			cin >> insertValue;
			d.push_front(insertValue);
		}else if(strcmp(cmd,"pop_back") == 0){
			if(d.size()){
				cout << d.back() << "\n";
				d.pop_back();
			}else
				cout << "-1\n";
		}else if(strcmp(cmd,"pop_front") == 0){
			if(d.size()){
				cout << d.front() << "\n";
				d.pop_front();
			}else
				cout << "-1\n";
		}else if(strcmp(cmd,"size") == 0){
			cout << d.size() << "\n";
		}else if(strcmp(cmd,"empty") == 0){
			cout << d.empty() << "\n";
		}else if(strcmp(cmd,"front") == 0){
			if(d.size())
				cout << d.front() << "\n";
			else
				cout << "-1\n";
		}else if(strcmp(cmd,"back") == 0){
			if(d.size())
				cout << d.back() << "\n";
			else
				cout << "-1\n";
		}
	}
	return 0;
}