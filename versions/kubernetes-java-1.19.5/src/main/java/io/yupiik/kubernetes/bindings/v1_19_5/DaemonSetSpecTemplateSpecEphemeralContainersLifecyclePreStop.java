package io.yupiik.kubernetes.bindings.v1_19_5;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                        final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                        final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
