package io.yupiik.kubernetes.bindings.v1_18_13.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersStartupProbe {
    private StatefulSetSpecTemplateSpecInitContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private StatefulSetSpecTemplateSpecInitContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public StatefulSetSpecTemplateSpecInitContainersStartupProbe() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbe(final StatefulSetSpecTemplateSpecInitContainersStartupProbeExec exec,
                                                                 final Integer failureThreshold,
                                                                 final StatefulSetSpecTemplateSpecInitContainersStartupProbeHttpGet httpGet,
                                                                 final Integer initialDelaySeconds,
                                                                 final Integer periodSeconds,
                                                                 final Integer successThreshold,
                                                                 final StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket tcpSocket,
                                                                 final Integer timeoutSeconds) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecInitContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecInitContainersStartupProbeHttpGet httpGet) {
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

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersStartupProbe)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersStartupProbe __otherCasted = (StatefulSetSpecTemplateSpecInitContainersStartupProbe) __other;
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
