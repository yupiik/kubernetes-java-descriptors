package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe {
    private PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeGrpc grpc;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe(final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec exec,
                                                                            final Integer failureThreshold,
                                                                            final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeGrpc grpc,
                                                                            final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                                            final Integer initialDelaySeconds,
                                                                            final Integer periodSeconds,
                                                                            final Integer successThreshold,
                                                                            final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                                            final Integer terminationGracePeriodSeconds,
                                                                            final Integer timeoutSeconds) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(final Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
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
                grpc,
                httpGet,
                initialDelaySeconds,
                periodSeconds,
                successThreshold,
                tcpSocket,
                terminationGracePeriodSeconds,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(grpc, __otherCasted.grpc) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
