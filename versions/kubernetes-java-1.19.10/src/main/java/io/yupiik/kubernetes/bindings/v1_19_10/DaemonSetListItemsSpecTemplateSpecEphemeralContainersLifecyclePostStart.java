package io.yupiik.kubernetes.bindings.v1_19_10;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                   final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                   final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
