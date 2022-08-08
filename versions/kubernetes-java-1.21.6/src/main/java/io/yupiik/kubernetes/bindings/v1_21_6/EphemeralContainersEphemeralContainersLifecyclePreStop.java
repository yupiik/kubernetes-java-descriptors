package io.yupiik.kubernetes.bindings.v1_21_6;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersLifecyclePreStop {
    private EphemeralContainersEphemeralContainersLifecyclePreStopExec exec;
    private EphemeralContainersEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private EphemeralContainersEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public EphemeralContainersEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStop(final EphemeralContainersEphemeralContainersLifecyclePreStopExec exec,
                                                                  final EphemeralContainersEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                  final EphemeralContainersEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final EphemeralContainersEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final EphemeralContainersEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final EphemeralContainersEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersLifecyclePreStop __otherCasted = (EphemeralContainersEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
