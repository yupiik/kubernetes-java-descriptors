package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                                          final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                                          final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
