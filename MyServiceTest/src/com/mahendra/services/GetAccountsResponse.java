/**
 * GetAccountsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mahendra.services;

public class GetAccountsResponse  implements java.io.Serializable {
    private java.lang.Object[] getAccountsReturn;

    public GetAccountsResponse() {
    }

    public GetAccountsResponse(
           java.lang.Object[] getAccountsReturn) {
           this.getAccountsReturn = getAccountsReturn;
    }


    /**
     * Gets the getAccountsReturn value for this GetAccountsResponse.
     * 
     * @return getAccountsReturn
     */
    public java.lang.Object[] getGetAccountsReturn() {
        return getAccountsReturn;
    }


    /**
     * Sets the getAccountsReturn value for this GetAccountsResponse.
     * 
     * @param getAccountsReturn
     */
    public void setGetAccountsReturn(java.lang.Object[] getAccountsReturn) {
        this.getAccountsReturn = getAccountsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountsResponse)) return false;
        GetAccountsResponse other = (GetAccountsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAccountsReturn==null && other.getGetAccountsReturn()==null) || 
             (this.getAccountsReturn!=null &&
              java.util.Arrays.equals(this.getAccountsReturn, other.getGetAccountsReturn())));
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
        if (getGetAccountsReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAccountsReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAccountsReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.mahendra.com", ">getAccountsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.mahendra.com", "getAccountsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.mahendra.com", "item"));
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
