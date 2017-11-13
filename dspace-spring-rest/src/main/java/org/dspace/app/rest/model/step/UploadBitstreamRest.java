package org.dspace.app.rest.model.step;

import java.io.Serializable;
import java.util.List;

import org.dspace.app.rest.model.CheckSumRest;
import org.dspace.app.rest.model.MetadataEntryRest;

public class UploadBitstreamRest implements Serializable {

	private List<MetadataEntryRest> metadata;
	private Long sizeBytes;
	private CheckSumRest checkSum;
	private String url;
	
	public List<MetadataEntryRest> getMetadata() {
		return metadata;
	}

	public void setMetadata(List<MetadataEntryRest> metadata) {
		this.metadata = metadata;
	}

	public Long getSizeBytes() {
		return sizeBytes;
	}

	public void setSizeBytes(Long sizeBytes) {
		this.sizeBytes = sizeBytes;
	}

	public CheckSumRest getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(CheckSumRest checkSum) {
		this.checkSum = checkSum;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}