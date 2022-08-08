package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class PodSpecInitContainersLifecyclePreStop {
    private PodSpecInitContainersLifecyclePreStopExec exec;
    private PodSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private PodSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public PodSpecInitContainersLifecyclePreStop(final PodSpecInitContainersLifecyclePreStopExec exec,
                                                 final PodSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                 final PodSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final PodSpecInitContainersLifecyclePreStop __otherCasted = (PodSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
