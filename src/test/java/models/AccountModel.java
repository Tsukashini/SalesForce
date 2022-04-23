package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class AccountModel {

    private String accountName;
    private String phone;
    private String fax;
    private String website;
    private String employees;
    private String revenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingZip;
    private String billingState;
    private String billingCountry;
    private String shippingState;
    private String shippingZip;
    private String shippingCity;
    private String shippingCountry;
    private int type;
    private int industry;

}
