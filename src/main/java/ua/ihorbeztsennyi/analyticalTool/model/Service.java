package ua.ihorbeztsennyi.analyticalTool.model;

public class Service {

private Integer serviceId;
private Integer variationId;

    public Service(Integer serviceId, Integer variationId) {
        this.serviceId = serviceId;
        this.variationId = variationId;
    }

    public Service(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public Integer getVariationId() {
        return variationId;
    }
}
