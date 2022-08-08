package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class PodSpecContainersLifecyclePostStart {
    private PodSpecContainersLifecyclePostStartExec exec;
    private PodSpecContainersLifecyclePostStartHttpGet httpGet;
    private PodSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodSpecContainersLifecyclePostStart() {
        // no-op
    }

    public PodSpecContainersLifecyclePostStart(final PodSpecContainersLifecyclePostStartExec exec,
                                               final PodSpecContainersLifecyclePostStartHttpGet httpGet,
                                               final PodSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecContainersLifecyclePostStart)) {
            return false;
        }
        final PodSpecContainersLifecyclePostStart __otherCasted = (PodSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
