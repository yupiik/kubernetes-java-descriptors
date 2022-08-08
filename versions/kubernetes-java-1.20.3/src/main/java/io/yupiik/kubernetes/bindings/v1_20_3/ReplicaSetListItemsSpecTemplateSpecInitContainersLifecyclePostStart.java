package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                               final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                               final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
