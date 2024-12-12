package collectionFramework;

class Data {
    private Integer num;
    private String name;
    private InternalData internalData;

    Data(Integer num, String name, Integer revenue) {
        this.num = num;
        this.name = name;
        this.internalData = new InternalData(revenue);
    }

    // setter
    public void setData(Integer num, String name, Integer revenue) {
        this.num = num;
        this.name = name;
        this.internalData = new InternalData(revenue);
    }

    // getter
    public Integer getNum() {
        return num;
    }
    
    public String getName() {
        return name;
    }

    public Integer getRevenue() {
        return internalData.revenue;
    }
}

class InternalData {
    public Integer revenue;
    InternalData(Integer revenue) {
        this.revenue = revenue;
    }
}

public class LearnCustomClasses {
    public static void main(String[] args) {
        Data data = new Data(null, null, null);
        data.setData(18, "Raghu", 100000);
        System.out.println(data.getNum());
        System.out.println(data.getName());
        System.out.println(data.getRevenue());
    }
}
