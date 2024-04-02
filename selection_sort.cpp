#include <iostream>
using namespace std;
void sort(int arr[],int n){
    int min=0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
       for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
       }
}
int main(){
    int n;
    cout<<"enter the size of the array: ";
    cin>>n;
    int arr[100];
    cout<<"enter the array elements: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr,n);
    return 0;

}
