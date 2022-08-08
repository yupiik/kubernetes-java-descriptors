package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop {
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop(final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                      final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                      final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
