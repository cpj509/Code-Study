package customermanage;

public class VIPCustomer extends Customer {
    double saleRatio;
    private int agentID;

    public VIPCustomer(){
        super();//생략 가능
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;//구매 할인율 10%
    }

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;//구매 할인율 10%
    }

    public void setAgentID(int agentID){
        this.agentID = agentID;
    }

    public int getAgentID() {
        return agentID;
    }


    @Override
    public int calcPrice(int price) {
        //할인 가격 = 가격 x 구매 할인율
        price = price - (int)(price * saleRatio);
        bonusPoint = (int)(price * bonusRatio);
        return price;
    }



    //showInfo() 재정의

    @Override
    public String showInfo() {
        return super.showInfo() + "전문 상담원 아이디는 " + agentID + "입니다.";
    }
}
