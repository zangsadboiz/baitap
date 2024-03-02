import java.util.Scanner;

public class phuong_trinh_bac_nhat {
public static void main(String[] args) {
	/* bai toan bac nhat 1 an
	 * ax + b = 0 ==> tim x
	 * TH1: a = 0
	 * 		neu b = 0 ==> PT vo so nghiem
	 * 		neu b != 0 ==> PT vo nghiem
	 * TH2: a != 0
	 * 		PT co nghiem duy nhat x = -b/a
	 */
	
	double a, b, x;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Nhap so a: ");
	a = sc.nextDouble();
	
	System.out.println("Nhap so b: ");
	b = sc.nextDouble();
	
	if(a == 0) {
		if(b == 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong trinh vo so nghiem");
		}
	} else {
		x = -b/a;
		System.out.println("Phuong trinh co 1 nghiem duy nhat: " + x);
	}
}
}
