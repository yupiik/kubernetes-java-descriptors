package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.Objects;

public class PodSpecInitContainersLifecyclePostStart {
    private PodSpecInitContainersLifecyclePostStartExec exec;
    private PodSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private PodSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public PodSpecInitContainersLifecyclePostStart(final PodSpecInitContainersLifecyclePostStartExec exec,
                                                   final PodSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                   final PodSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final PodSpecInitContainersLifecyclePostStart __otherCasted = (PodSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
