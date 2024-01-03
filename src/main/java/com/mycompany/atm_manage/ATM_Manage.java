

package com.mycompany.atm_manage;

import java.util.Scanner;


public class ATM_Manage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM myATM = new ATM();
        myATM.contributeMoneyATM();
        myATM.displayMoneyList();
        System.out.println("Nhap so tien muon rut");
        double out = sc.nextDouble();
        DrawMoney draw = new DrawMoney(out);
        draw.withdrawCash(myATM);
    }
}
