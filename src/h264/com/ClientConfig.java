package h264.com;	

// Some Constant
public interface ClientConfig {
	
	// i.e., "127.0.0.1" on the development machine
	static final String CONFIG_RTP_SERVER_HOST = "10.0.2.2";
	
	/*
	 * RTP port(UDP port)
	 * PC end acts as server
	 * android end acts as server
	 */
	static final int CONFIG_SERVER_UDP_PORT = 2002;
	static final int CONFIG_CLIENT_UDP_PORT = 2002;
	
	/*
	 * TCP port
	 * android end acts as server
	 * PC end acts as client
	 */
	static final int CONFIG_SERVER_TCP_PORT = 2000;	
	static final int CONFIG_CLIENT_TCP_PORT = 2000;	
	
	
	// to receive PPS and SPS
	static final int CONFIG_BUFFER_SIZE = 30; // 30 bytes
	
	// the max size of one RTP packet
	static final int CONFIG_RTP_PACKET_SIZE = 1400;
	
	/*
	 * the size of RTP buffer,
	 * RTP buffer is used to order the RTP packets
	 */
	static final int CONFIG_RTP_BUFFER_SIZE = 40*1024; //40k
}