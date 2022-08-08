package io.yupiik.kubernetes.bindings.v1_17_17.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
