/**
 * Save.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mahendra.services;

public class Save  implements java.io.Serializable {
    private com.mahendra.models.Account ac;

    public Save() {
    }

    public Save(
           com.mahendra.models.Account ac) {
           this.ac = ac;
    }


    /**
     * Gets the ac value for this Save.
     * 
     * @return ac
     */
    public com.mahendra.models.Account getAc() {
        return ac;
    }


    /**
     * Sets the ac value for this Save.
     * 
     * @param ac
     */
    public void setAc(com.mahendra.models.Account ac) {
        this.ac = ac;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Save)) return false;
        Save other = (Save) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ac==null && other.getAc()==null) || 
             (this.ac!=null &&
              this.ac.equals(other.getAc())));
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
        if (getAc() != null) {
            _hashCode += getAc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Save.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.mahendra.com", ">save"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ac");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.mahendra.com", "ac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://models.mahendra.com", "Account"));
        elemField.setNillable(false);
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
