package es.tekniker.eefrmwrk.database.sql.model;

// Generated Sep 4, 2012 8:53:53 AM by Hibernate Tools 3.4.0.CR1

/**
 * TaskStage generated by hbm2java
 */
public class TaskStage extends DBInstance implements java.io.Serializable {

	private long id;
	private long stageId;
	private long taskId;

	public TaskStage() {
	}

	public TaskStage(long stageId, long taskId) {
		this.stageId = stageId;
		this.taskId = taskId;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStageId() {
		return this.stageId;
	}

	public void setStageId(long stageId) {
		this.stageId = stageId;
	}

	public long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

}