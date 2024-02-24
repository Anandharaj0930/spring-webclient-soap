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
import com.springsoap.cpsinterface.common.SimpleKYCDataType;


/**
 * CCH:重置Customer的PIN
 * 
 * <p>Java class for CCHSendCustomerStartKeyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCHSendCustomerStartKeyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreePIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VerifyKYCData" type="{http://cps.huawei.com/cpsinterface/common}SimpleKYCDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCHSendCustomerStartKeyRequest", propOrder = {
    "freePIN",
    "verifyKYCData"
})
public class CCHSendCustomerStartKeyRequest {

    @XmlElement(name = "FreePIN")
    protected String freePIN;
    @XmlElement(name = "VerifyKYCData", required = true)
    protected SimpleKYCDataType verifyKYCData;

    /**
     * Gets the value of the freePIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreePIN() {
        return freePIN;
    }

    /**
     * Sets the value of the freePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreePIN(String value) {
        this.freePIN = value;
    }

    /**
     * Gets the value of the verifyKYCData property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleKYCDataType }
     *     
     */
    public SimpleKYCDataType getVerifyKYCData() {
        return verifyKYCData;
    }

    /**
     * Sets the value of the verifyKYCData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleKYCDataType }
     *     
     */
    public void setVerifyKYCData(SimpleKYCDataType value) {
        this.verifyKYCData = value;
    }

}