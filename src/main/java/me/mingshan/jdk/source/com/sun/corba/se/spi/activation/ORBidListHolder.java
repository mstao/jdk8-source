package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBidListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u192/11897/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, October 6, 2018 5:13:58 PM PDT
*/

public final class ORBidListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ORBidListHolder ()
  {
  }

  public ORBidListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ORBidListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ORBidListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ORBidListHelper.type ();
  }

}
