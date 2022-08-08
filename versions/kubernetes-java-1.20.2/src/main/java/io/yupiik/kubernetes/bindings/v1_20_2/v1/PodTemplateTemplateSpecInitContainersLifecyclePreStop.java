package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLifecyclePreStop {
    private PodTemplateTemplateSpecInitContainersLifecyclePreStopExec exec;
    private PodTemplateTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStop(final PodTemplateTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                 final PodTemplateTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                 final PodTemplateTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLifecyclePreStop __otherCasted = (PodTemplateTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
