package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                          final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                          final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
