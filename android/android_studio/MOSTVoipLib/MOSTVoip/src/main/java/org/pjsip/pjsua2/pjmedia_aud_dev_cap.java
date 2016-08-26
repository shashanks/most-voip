/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_aud_dev_cap {
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_EXT_FORMAT = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_EXT_FORMAT", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_EXT_FORMAT_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_EC = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_EC", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_EC_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_EC_TAIL = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_EC_TAIL", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_EC_TAIL_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_VAD = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_VAD", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_VAD_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_CNG = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_CNG", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_CNG_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_PLC = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_PLC", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_PLC_get());
  public final static pjmedia_aud_dev_cap PJMEDIA_AUD_DEV_CAP_MAX = new pjmedia_aud_dev_cap("PJMEDIA_AUD_DEV_CAP_MAX", pjsua2JNI.PJMEDIA_AUD_DEV_CAP_MAX_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_aud_dev_cap swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_aud_dev_cap.class + " with value " + swigValue);
  }

  private pjmedia_aud_dev_cap(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_aud_dev_cap(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_aud_dev_cap(String swigName, pjmedia_aud_dev_cap swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_aud_dev_cap[] swigValues = { PJMEDIA_AUD_DEV_CAP_EXT_FORMAT, PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY, PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY, PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING, PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING, PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER, PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER, PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE, PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE, PJMEDIA_AUD_DEV_CAP_EC, PJMEDIA_AUD_DEV_CAP_EC_TAIL, PJMEDIA_AUD_DEV_CAP_VAD, PJMEDIA_AUD_DEV_CAP_CNG, PJMEDIA_AUD_DEV_CAP_PLC, PJMEDIA_AUD_DEV_CAP_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

