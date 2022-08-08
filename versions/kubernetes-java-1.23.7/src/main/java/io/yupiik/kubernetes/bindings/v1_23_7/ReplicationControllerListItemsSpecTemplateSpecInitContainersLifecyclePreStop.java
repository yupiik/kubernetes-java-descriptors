package io.yupiik.kubernetes.bindings.v1_23_7;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
