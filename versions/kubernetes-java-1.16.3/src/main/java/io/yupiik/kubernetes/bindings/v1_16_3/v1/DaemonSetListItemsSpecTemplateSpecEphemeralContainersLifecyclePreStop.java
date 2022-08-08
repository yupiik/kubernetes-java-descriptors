package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
