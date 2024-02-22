#include <bits/stdc++.h>
using namespace std;
//nhap mang
void nhap(int A[], int n);
void xuat(int A[], int n);
int Tong(int A[], int n);
float tbcchan(int A[], int n);

int main()
{
	int A[100];
	int n=5;
	nhap(A,n);
	xuat(A,n);
	Tong(A,n);
	
}
void nhap(int A[], int n){
	for(int i=0; i<n;i++){
		cout<<"A[i]= ";
		cin>>A[i];
	}
}
void xuat(int A[], int n){
	for(int i=0; i<n;i++){
		cout<<A[i];
		
	}
}
int Tong(int A[], int n){
	nhap(A,n);
	xuat(A,n);
	int sum=0;
	for(int i=0; i<n;i++){
		sum+=A[i]; 
	}
	cout<<sum;
}
/*float tbcchan(int A[], int n){
	for(i=0;i,n<n;i++){
		 if(a[i]%2==0)
		 s
	}
}*/


	
