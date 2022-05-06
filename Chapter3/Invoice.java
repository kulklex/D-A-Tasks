package Chapter3;

public class Invoice {
    private String partNumber;
    private String partDesc;
    private int quantityOfItem;
    private double pricePerItem;

    public Invoice(String partNumber, String partDesc, int quantityOfItem, double pricePerItem){
        this.partNumber = partNumber;
        this.partDesc = partDesc;
        this.pricePerItem = pricePerItem;
        this.quantityOfItem = quantityOfItem; 
    }

    public void setpartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return this.partNumber;
    }

    public void setpartDesc(String partDesc){
        this.partDesc = partDesc;
    }

    public String getpartDesc(){
        return this.partDesc;
    }

    public void getpricePerItem(double pricePerItem){
        if(pricePerItem > 0.00){
            this.pricePerItem = pricePerItem;
        }
    }

    public double setpricePerItem(){
        return this.pricePerItem;
    }

    public void setquantiyOfItem(int quantityOfItem){
        if(quantityOfItem > 0){
            this.quantityOfItem = quantityOfItem;
        }
    }

    public int setquantityOfItem(){
        return this.quantityOfItem;
    }

    public double getInvoiceAmount(double pricePerItem, int quantityOfItem){
        if(pricePerItem < 0){
            pricePerItem = 0;
        }
        if(quantityOfItem < 0){
            quantityOfItem = 0;
        }
        
        double invoiceAmount = pricePerItem * quantityOfItem;
        return invoiceAmount;
    }
}
