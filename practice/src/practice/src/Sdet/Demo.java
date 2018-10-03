package practice.src.Sdet;

public class Demo {

	public static void main(String[] args) {
int space=5/2;
//System.out.println(space);	

int ele=1;
for (int i = 1; i <=5; i++) {
	for (int j = 1; j <= space; j++) {
		System.out.print(" ");
		
	}
	for (int j = 1; j <=ele; j++) {
		if (i%2==0) {
			System.out.println("*");
			
		}else {
		System.out.print("_");
		
	}
	}
	if (i<space) {
		space--;
		//System.out.println(space);	
		ele=ele+2;
		
	}else {
		space++;
		//System.out.println(space);	
		ele=ele-2;
	}
	System.out.println();

}
		
		
		
		
	}

}
