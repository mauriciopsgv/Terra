/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'newProgVersionMsg'
 * message type.
 */
package messages;

public class newProgVersionMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 24;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 160;

    /** Create a new newProgVersionMsg of size 24. */
    public newProgVersionMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new newProgVersionMsg of the given data_length. */
    public newProgVersionMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg with the given data_length
     * and base offset.
     */
    public newProgVersionMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg using the given byte array
     * as backing store.
     */
    public newProgVersionMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public newProgVersionMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public newProgVersionMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg embedded in the given message
     * at the given base offset.
     */
    public newProgVersionMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new newProgVersionMsg embedded in the given message
     * at the given base offset and length.
     */
    public newProgVersionMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <newProgVersionMsg> \n";
      try {
        s += "  [versionId=0x"+Long.toHexString(get_versionId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [blockLen=0x"+Long.toHexString(get_blockLen())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [blockStart=0x"+Long.toHexString(get_blockStart())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [startProg=0x"+Long.toHexString(get_startProg())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lblTable11=0x"+Long.toHexString(get_lblTable11())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lblTable12=0x"+Long.toHexString(get_lblTable12())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lblTable21=0x"+Long.toHexString(get_lblTable21())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lblTable22=0x"+Long.toHexString(get_lblTable22())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [lblTableEnd=0x"+Long.toHexString(get_lblTableEnd())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nTracks=0x"+Long.toHexString(get_nTracks())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [wClocks=0x"+Long.toHexString(get_wClocks())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [wClock0=0x"+Long.toHexString(get_wClock0())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [gate0=0x"+Long.toHexString(get_gate0())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: versionId
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'versionId' is signed (false).
     */
    public static boolean isSigned_versionId() {
        return false;
    }

    /**
     * Return whether the field 'versionId' is an array (false).
     */
    public static boolean isArray_versionId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'versionId'
     */
    public static int offset_versionId() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'versionId'
     */
    public static int offsetBits_versionId() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'versionId'
     */
    public int get_versionId() {
        return (int)getUIntBEElement(offsetBits_versionId(), 16);
    }

    /**
     * Set the value of the field 'versionId'
     */
    public void set_versionId(int value) {
        setUIntBEElement(offsetBits_versionId(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'versionId'
     */
    public static int size_versionId() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'versionId'
     */
    public static int sizeBits_versionId() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: blockLen
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'blockLen' is signed (false).
     */
    public static boolean isSigned_blockLen() {
        return false;
    }

    /**
     * Return whether the field 'blockLen' is an array (false).
     */
    public static boolean isArray_blockLen() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'blockLen'
     */
    public static int offset_blockLen() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'blockLen'
     */
    public static int offsetBits_blockLen() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'blockLen'
     */
    public short get_blockLen() {
        return (short)getUIntBEElement(offsetBits_blockLen(), 8);
    }

    /**
     * Set the value of the field 'blockLen'
     */
    public void set_blockLen(short value) {
        setUIntBEElement(offsetBits_blockLen(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'blockLen'
     */
    public static int size_blockLen() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'blockLen'
     */
    public static int sizeBits_blockLen() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: blockStart
    //   Field type: short, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'blockStart' is signed (false).
     */
    public static boolean isSigned_blockStart() {
        return false;
    }

    /**
     * Return whether the field 'blockStart' is an array (false).
     */
    public static boolean isArray_blockStart() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'blockStart'
     */
    public static int offset_blockStart() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'blockStart'
     */
    public static int offsetBits_blockStart() {
        return 24;
    }

    /**
     * Return the value (as a short) of the field 'blockStart'
     */
    public short get_blockStart() {
        return (short)getUIntBEElement(offsetBits_blockStart(), 8);
    }

    /**
     * Set the value of the field 'blockStart'
     */
    public void set_blockStart(short value) {
        setUIntBEElement(offsetBits_blockStart(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'blockStart'
     */
    public static int size_blockStart() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'blockStart'
     */
    public static int sizeBits_blockStart() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: startProg
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'startProg' is signed (false).
     */
    public static boolean isSigned_startProg() {
        return false;
    }

    /**
     * Return whether the field 'startProg' is an array (false).
     */
    public static boolean isArray_startProg() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'startProg'
     */
    public static int offset_startProg() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'startProg'
     */
    public static int offsetBits_startProg() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'startProg'
     */
    public int get_startProg() {
        return (int)getUIntBEElement(offsetBits_startProg(), 16);
    }

    /**
     * Set the value of the field 'startProg'
     */
    public void set_startProg(int value) {
        setUIntBEElement(offsetBits_startProg(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'startProg'
     */
    public static int size_startProg() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'startProg'
     */
    public static int sizeBits_startProg() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lblTable11
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lblTable11' is signed (false).
     */
    public static boolean isSigned_lblTable11() {
        return false;
    }

    /**
     * Return whether the field 'lblTable11' is an array (false).
     */
    public static boolean isArray_lblTable11() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lblTable11'
     */
    public static int offset_lblTable11() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lblTable11'
     */
    public static int offsetBits_lblTable11() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'lblTable11'
     */
    public int get_lblTable11() {
        return (int)getUIntBEElement(offsetBits_lblTable11(), 16);
    }

    /**
     * Set the value of the field 'lblTable11'
     */
    public void set_lblTable11(int value) {
        setUIntBEElement(offsetBits_lblTable11(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lblTable11'
     */
    public static int size_lblTable11() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lblTable11'
     */
    public static int sizeBits_lblTable11() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lblTable12
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lblTable12' is signed (false).
     */
    public static boolean isSigned_lblTable12() {
        return false;
    }

    /**
     * Return whether the field 'lblTable12' is an array (false).
     */
    public static boolean isArray_lblTable12() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lblTable12'
     */
    public static int offset_lblTable12() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lblTable12'
     */
    public static int offsetBits_lblTable12() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'lblTable12'
     */
    public int get_lblTable12() {
        return (int)getUIntBEElement(offsetBits_lblTable12(), 16);
    }

    /**
     * Set the value of the field 'lblTable12'
     */
    public void set_lblTable12(int value) {
        setUIntBEElement(offsetBits_lblTable12(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lblTable12'
     */
    public static int size_lblTable12() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lblTable12'
     */
    public static int sizeBits_lblTable12() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lblTable21
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lblTable21' is signed (false).
     */
    public static boolean isSigned_lblTable21() {
        return false;
    }

    /**
     * Return whether the field 'lblTable21' is an array (false).
     */
    public static boolean isArray_lblTable21() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lblTable21'
     */
    public static int offset_lblTable21() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lblTable21'
     */
    public static int offsetBits_lblTable21() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'lblTable21'
     */
    public int get_lblTable21() {
        return (int)getUIntBEElement(offsetBits_lblTable21(), 16);
    }

    /**
     * Set the value of the field 'lblTable21'
     */
    public void set_lblTable21(int value) {
        setUIntBEElement(offsetBits_lblTable21(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lblTable21'
     */
    public static int size_lblTable21() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lblTable21'
     */
    public static int sizeBits_lblTable21() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lblTable22
    //   Field type: int, unsigned
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lblTable22' is signed (false).
     */
    public static boolean isSigned_lblTable22() {
        return false;
    }

    /**
     * Return whether the field 'lblTable22' is an array (false).
     */
    public static boolean isArray_lblTable22() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lblTable22'
     */
    public static int offset_lblTable22() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lblTable22'
     */
    public static int offsetBits_lblTable22() {
        return 96;
    }

    /**
     * Return the value (as a int) of the field 'lblTable22'
     */
    public int get_lblTable22() {
        return (int)getUIntBEElement(offsetBits_lblTable22(), 16);
    }

    /**
     * Set the value of the field 'lblTable22'
     */
    public void set_lblTable22(int value) {
        setUIntBEElement(offsetBits_lblTable22(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lblTable22'
     */
    public static int size_lblTable22() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lblTable22'
     */
    public static int sizeBits_lblTable22() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: lblTableEnd
    //   Field type: int, unsigned
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'lblTableEnd' is signed (false).
     */
    public static boolean isSigned_lblTableEnd() {
        return false;
    }

    /**
     * Return whether the field 'lblTableEnd' is an array (false).
     */
    public static boolean isArray_lblTableEnd() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'lblTableEnd'
     */
    public static int offset_lblTableEnd() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'lblTableEnd'
     */
    public static int offsetBits_lblTableEnd() {
        return 112;
    }

    /**
     * Return the value (as a int) of the field 'lblTableEnd'
     */
    public int get_lblTableEnd() {
        return (int)getUIntBEElement(offsetBits_lblTableEnd(), 16);
    }

    /**
     * Set the value of the field 'lblTableEnd'
     */
    public void set_lblTableEnd(int value) {
        setUIntBEElement(offsetBits_lblTableEnd(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'lblTableEnd'
     */
    public static int size_lblTableEnd() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'lblTableEnd'
     */
    public static int sizeBits_lblTableEnd() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nTracks
    //   Field type: int, unsigned
    //   Offset (bits): 128
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nTracks' is signed (false).
     */
    public static boolean isSigned_nTracks() {
        return false;
    }

    /**
     * Return whether the field 'nTracks' is an array (false).
     */
    public static boolean isArray_nTracks() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nTracks'
     */
    public static int offset_nTracks() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nTracks'
     */
    public static int offsetBits_nTracks() {
        return 128;
    }

    /**
     * Return the value (as a int) of the field 'nTracks'
     */
    public int get_nTracks() {
        return (int)getUIntBEElement(offsetBits_nTracks(), 16);
    }

    /**
     * Set the value of the field 'nTracks'
     */
    public void set_nTracks(int value) {
        setUIntBEElement(offsetBits_nTracks(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nTracks'
     */
    public static int size_nTracks() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nTracks'
     */
    public static int sizeBits_nTracks() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: wClocks
    //   Field type: int, unsigned
    //   Offset (bits): 144
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'wClocks' is signed (false).
     */
    public static boolean isSigned_wClocks() {
        return false;
    }

    /**
     * Return whether the field 'wClocks' is an array (false).
     */
    public static boolean isArray_wClocks() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'wClocks'
     */
    public static int offset_wClocks() {
        return (144 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'wClocks'
     */
    public static int offsetBits_wClocks() {
        return 144;
    }

    /**
     * Return the value (as a int) of the field 'wClocks'
     */
    public int get_wClocks() {
        return (int)getUIntBEElement(offsetBits_wClocks(), 16);
    }

    /**
     * Set the value of the field 'wClocks'
     */
    public void set_wClocks(int value) {
        setUIntBEElement(offsetBits_wClocks(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'wClocks'
     */
    public static int size_wClocks() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'wClocks'
     */
    public static int sizeBits_wClocks() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: wClock0
    //   Field type: int, unsigned
    //   Offset (bits): 160
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'wClock0' is signed (false).
     */
    public static boolean isSigned_wClock0() {
        return false;
    }

    /**
     * Return whether the field 'wClock0' is an array (false).
     */
    public static boolean isArray_wClock0() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'wClock0'
     */
    public static int offset_wClock0() {
        return (160 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'wClock0'
     */
    public static int offsetBits_wClock0() {
        return 160;
    }

    /**
     * Return the value (as a int) of the field 'wClock0'
     */
    public int get_wClock0() {
        return (int)getUIntBEElement(offsetBits_wClock0(), 16);
    }

    /**
     * Set the value of the field 'wClock0'
     */
    public void set_wClock0(int value) {
        setUIntBEElement(offsetBits_wClock0(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'wClock0'
     */
    public static int size_wClock0() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'wClock0'
     */
    public static int sizeBits_wClock0() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: gate0
    //   Field type: int, unsigned
    //   Offset (bits): 176
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'gate0' is signed (false).
     */
    public static boolean isSigned_gate0() {
        return false;
    }

    /**
     * Return whether the field 'gate0' is an array (false).
     */
    public static boolean isArray_gate0() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'gate0'
     */
    public static int offset_gate0() {
        return (176 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'gate0'
     */
    public static int offsetBits_gate0() {
        return 176;
    }

    /**
     * Return the value (as a int) of the field 'gate0'
     */
    public int get_gate0() {
        return (int)getUIntBEElement(offsetBits_gate0(), 16);
    }

    /**
     * Set the value of the field 'gate0'
     */
    public void set_gate0(int value) {
        setUIntBEElement(offsetBits_gate0(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'gate0'
     */
    public static int size_gate0() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'gate0'
     */
    public static int sizeBits_gate0() {
        return 16;
    }

}
