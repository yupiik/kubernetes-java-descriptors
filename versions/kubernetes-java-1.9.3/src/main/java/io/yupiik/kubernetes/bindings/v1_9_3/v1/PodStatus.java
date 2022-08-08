package io.yupiik.kubernetes.bindings.v1_9_3.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodStatus {
    private List<JsonValue> conditions;
    private List<JsonValue> containerStatuses;
    private String hostIP;
    private List<JsonValue> initContainerStatuses;
    private String message;
    private String phase;
    private String podIP;
    private String qosClass;
    private String reason;
    private String startTime;

    public PodStatus() {
        // no-op
    }

    public PodStatus(final List<JsonValue> conditions,
                     final List<JsonValue> containerStatuses,
                     final String hostIP,
                     final List<JsonValue> initContainerStatuses,
                     final String message,
                     final String phase,
                     final String podIP,
                     final String qosClass,
                     final String reason,
                     final String startTime) {
        // no-op
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
        this.conditions = conditions;
    }

    public List<JsonValue> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(final List<JsonValue> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public List<JsonValue> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    public void setInitContainerStatuses(final List<JsonValue> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
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
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(podIP, __otherCasted.podIP) &&
            Objects.equals(qosClass, __otherCasted.qosClass) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(startTime, __otherCasted.startTime);
    }
}
