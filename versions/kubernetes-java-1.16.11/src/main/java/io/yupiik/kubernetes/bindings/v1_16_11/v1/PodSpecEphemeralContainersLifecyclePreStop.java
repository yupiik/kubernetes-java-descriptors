package io.yupiik.kubernetes.bindings.v1_16_11.v1;

import java.util.Objects;

public class PodSpecEphemeralContainersLifecyclePreStop {
    private PodSpecEphemeralContainersLifecyclePreStopExec exec;
    private PodSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private PodSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePreStop(final PodSpecEphemeralContainersLifecyclePreStopExec exec,
                                                      final PodSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                      final PodSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final PodSpecEphemeralContainersLifecyclePreStop __otherCasted = (PodSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
