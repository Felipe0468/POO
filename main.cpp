#include <iostream>
using namespace std;
int main() {
  //Lea un arreglo de 10 caracteres y devolver si  la palabra palíndroma y la palabra no palíndroma, hasta recibir un arreglo de 10 asteriscos (*)
  char arr [20];
  char arr2 [20];
  
  int contador;
  do{
    bool palindromo=true;
    contador=0;
    for(int i =0;i<10;i++){
      cin>>arr[i];
      if(arr[i]=='*')
        contador++;
    }
    if(contador!=10){
      for(int i =0;i<10;i++)
        arr2[i]=arr[9-i];
      for(int i =0;i<10;i++)
        if(arr[i]!=arr2[i])
          palindromo=false;
      if(palindromo)
        cout<<"Palindromo";
      else
        cout<<"No palindromo";
    }
  }while(contador!=10);
}