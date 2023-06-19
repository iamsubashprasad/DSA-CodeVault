package SDET;

public class AddElementInPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; int noToInsert= 8;
		int a[]= {1,2,4,5,6};
		int output[]=new int[a.length+1];
		for(;i<a.length;i++) {
			if(a[i]<noToInsert) {
				output[i]=a[i];
			}
			else {
				output[i]= noToInsert;
				break;
			}
		}
		for(;i<a.length;i++) {
			output[i+1]=a[i];
		}
		for(i=0;i<a.length;i++) {
			System.out.println(output[i]);
		}

	}

}
