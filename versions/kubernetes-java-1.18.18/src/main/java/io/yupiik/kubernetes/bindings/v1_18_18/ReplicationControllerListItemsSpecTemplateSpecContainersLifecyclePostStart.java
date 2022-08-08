package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                                      final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                                      final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
