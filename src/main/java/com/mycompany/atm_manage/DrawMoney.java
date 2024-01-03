
package com.mycompany.atm_manage;

import java.util.ArrayList;
import java.util.List;

public class DrawMoney {
    
    public double qualityDraw;

    public DrawMoney() {
    }

    public DrawMoney(double qualityDraw) {
        this.qualityDraw = qualityDraw;
    }

    public double getQualityDraw() {
        return qualityDraw;
    }

    public void setQualityDraw(double qualityDraw) {
        this.qualityDraw = qualityDraw;
    }
    
    public void withdrawCash(ATM atm) {
    List<DistributeMoney> result = new ArrayList<>();

    for (DistributeMoney money : atm.getListMoney()) {
        double value = money.getValueMoney();
        int availableQuality = money.getQualityMoney();

        if (qualityDraw >= value && availableQuality > 0) {
            int count = Math.min((int) (qualityDraw / value), availableQuality);

            result.add(new DistributeMoney(value, count));
            qualityDraw -= count * value;
            money.setQualityMoney(availableQuality - count);

            if (qualityDraw == 0) {
                break; 
            }
        }
    }

    if (qualityDraw > 0) {
        System.out.println("Khong the rut so tien nay.");
    } else {
        System.out.println("So tien da rut:");
        for (DistributeMoney money : result) {
            System.out.println("Menh gia: " + money.getValueMoney() + ", So luong: " + money.getQualityMoney());
        }
    }
}
}
