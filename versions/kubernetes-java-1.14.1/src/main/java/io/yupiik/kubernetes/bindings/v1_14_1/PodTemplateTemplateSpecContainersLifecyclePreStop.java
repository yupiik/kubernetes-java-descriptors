package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersLifecyclePreStop {
    private PodTemplateTemplateSpecContainersLifecyclePreStopExec exec;
    private PodTemplateTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStop(final PodTemplateTemplateSpecContainersLifecyclePreStopExec exec,
                                                             final PodTemplateTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                             final PodTemplateTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLifecyclePreStop __otherCasted = (PodTemplateTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
