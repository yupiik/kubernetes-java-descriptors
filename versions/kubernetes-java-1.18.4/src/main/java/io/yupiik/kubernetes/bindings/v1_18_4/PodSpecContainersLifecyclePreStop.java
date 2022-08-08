package io.yupiik.kubernetes.bindings.v1_18_4;

import java.util.Objects;

public class PodSpecContainersLifecyclePreStop {
    private PodSpecContainersLifecyclePreStopExec exec;
    private PodSpecContainersLifecyclePreStopHttpGet httpGet;
    private PodSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodSpecContainersLifecyclePreStop() {
        // no-op
    }

    public PodSpecContainersLifecyclePreStop(final PodSpecContainersLifecyclePreStopExec exec,
                                             final PodSpecContainersLifecyclePreStopHttpGet httpGet,
                                             final PodSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecContainersLifecyclePreStop)) {
            return false;
        }
        final PodSpecContainersLifecyclePreStop __otherCasted = (PodSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
