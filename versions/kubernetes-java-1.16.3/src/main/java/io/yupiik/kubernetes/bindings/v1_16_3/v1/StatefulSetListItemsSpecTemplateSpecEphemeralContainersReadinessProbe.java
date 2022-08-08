package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec exec,
                                                                                 final Integer failureThreshold,
                                                                                 final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet,
                                                                                 final Integer initialDelaySeconds,
                                                                                 final Integer periodSeconds,
                                                                                 final Integer successThreshold,
                                                                                 final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket,
                                                                                 final Integer timeoutSeconds) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(final Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(final Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(final Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                failureThreshold,
                httpGet,
                initialDelaySeconds,
                periodSeconds,
                successThreshold,
                tcpSocket,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
