//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.21 at 09:39:22 PM IST 
//


package com.springsoap.cpsinterface.request;

import com.springsoap.cpsinterface.common.DirectDebitMandateInfo;
import com.springsoap.cpsinterface.common.IdentifierTypeValue;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Payer发起创建Direct Debit Mandate的操作
 * 
 * <p>Java class for CreateDirectDebitMandateByPayerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDirectDebitMandateByPayerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payee" type="{http://cps.huawei.com/cpsinterface/common}IdentifierTypeValue"/&gt;
 *         &lt;element name="DirectDebitMandateInfo" type="{http://cps.huawei.com/cpsinterface/common}DirectDebitMandateInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDirectDebitMandateByPayerRequest", propOrder = {
    "payee",
    "directDebitMandateInfo"
})
public class CreateDirectDebitMandateByPayerRequest {

    @XmlElement(name = "Payee", required = true)
    protected IdentifierTypeValue payee;
    @XmlElement(name = "DirectDebitMandateInfo", required = true)
    protected DirectDebitMandateInfo directDebitMandateInfo;

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierTypeValue }
     *     
     */
    public IdentifierTypeValue getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierTypeValue }
     *     
     */
    public void setPayee(IdentifierTypeValue value) {
        this.payee = value;
    }

    /**
     * Gets the value of the directDebitMandateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateInfo }
     *     
     */
    public DirectDebitMandateInfo getDirectDebitMandateInfo() {
        return directDebitMandateInfo;
    }

    /**
     * Sets the value of the directDebitMandateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateInfo }
     *     
     */
    public void setDirectDebitMandateInfo(DirectDebitMandateInfo value) {
        this.directDebitMandateInfo = value;
    }

}
