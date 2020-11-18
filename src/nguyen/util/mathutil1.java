/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nguyen.util;

import github.MathUltility;

/**
 *
 * @author ADMIN
 */
public class mathutil1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;
        long actual = MathUltility.getFactorial(5);
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
        System.out.println("6!: 720, actual: " + MathUltility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUltility.getFactorial(0));
        //muon nem ra ngoai le
        //illigalArgumentExeption 
        //tham so >20, tham so <0
        System.out.println("expected: IlligalArgumentException" + MathUltility.getFactorial(-5));
        System.out.println("i want to see the red or green");
    }
  //Minh muon ket luan ham ngon, minh phai test het cac truong hop xai ham
    //truong hop 5! )! -5! 21! 20! ... 
    // minh phai thiet ke cac test case, tinh huong test de sau do minh verify 
    //giua gia tri tra ve cua ham(actual) co khop voi expected cai minh du doan 
    //ham chay phai tra ve
    //va neu moi thu khop, tuc la actual == expected, minh moi dam gay: Ham ngon
    //cach nay co nhuoc diem: nhin bang mat va so sanh ket qua cua tung cae
    // tinh huong test 
    //cach nay on~ nhung tim an sai sot do nhin bang mat nhieu tinh huong
    // CACH NANG CAO
    // cung nhin bang mat nhung chi nhin 2 mau xanh - do cho moi test case
    //co nghia: neu ban xai ham voi 100 tham so, chay ham voi 100 tinh huong khac nhau. ban chir can nhin duy nhat 2 mau xanh va do
    //xanh code on cho moi test case, moi tinh huong goi ham
    // MOI CASE PHAI CO EXPECTED = ACTUAL thi moi xanh
    // do moi case mau xanh chi co 1 thang do, ket luan ca dam do~
    // ham dung cho 99 truong hop, expected = actual cho 99% tinh huong
    
    //chi co 1 tinh huong sai, ko khop, ket luan luon, ham k on dinh
    // ai dam xai khi k on dinh, on dinh va chinh xac cho moi truong hop
    //chi can it nhat 1 cai khong on, do ca dam de dam bao rang ham phai chinh xac tinh huong
    // Muon lam duoc dieu nay, can su phu giup cua cac thu vien ben ngoai JDK, goi la 
    //unit test Framework
    // Cac bo unit test noi tieng: JUnit, TstUnit,NUnit, xUnit,PHUnit,...
    //bua nay minh hoc xanh do qua Unit
    // Van voi muc tieu test ham co ngon khong, nhung chi nhin dung 2 au, k care chi tiet cac tinh huong chay
 
}
