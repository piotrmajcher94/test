package com.ksm.robolo.roboloapp.tos;

import com.ksm.robolo.roboloapp.domain.AddressEntity;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ProjectTO {

    private Long id;

    private String projectName;

    private Date startDate;

    private AddressEntity addressTO;

    private ClientTO clientTO;

    private List<WorkerTO> workerTOS;

    private List<TaskTO> taskTOS;

    private Date approximateEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public AddressEntity getAddressTO() {
        return addressTO;
    }

    public void setAddressTO(AddressEntity addressTO) {
        this.addressTO = addressTO;
    }

    public ClientTO getClientTO() {
        return clientTO;
    }

    public void setClientTO(ClientTO clientTO) {
        this.clientTO = clientTO;
    }

    public List<WorkerTO> getWorkerTOS() {
        return workerTOS;
    }

    public void setWorkerTOS(List<WorkerTO> workerTOS) {
        this.workerTOS = workerTOS;
    }

    public List<TaskTO> getTaskTOS() {
        return taskTOS;
    }

    public void setTaskTOS(List<TaskTO> taskTOS) {
        this.taskTOS = taskTOS;
    }

    public Date getApproximateEndDate() {
        return approximateEndDate;
    }

    public void setApproximateEndDate(Date approximateEndDate) {
        this.approximateEndDate = approximateEndDate;
    }
}
