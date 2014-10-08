#ifndef XBEE_API_H
#define XBEE_API_H

enum{
	
	// Size constants
	MAX_API_FRAME_LEN = 50,
	
	// API Identifier	
	// Request
	XAPI_AT_COMM_REQ = 0x08,
	XAPI_AT_COMMQ_REQ = 0x09,
	XAPI_AT_REM_COMM_REQ = 0x17,
	XAPI_TX_REQ = 0x01,
	// Return
	XAPI_STATUS = 0x8a,
	XAPI_AT_COMM_RESP = 0x88,
	XAPI_AT_REM_COMM_RESP = 0x97,
	XAPI_TX_STAT = 0x89,
	XAPI_RX_PACKET = 0x81,
	XAPI_RX_PACKET_IO = 0x83,
	
	// Status Status Code
	ST_HW_RESET = 0,
	ST_WATCHDOG = 1,
	ST_ASSOCIATED = 2,
	ST_DISASSOCIATED = 3,
	ST_SYNC_LOST = 4,
	ST_COORD_REALIGNMENT = 5,
	ST_COORD_STARTED = 6,
	
	// AT Status code
	AT_ST_OK = 0,
	AT_ST_ERROR = 1,
	AT_ST_INVALID_COMM = 2,
	AT_ST_INVALID_PARAM = 3,
	AT_ST_NO_RESP = 4,
	
	// OPTIONS TX
	OPT_TX_DISABLE_ACK = 0x01,
	OPT_TX_BROADCAST_PANID = 0x04,
	
	// TX Status code
	TX_SUCCESS = 0,
	TX_NO_ACK = 1,
	TX_CCA_FAIL = 2,
	TX_PURGED = 3,

	// OPTIONS RX
	OPT_RX_ADDR_BROADCAST = 0x02,
	OPT_RX_PAN_BROADCAST = 0x04,

	// API Module State Machine states
	SM_CONFIG = 0,
	SM_WAITING_DELIMITER = 1,
	SM_WAITING_LENGTH = 2,
	SM_READING_FRAME_DATA = 3,
	SM_WAITING_CHECKSUM = 4,
	
	
};





#endif /* XBEE_API_H */
