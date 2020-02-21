package Adarsh.Clean_code_2;

public class Construction implements Material{
	 private String materialStandard;
	    private Integer houseArea;
	    private Boolean automation;
	    Construction(String materialStandard, Integer houseArea) {
	        this.materialStandard = materialStandard;
	        this.houseArea = houseArea;
	        this.automation = false;
	    }
	    Construction(String materialStandard, Integer houseArea, Boolean automation) {
	        this.materialStandard = materialStandard;
	        this.houseArea = houseArea;
	        this.automation = automation;
	    }
	    Integer getConstructionCost() {
	        switch (materialStandard){
	            case "aboveStandard":
	                return aboveStandard();
	            case "highStandard":
	                return highStandard();
	            default:
	                return standard();

	        }
	    }

	    public Integer standard() {
	        return 1200 * houseArea;
	    }
	    public Integer aboveStandard() {
	        return 1500 * houseArea;
	    }
	    public Integer highStandard() {
	        if (!automation)
	            return 1800 * houseArea;
	        return 2500;
	    }
}
