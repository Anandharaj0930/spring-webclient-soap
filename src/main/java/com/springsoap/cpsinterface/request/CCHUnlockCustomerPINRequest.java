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
 * CCH:解锁Customer的PIN
 * 
 * <p>Java class for CCHUnlockCustomerPINRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCHUnlockCustomerPINRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "CCHUnlockCustomerPINRequest", propOrder = {
    "verifyKYCData"
})
public class CCHUnlockCustomerPINRequest {

    @XmlElement(name = "VerifyKYCData", required = true)
    protected SimpleKYCDataType verifyKYCData;

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
