package testdata;

import models.AccountModel;
import utilities.FakerMessage;

public class GetNewAccountModel {

    public static AccountModel getAccountWithAllFields() {
        return AccountModel
                .builder()
                .accountName(FakerMessage.getAccountName())
                .phone(FakerMessage.getPhone())
                .fax(FakerMessage.getFax())
                .website(FakerMessage.getWebsite())
                .employees(FakerMessage.getEmployees())
                .revenue(FakerMessage.getRevenue())
                .billingStreet(FakerMessage.getBillingStreet())
                .shippingStreet(FakerMessage.getShippingStreet())
                .description(FakerMessage.getDescription())
                .industry(FakerMessage.getIndustry())
                .type(FakerMessage.getType())
                .billingCity(FakerMessage.getBillingCity())
                .build();
    }

    public static AccountModel getAccount() {
        return AccountModel
                .builder()
                .accountName(FakerMessage.getAccountName())
                .phone(FakerMessage.getPhone())
                .fax(FakerMessage.getFax())
                .website(FakerMessage.getWebsite())
                .employees(FakerMessage.getEmployees())
                .revenue(FakerMessage.getRevenue())
                .billingStreet(FakerMessage.getBillingStreet())
                .shippingStreet(FakerMessage.getShippingStreet())
                .description(FakerMessage.getDescription())
                .industry(FakerMessage.getIndustry())
                .type(FakerMessage.getType())
                .build();
    }
}
