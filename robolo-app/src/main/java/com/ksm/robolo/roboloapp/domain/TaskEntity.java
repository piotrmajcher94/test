package com.ksm.robolo.roboloapp.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.ksm.robolo.roboloapp.enums.TaskStatus;

@Entity
@Table(name = "Tasks")
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String description;

	@NotNull
	private Integer estimatedTaskDuration;

	@NotNull
	@ManyToOne
	private ProjectEntity project;

	@NotNull
	@ManyToMany(targetEntity = WorkerEntity.class)
	private List<WorkerEntity> workers;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@NotNull
	private TaskStatus status;

	@NotNull
	@OneToMany(targetEntity = TaskItemEntity.class)
	private List<TaskItemEntity> taskItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEstimatedTaskDuration() {
		return estimatedTaskDuration;
	}

	public void setEstimatedTaskDuration(Integer estimatedTaskDuration) {
		this.estimatedTaskDuration = estimatedTaskDuration;
	}

	public ProjectEntity getProject() {
		return project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	public List<WorkerEntity> getWorkers() {
		return workers;
	}

	public void setWorkers(List<WorkerEntity> workers) {
		this.workers = workers;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public List<TaskItemEntity> getTaskItems() {
		return taskItems;
	}

	public void setTaskItems(List<TaskItemEntity> taskItems) {
		this.taskItems = taskItems;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TaskEntity)) return false;

		TaskEntity that = (TaskEntity) o;

		if (!getDescription().equals(that.getDescription())) return false;
		if (getEstimatedTaskDuration() != null ? !getEstimatedTaskDuration().equals(that.getEstimatedTaskDuration()) : that.getEstimatedTaskDuration() != null)
			return false;
		if (!getProject().equals(that.getProject())) return false;
		if (!getWorkers().equals(that.getWorkers())) return false;
		if (!getCreationDate().equals(that.getCreationDate())) return false;
		if (!getStartDate().equals(that.getStartDate())) return false;
		if (getStatus() != that.getStatus()) return false;
		return getTaskItems().equals(that.getTaskItems());
	}

	@Override
	public int hashCode() {
		int result = getDescription().hashCode();
		result = 31 * result + (getEstimatedTaskDuration() != null ? getEstimatedTaskDuration().hashCode() : 0);
		result = 31 * result + getProject().hashCode();
		result = 31 * result + getWorkers().hashCode();
		result = 31 * result + getCreationDate().hashCode();
		result = 31 * result + getStartDate().hashCode();
		result = 31 * result + getStatus().hashCode();
		result = 31 * result + getTaskItems().hashCode();
		return result;
	}
}
