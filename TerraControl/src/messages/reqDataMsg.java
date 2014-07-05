/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'reqDataMsg'
 * message type.
 */
package messages;
public class reqDataMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 4;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 132;

    /** Create a new reqDataMsg of size 4. */
    public reqDataMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new reqDataMsg of the given data_length. */
    public reqDataMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg with the given data_length
     * and base offset.
     */
    public reqDataMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg using the given byte array
     * as backing store.
     */
    public reqDataMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public reqDataMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public reqDataMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg embedded in the given message
     * at the given base offset.
     */
    public reqDataMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new reqDataMsg embedded in the given message
     * at the given base offset and length.
     */
    public reqDataMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <reqDataMsg> \n";
      try {
        s += "  [versionId=0x"+Long.toHexString(get_versionId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [seq=0x"+Long.toHexString(get_seq())+"]\n";
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
    // Accessor methods for field: seq
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'seq' is signed (false).
     */
    public static boolean isSigned_seq() {
        return false;
    }

    /**
     * Return whether the field 'seq' is an array (false).
     */
    public static boolean isArray_seq() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'seq'
     */
    public static int offset_seq() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'seq'
     */
    public static int offsetBits_seq() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'seq'
     */
    public int get_seq() {
        return (int)getUIntBEElement(offsetBits_seq(), 16);
    }

    /**
     * Set the value of the field 'seq'
     */
    public void set_seq(int value) {
        setUIntBEElement(offsetBits_seq(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'seq'
     */
    public static int size_seq() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'seq'
     */
    public static int sizeBits_seq() {
        return 16;
    }

}
