package mypackage;
import java.util.Scanner;
import java.io.*;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.*;

public class QrCodeCreater {
	public static void main(String []args){
		try{
		System.out.println("Enter The Url whose you want to create QR code :");
		Scanner sc = new Scanner(System.in);
		String url;
		url = sc.nextLine();
		//String url = "http://www.thenewboston.com";
		ByteArrayOutputStream bout = QRCode.from(url).to(ImageType.JPG).stream();
		File nf= new File("C:\\Users\\Lenovo\\Desktop\\myqrcode.jpg");
		FileOutputStream fout = new FileOutputStream(nf);
		fout.write(bout.toByteArray());
		fout.flush();
		System.out.println("QRCode generated to 'C:\\Users\\Lenovo\\Desktop\\myqrcode.jpg'");
		}
		catch(Exception e){
			System.out.println("Exception Occured : "+e);
		}
	}
}
