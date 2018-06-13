package com.revature.entity;
// Generated Nov 7, 2017 9:24:46 PM by Hibernate Tools 5.2.5.Final

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@XmlRootElement
@Entity
@Table(name = "TF_PLACEMENT", schema = "ADMIN")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class TfPlacement implements java.io.Serializable {

	private static final long serialVersionUID = 6812378121809201089L;
	
	@XmlElement
	@Id
	@Column(name = "TF_PLACEMENT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	private Integer tfPlacementId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_ASSOCIATE_ID")
	private TfAssociate tfAssociate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_CLIENT_ID")
	private TfClient tfClient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TF_END_CLIENT_ID")
	private TfEndClient tfEndClient;
	
	@XmlElement
	@Column(name = "TF_PLACEMENT_START_DATE")
	private Timestamp tfPlacementStartDate;
	
	@XmlElement
	@Column(name = "TF_PLACEMENT_END_DATE")
	private Timestamp tfPlacementEndDate;

	public TfPlacement() {
	}

	public TfPlacement(Integer tfPlacementId) {
		this.tfPlacementId = tfPlacementId;
	}

	public TfPlacement(Integer tfPlacementId, TfAssociate tfAssociate, TfClient tfClient, TfEndClient tfEndClient,
			Timestamp tfPlacementStartDate, Timestamp tfPlacementEndDate) {
		this.tfPlacementId = tfPlacementId;
		this.tfAssociate = tfAssociate;
		this.tfClient = tfClient;
		this.tfEndClient = tfEndClient;
		this.tfPlacementStartDate = tfPlacementStartDate;
		this.tfPlacementEndDate = tfPlacementEndDate;
	}

	
	public Integer getTfPlacementId() {
		return this.tfPlacementId;
	}

	public void setTfPlacementId(Integer tfPlacementId) {
		this.tfPlacementId = tfPlacementId;
	}

	
	public TfAssociate getTfAssociate() {
		return this.tfAssociate;
	}

	public void setTfAssociate(TfAssociate tfAssociate) {
		this.tfAssociate = tfAssociate;
	}

	
	public TfClient getTfClient() {
		return this.tfClient;
	}

	public void setTfClient(TfClient tfClient) {
		this.tfClient = tfClient;
	}

	
	public TfEndClient getTfEndClient() {
		return this.tfEndClient;
	}

	public void setTfEndClient(TfEndClient tfEndClient) {
		this.tfEndClient = tfEndClient;
	}

	
	public Timestamp getTfPlacementStartDate() {
		return this.tfPlacementStartDate;
	}

	public void setTfPlacementStartDate(Timestamp tfPlacementStartDate) {
		this.tfPlacementStartDate = tfPlacementStartDate;
	}

	public Timestamp getTfPlacementEndDate() {
		return this.tfPlacementEndDate;
	}

	public void setTfPlacementEndDate(Timestamp tfPlacementEndDate) {
		this.tfPlacementEndDate = tfPlacementEndDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tfAssociate == null) ? 0 : tfAssociate.hashCode());
		result = prime * result + ((tfClient == null) ? 0 : tfClient.hashCode());
		result = prime * result + ((tfEndClient == null) ? 0 : tfEndClient.hashCode());
		result = prime * result + ((tfPlacementEndDate == null) ? 0 : tfPlacementEndDate.hashCode());
		result = prime * result + ((tfPlacementId == null) ? 0 : tfPlacementId.hashCode());
		result = prime * result + ((tfPlacementStartDate == null) ? 0 : tfPlacementStartDate.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TfPlacement other = (TfPlacement) obj;
		if (tfAssociate == null) {
			if (other.tfAssociate != null)
				return false;
		} else if (!tfAssociate.equals(other.tfAssociate))
			return false;
		if (tfClient == null) {
			if (other.tfClient != null)
				return false;
		} else if (!tfClient.equals(other.tfClient))
			return false;
		if (tfEndClient == null) {
			if (other.tfEndClient != null)
				return false;
		} else if (!tfEndClient.equals(other.tfEndClient))
			return false;
		if (tfPlacementEndDate == null) {
			if (other.tfPlacementEndDate != null)
				return false;
		} else if (!tfPlacementEndDate.equals(other.tfPlacementEndDate))
			return false;
		if (tfPlacementId == null) {
			if (other.tfPlacementId != null)
				return false;
		} else if (!tfPlacementId.equals(other.tfPlacementId))
			return false;
		if (tfPlacementStartDate == null) {
			if (other.tfPlacementStartDate != null)
				return false;
		} else if (!tfPlacementStartDate.equals(other.tfPlacementStartDate))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TfPlacement [tfPlacementId=" + tfPlacementId + ", tfAssociate=" + tfAssociate + ", tfClient=" + tfClient
				+ ", tfEndClient=" + tfEndClient + ", tfPlacementStartDate=" + tfPlacementStartDate
				+ ", tfPlacementEndDate=" + tfPlacementEndDate + "]";
	}

}
