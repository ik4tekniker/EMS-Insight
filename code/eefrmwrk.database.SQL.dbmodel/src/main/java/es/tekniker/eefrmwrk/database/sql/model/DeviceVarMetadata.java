package es.tekniker.eefrmwrk.database.sql.model;

// Generated Sep 4, 2012 8:53:53 AM by Hibernate Tools 3.4.0.CR1

/**
 * DeviceVarMetadata generated by hbm2java
 */
public class DeviceVarMetadata extends DBInstance implements java.io.Serializable {

	private long id;
	private long devId;
	private long vmdId;

	public DeviceVarMetadata() {
	}

	public DeviceVarMetadata(long devId, long vmdId) {
		this.devId = devId;
		this.vmdId = vmdId;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDevId() {
		return this.devId;
	}

	public void setDevId(long devId) {
		this.devId = devId;
	}

	public long getVmdId() {
		return this.vmdId;
	}

	public void setVmdId(long vmdId) {
		this.vmdId = vmdId;
	}

}
