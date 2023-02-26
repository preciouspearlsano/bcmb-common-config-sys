package ph.org.bcmb.common.config.sys.dto;


/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 */
public class Outbox {
	private String id;
	private String eventType;
	private String commandId;
	private String commandPath;
	private String data;
	private String replyId;
	private String replyPath;
	private String requestId;
	private String creationDate;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the commandId
	 */
	public String getCommandId() {
		return commandId;
	}
	/**
	 * @param commandId the commandId to set
	 */
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}
	/**
	 * @return the commandPath
	 */
	public String getCommandPath() {
		return commandPath;
	}
	/**
	 * @param commandPath the commandPath to set
	 */
	public void setCommandPath(String commandPath) {
		this.commandPath = commandPath;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the replyId
	 */
	public String getReplyId() {
		return replyId;
	}
	/**
	 * @param replyId the replyId to set
	 */
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	/**
	 * @return the replyPath
	 */
	public String getReplyPath() {
		return replyPath;
	}
	/**
	 * @param replyPath the replyPath to set
	 */
	public void setReplyPath(String replyPath) {
		this.replyPath = replyPath;
	}
	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
}
