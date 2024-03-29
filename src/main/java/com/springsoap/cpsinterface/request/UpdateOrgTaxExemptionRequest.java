//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.21 at 09:39:22 PM IST 
//


package com.springsoap.cpsinterface.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 修改Organization的免税信息
 * 
 * <p>Java class for UpdateOrgTaxExemptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrgTaxExemptionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxExemptionData" type="{http://cps.huawei.com/cpsinterface/request}TaxExemptionDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrgTaxExemptionRequest", propOrder = {
    "taxExemptionData"
})
public class UpdateOrgTaxExemptionRequest {

    @XmlElement(name = "TaxExemptionData", required = true)
    protected TaxExemptionDataType taxExemptionData;

    /**
     * Gets the value of the taxExemptionData property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionDataType }
     *     
     */
    public TaxExemptionDataType getTaxExemptionData() {
        return taxExemptionData;
    }

    /**
     * Sets the value of the taxExemptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionDataType }
     *     
     */
    public void setTaxExemptionData(TaxExemptionDataType value) {
        this.taxExemptionData = value;
    }

}
