package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import io.yupiik.kubernetes.bindings.v1_19_4.Validable;
import io.yupiik.kubernetes.bindings.v1_19_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodStatus implements Validable<PodStatus> {
    private List<PodCondition> conditions;
    private List<ContainerStatus> containerStatuses;
    private List<ContainerStatus> ephemeralContainerStatuses;
    private String hostIP;
    private List<ContainerStatus> initContainerStatuses;
    private String message;
    private String nominatedNodeName;
    private String phase;
    private String podIP;
    private List<PodIP> podIPs;
    private String qosClass;
    private String reason;
    private String startTime;

    public PodStatus() {
        // no-op
    }

    public PodStatus(final List<PodCondition> conditions,
                     final List<ContainerStatus> containerStatuses,
                     final List<ContainerStatus> ephemeralContainerStatuses,
                     final String hostIP,
                     final List<ContainerStatus> initContainerStatuses,
                     final String message,
                     final String nominatedNodeName,
                     final String phase,
                     final String podIP,
                     final List<PodIP> podIPs,
                     final String qosClass,
                     final String reason,
                     final String startTime) {
        // no-op
    }

    public List<PodCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PodCondition> conditions) {
        this.conditions = conditions;
    }

    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(final List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    public List<ContainerStatus> getEphemeralContainerStatuses() {
        return ephemeralContainerStatuses;
    }

    public void setEphemeralContainerStatuses(final List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public List<ContainerStatus> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    public void setInitContainerStatuses(final List<ContainerStatus> initContainerStatuses) {
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

    public List<PodIP> getPodIPs() {
        return podIPs;
    }

    public void setPodIPs(final List<PodIP> podIPs) {
        this.podIPs = podIPs;
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
                ephemeralContainerStatuses,
                hostIP,
                initContainerStatuses,
                message,
                nominatedNodeName,
                phase,
                podIP,
                podIPs,
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
            Objects.equals(ephemeralContainerStatuses, __otherCasted.ephemeralContainerStatuses) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(initContainerStatuses, __otherCasted.initContainerStatuses) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(nominatedNodeName, __otherCasted.nominatedNodeName) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(podIP, __otherCasted.podIP) &&
            Objects.equals(podIPs, __otherCasted.podIPs) &&
            Objects.equals(qosClass, __otherCasted.qosClass) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(startTime, __otherCasted.startTime);
    }

    public PodStatus conditions(final List<PodCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PodStatus containerStatuses(final List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }

    public PodStatus ephemeralContainerStatuses(final List<ContainerStatus> ephemeralContainerStatuses) {
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        return this;
    }

    public PodStatus hostIP(final String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public PodStatus initContainerStatuses(final List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
        return this;
    }

    public PodStatus message(final String message) {
        this.message = message;
        return this;
    }

    public PodStatus nominatedNodeName(final String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
        return this;
    }

    public PodStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public PodStatus podIP(final String podIP) {
        this.podIP = podIP;
        return this;
    }

    public PodStatus podIPs(final List<PodIP> podIPs) {
        this.podIPs = podIPs;
        return this;
    }

    public PodStatus qosClass(final String qosClass) {
        this.qosClass = qosClass;
        return this;
    }

    public PodStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public PodStatus startTime(final String startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public PodStatus validate() {
        return this;
    }
}
