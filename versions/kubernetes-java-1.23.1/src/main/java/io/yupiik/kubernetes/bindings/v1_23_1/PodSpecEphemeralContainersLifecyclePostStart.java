package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodSpecEphemeralContainersLifecyclePostStart {
    private PodSpecEphemeralContainersLifecyclePostStartExec exec;
    private PodSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private PodSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePostStart(final PodSpecEphemeralContainersLifecyclePostStartExec exec,
                                                        final PodSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                        final PodSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final PodSpecEphemeralContainersLifecyclePostStart __otherCasted = (PodSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
