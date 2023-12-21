package models;

public class Claim {
    private String claimId;
    private double amount;
    private String date;
    private String description;
    private String supportingDocument;

    public Claim(double amount, String date, String description, String supportingDocument) {
        this.claimId = claimId;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.supportingDocument = supportingDocument;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupportingDocument() {
        return supportingDocument;
    }

    public void setSupportingDocument(String supportingDocument) {
        this.supportingDocument = supportingDocument;
    }
}
