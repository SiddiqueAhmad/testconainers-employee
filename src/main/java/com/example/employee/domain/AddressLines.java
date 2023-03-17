package com.example.employee.domain;

import com.example.employee.web.schema.AddressLinesDTO;

import javax.persistence.Embeddable;

@Embeddable
public class AddressLines {

    private String exterior;

    private String interior;

    private String street;

    public AddressLines(String exterior, String interior, String street) {
        this.exterior = exterior;
        this.interior = interior;
        this.street = street;
    }

    public AddressLines() {
    }

    public static AddressLinesDTO from(AddressLines addressLines) {
        return AddressLinesDTO.builder().setInterior(addressLines.getInterior())
                .setExterior(addressLines.getExterior()).setStreet(addressLines.getStreet()).build();
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
