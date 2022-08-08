package io.yupiik.kubernetes.bindings.v1_14_10.v1;

import java.util.List;
import java.util.Objects;

public class PodStatus {
    private List<PodStatusConditions> conditions;
    private List<PodStatusContainerStatuses> containerStatuses;
    private String hostIP;
    private List<PodStatusInitContainerStatuses> initContainerStatuses;
    private String message;
    private String nominatedNodeName;
    private String phase;
    private String podIP;
    private String qosClass;
    private String reason;
    private String startTime;

    public PodStatus() {
        // no-op
    }

    public PodStatus(final List<PodStatusConditions> conditions,
                     final List<PodStatusContainerStatuses> containerStatuses,
                     final String hostIP,
                     final List<PodStatusInitContainerStatuses> initContainerStatuses,
                     final String message,
                     final String nominatedNodeName,
                     final String phase,
                     final String podIP,
                     final String qosClass,
                     final String reason,
                     final String startTime) {
        // no-op
    }

    public List<PodStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PodStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public List<PodStatusContainerStatuses> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(final List<PodStatusContainerStatuses> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public List<PodStatusInitContainerStatuses> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    public void setInitContainerStatuses(final List<PodStatusInitContainerStatuses> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getNominatedNodeName() {
        return nominatedNodeName;
    }

    public void setNominatedNodeName(final String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public String getPodIP() {
        return podIP;
    }

    public void setPodIP(final String podIP) {
        this.podIP = podIP;
    }

    public String getQosClass() {
        return qosClass;
    }

    public void setQosClass(final String qosClass) {
        this.qosClass = qosClass;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(final String startTime) {
        this.startTime = startTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                containerStatuses,
                hostIP,
                initContainerStatuses,
                message,
                nominatedNodeName,
                phase,
                podIP,
                qosClass,
                reason,
                startTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodStatus)) {
            return false;
        }
        final PodStatus __otherCasted = (PodStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(containerStatuses, __otherCasted.containerStatuses) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(initContainerStatuses, __otherCasted.initContainerStatuses) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(nominatedNodeName, __otherCasted.nominatedNodeName) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(podIP, __otherCasted.podIP) &&
            Objects.equals(qosClass, __otherCasted.qosClass) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(startTime, __otherCasted.startTime);
    }
}
