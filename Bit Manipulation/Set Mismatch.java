import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int found=0;
		int[] arr=new int[n];
		int xor=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    xor^=arr[i];}
		for(int i=1;i<=n;i++){
		    xor^=i;}
		int mask=xor&(-xor);
		int x=0,y=0;
		for(int i=0;i<n;i++){
		    if((arr[i]&mask)!=0) x^=arr[i];
		    else y^=arr[i];}
		for(int i=1;i<=n;i++){
		    if((i&mask)!=0) x^=i;
		    else y^=i;}
		for(int i=0;i<n;i++){
		    if(x==arr[i])  found=1;}
		if(found==1) System.out.println("Missing = "+x+" Duplicate = "+y);
		else System.out.println("Duplicate = "+y+" Missing = "+x);}}
