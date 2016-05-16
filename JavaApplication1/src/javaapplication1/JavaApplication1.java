package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
    

//Вариант 1
/*
int n=0, i=6;
do {
    System.out.println("v1");
	n++; 
    if (n==i) {
    	break;
    }
}
while(i>n); */

//Вариант 2
/*
int n=0;
for(int i=1;i<=5;i++){
    System.out.println("v2");	n++;
    i=2*n;
};
*/
//Вариант 3

int n=0, i=10;
while(n<i) {
    System.out.println("v3");
	i++;
	n=2+i;
};




    }
}
