package es.tekniker.eefrmwrk.database.sql.model;

// Generated Sep 4, 2012 8:53:53 AM by Hibernate Tools 3.4.0.CR1

/**
 * Geopoint generated by hbm2java
 */
public class Geopoint extends DBInstance implements java.io.Serializable {

	private long geoId;
	private long geoLoc;
	private long geoLong;
	private long geoLat;
	private long activ;

	public Geopoint() {
	}

	public Geopoint(long geoLoc, long geoLong, long geoLat) {
		this.geoLoc = geoLoc;
		this.geoLong = geoLong;
		this.geoLat = geoLat;
	}

	public long getGeoId() {
		return this.geoId;
	}

	public void setGeoId(long geoId) {
		this.geoId = geoId;
	}

	public long getGeoLoc() {
		return this.geoLoc;
	}

	public void setGeoLoc(long geoLoc) {
		this.geoLoc = geoLoc;
	}

	public long getGeoLong() {
		return this.geoLong;
	}

	public void setGeoLong(long geoLong) {
		this.geoLong = geoLong;
	}

	public long getGeoLat() {
		return this.geoLat;
	}

	public void setGeoLat(long geoLat) {
		this.geoLat = geoLat;
	}

	public long getActiv() {
		return this.activ;
	}

	public void setActiv(long activ) {
		this.activ = activ;
	}

	@Override
	public long getId() {
		
		return getGeoId();
	}

}
