/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author ADMIN
 */
public class MathUltility {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
            // lam bo thu vien fake giong that
    //math.pi.abs().sqrt().pow(a,b) a^b
    //pham la thu vien thi se sai static khi khong can luu info cho rieng minh
    // con thu vien ma van can luu info rieng thi van nen static nhu thuong.
    
    public static final double PI = 3.1415;
    //tien ich tinh giai thua n! = 1.2.3....n
    // n la phai tu 0 tro len
    //0!=1!=1
    //am giai thua vo nghia
    //giai thua tang cuc nhanh, 21! long khong chua duoc
    //bai nay minh se chan giai thua tu 0...20
    //am hoac 21 chu ko them tinh
//    public static long getFactorial(int n){
//        if(n < 0||n>20)
//            throw new IllegalArgumentException("n must be between 0...20");
//        if(n==0 || n==1)
//            return 1; //dac biet, return luon
//        //dua nao viet else o day la tru diem
//        //mac nhien cpu den duoc day la hieu rang n=2..20
//        long result =1;
//        for(int i = 2; i<=n; i++){
//            result *=i;
//        }
//        
//        
//        
//        return result;
//viet bang đệ quy cho PRO
         
    public static long getFactorial(int n){
        if(n < 0||n>20)
            throw new IllegalArgumentException("n must be betwwen 0..20");
        if(n ==0||n==1)
            return 1; // điều kiện dừng
        return n*getFactorial(n-1); //de quy
        //goi lai chinh ham cua minh voi 1 quy mo khac, n-1
        //di mai se ve 1
    }
    
   
    
    
}

