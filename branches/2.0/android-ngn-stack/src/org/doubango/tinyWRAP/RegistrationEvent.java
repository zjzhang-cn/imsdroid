/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class RegistrationEvent extends SipEvent {
  private long swigCPtr;

  protected RegistrationEvent(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.RegistrationEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RegistrationEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_RegistrationEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public tsip_register_event_type_t getType() {
    return tsip_register_event_type_t.swigToEnum(tinyWRAPJNI.RegistrationEvent_getType(swigCPtr, this));
  }

  public RegistrationSession getSession() {
    long cPtr = tinyWRAPJNI.RegistrationEvent_getSession(swigCPtr, this);
    return (cPtr == 0) ? null : new RegistrationSession(cPtr, false);
  }

  public RegistrationSession takeSessionOwnership() {
    long cPtr = tinyWRAPJNI.RegistrationEvent_takeSessionOwnership(swigCPtr, this);
    return (cPtr == 0) ? null : new RegistrationSession(cPtr, true);
  }

}
