package io.yupiik.kubernetes.bindings.v1_16_14.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersStartupProbe {
    private StatefulSetListItemsSpecTemplateSpecContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private StatefulSetListItemsSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbe() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbe(final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeExec exec,
                                                                      final Integer failureThreshold,
                                                                      final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGet httpGet,
                                                                      final Integer initialDelaySeconds,
                                                                      final Integer periodSeconds,
                                                                      final Integer successThreshold,
                                                                      final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket,
                                                                      final Integer timeoutSeconds) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGet httpGet) {
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

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersStartupProbe)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersStartupProbe __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersStartupProbe) __other;
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
