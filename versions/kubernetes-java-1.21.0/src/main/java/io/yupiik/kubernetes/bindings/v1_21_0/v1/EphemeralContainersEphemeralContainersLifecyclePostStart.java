package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersLifecyclePostStart {
    private EphemeralContainersEphemeralContainersLifecyclePostStartExec exec;
    private EphemeralContainersEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private EphemeralContainersEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public EphemeralContainersEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStart(final EphemeralContainersEphemeralContainersLifecyclePostStartExec exec,
                                                                    final EphemeralContainersEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                    final EphemeralContainersEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final EphemeralContainersEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final EphemeralContainersEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final EphemeralContainersEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersLifecyclePostStart __otherCasted = (EphemeralContainersEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
