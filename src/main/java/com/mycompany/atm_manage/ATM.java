
package com.mycompany.atm_manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private List<DistributeMoney> listMoney = new ArrayList<>();

    public List<DistributeMoney> getListMoney() {
        return listMoney;
    }
    
    
    
   public void contributeMoneyATM() {
       Scanner sc = new Scanner(System.in);
       int a;
           
       do {           
           System.out.println("nhap phim 1 de thoat");
           System.out.println("nhap phim 2 de them tien ATM");
           a = sc.nextInt();
           switch (a) {
               case 2:
                   System.out.println("Nhap menh gia : ");
                   double value = sc.nextDouble();
                   System.out.println("Nhap so luong : ");
                   int quality = sc.nextInt();
                   listMoney.add(new DistributeMoney(value, quality));
                   break;
                case 1:
                    break;
               default:
                   throw new AssertionError();
           }    
           
       } while (a != 1);
   }
   
   public void displayMoneyList() {
        System.out.println("Danh sach tien trong ATM:");
        for (DistributeMoney money : listMoney) {
            System.out.println("Menh gia: " + money.getValueMoney() + ", So luong: " + money.getQualityMoney());
        }
    }
    
}
