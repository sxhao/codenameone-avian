// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XExposeEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return ((XlibWrapper.dataModel == 32)?(40):(64)); }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XExposeEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XExposeEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(4):(8)))); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(4):(8)), v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+((XlibWrapper.dataModel == 32)?(8):(16)))); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+((XlibWrapper.dataModel == 32)?(8):(16)), v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(12):(24)))); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(12):(24)), v); }
	public long get_window() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(16):(32)))); }
	public void set_window(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(16):(32)), v); }
	public int get_x() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(20):(40)))); }
	public void set_x(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(20):(40)), v); }
	public int get_y() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(24):(44)))); }
	public void set_y(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(24):(44)), v); }
	public int get_width() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(28):(48)))); }
	public void set_width(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(28):(48)), v); }
	public int get_height() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(32):(52)))); }
	public void set_height(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(32):(52)), v); }
	public int get_count() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(36):(56)))); }
	public void set_count(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(36):(56)), v); }


	String getName() {
		return "XExposeEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(400);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("window = " ).append( getWindow(get_window()) ).append(", ");
		ret.append("x = ").append( get_x() ).append(", ");
		ret.append("y = ").append( get_y() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("height = ").append( get_height() ).append(", ");
		ret.append("count = ").append( get_count() ).append(", ");
		return ret.toString();
	}


}


