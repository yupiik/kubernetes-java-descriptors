package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                              final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                              final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
