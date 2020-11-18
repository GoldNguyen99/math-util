/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gold.util.test;

import static github.MathUltility.*;
//chi co tu JDK 5? ham static goi ma hok can ten class cham 
// do minh da choi tro khai bao san ten class va en ham static qua lenh 
//import static
//sau nay sai ham static cua  class nay ko can ten class cham, xai nhu C 

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    //viet ra nhung viec nhung tinh huong xai ham getFactorial()
    //kiem tra xem actual == expected hay ko?? nhu truyen thong ben main()
    //nhung o day xin so hon, show ra mau Xanh DO
    //ngoai ra no con dung duoc cho viec CI - Continuous Intergration
                                          //CD - Continuous Delivery
    //                                     CT - Continuous Regression Test 
    //                                      DEvOps - Development & Operation
    //ngoai doanh nghiep dang xai
    // a[[ lien tuc duoc kiem tra chat luong code, build ra file.jar.war
    //day len 1 server trung gian - Staging Eviroment de cho nhom test
    //san sang test ki
    //sau do co the day thang len Production Server, may chay that o noi khach hang
    //moi viec se bat dau ke tu luc Developer push code len Github
    // moi thu cu the tu dong, ko can con nguoi can thiep.
    @Test //tu khoa nay tuong ~~ bien cai ham nay thanh Public Static void mani()
    //trong ham nay minh se show ra mau xanh do dua tren su khop nhau cua Expected vs. Actual qua ham assertEquals().. 
    //ma thu vien cung cap
    //assert..() du cac loai assert tren cuoc doi - assert co nghia la so sanh
    //thay vi so sanh bang mat, ta nho ham so luon, thay~ ve mau gium ta.
    public void getFactual_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        //vietsub: tinh dum tui 5! coi no co la 120 hem?
        //no co thi bao mau xanh, ko thi bao do~ .
        
    }
   
    
}
