import java.util.Scanner;
class StartEnd{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("size: ");
		int n=ob.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=ob.nextInt();
		}
		System.out.print("number: ");
		int x=ob.nextInt();
		System.out.println("Start: "+Startindex(arr,n,x));
		System.out.println("End: "+Endindex(arr,n,x));
	}
	static int Startindex(int a[],int n,int x){
		int l=0;
		int r=n-1;
		int m,s=-1;
		while(l<=r){
			m=l+(r-l)/2;
			System.out.println("m: "+m);
			if(m==0 && a[0]==x)
				return m;
			if(a[m]==x && a[m-1]!=x){
				return m;
			}
			if(a[m]==x && a[m-1]==x){
				r=m-1;
			}
			if(a[m]<x){
				l=m+1;
			}
			else
				r=m-1;
		}
		return s;
	}
	static int Endindex(int a[],int n,int x){
		int l=0;
		int r=n-1;
		int m,s=-1;
		while(l<=r){
			m=l+(r-l)/2;
			System.out.println("m: "+m);
			if(m==n-1 && a[n-1]==x){
				s=m;
				return s;
			}
			if(a[m]==x && a[m+1]!=x){
				s=m;
				return s;
			}
			if(a[m]==x && a[m+1]==x){
				l=m+1;
			}
			if(a[m]<x){
				l=m+1;
			}
			else
				r=m-1;
		}
		return s;
	}
}