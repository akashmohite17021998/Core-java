package LangPackage;

public class Market {
	 private String item;
	    private int pr;
	     
	    Market(String item, int pr){
	        this.item = item;
	        this.pr = pr;
	    }
	     
	    public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        hashcode = pr*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof Market) {
	        	Market pp = (Market) obj;
	            return (pp.item.equals(this.item) && pp.pr == this.pr);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getPrice() {
	        return pr;
	    }
	    public void setPrice(int price) {
	        this.pr = price;
	    }
	     
	    public String toString(){
	        return "item: "+item+"  price: "+pr;
	    }

}
