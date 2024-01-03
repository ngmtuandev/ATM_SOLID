
    package com.mycompany.atm_manage;

    public class DistributeMoney {
        private double valueMoney;
        private int qualityMoney;

        public DistributeMoney(double valueMoney, int qualityMoney) {
            this.valueMoney = valueMoney;
            this.qualityMoney = qualityMoney;
        }

        public DistributeMoney() {
        }

        public double getValueMoney() {
            return valueMoney;
        }

        public void setValueMoney(double valueMoney) {
            this.valueMoney = valueMoney;
        }

        public int getQualityMoney() {
            return qualityMoney;
        }

        public void setQualityMoney(int qualityMoney) {
            this.qualityMoney = qualityMoney;
        }



    }
