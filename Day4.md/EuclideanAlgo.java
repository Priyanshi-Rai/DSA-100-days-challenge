// SIMPLE VERSION OF EUCLIDEAN ALGORITHM

int gcd(int a , int b){
  while(a!=b){
    if(a>b){
      a=a-b;
    }
    else{
      b=b-a;
    }  
  }
  return a;
}

// OPTIMISED EUCLIDEAN ALGO
int gcd(int a, int b){
  if(b==0)
    return a;
  else
    return gcd(b, a%b);
}
//first call is always swappping
// Time complexity O(log(min(a,b)))
