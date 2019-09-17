/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mahendra.models;

public class Account  implements java.io.Serializable {
    private int accountNo;

    private double balance;

    private java.lang.String holder;

    public Account() {
    }

    public Account(
           int accountNo,
           double balance,
           java.lang.String holder) {
           this.accountNo = accountNo;
           this.balance = balance;
           this.holder = holder;
    }


    /**
     * Gets the accountNo value for this Account.
     * 
     * @return accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }


    /**
     * Sets the accountNo value for this Account.
     * 
     * @param accountNo
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }


    /**
     * Gets the balance value for this Account.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Account.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the holder value for this Account.
     * 
     * @return holder
     */
    public java.lang.String getHolder() {
        return holder;
    }


    /**
     * Sets the holder value for this Account.
     * 
     * @param holder
     */
    public void setHolder(java.lang.String holder) {
        this.holder = holder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountNo == other.getAccountNo() &&
            this.balance == other.getBalance() &&
            ((this.holder==null && other.getHolder()==null) || 
             (this.holder!=null &&
              this.holder.equals(other.getHolder())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAccountNo();
        _hashCode += new Double(getBalance()).hashCode();
        if (getHolder() != null) {
            _hashCode += getHolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://models.mahendra.com", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models.mahendra.com", "accountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models.mahendra.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models.mahendra.com", "holder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
