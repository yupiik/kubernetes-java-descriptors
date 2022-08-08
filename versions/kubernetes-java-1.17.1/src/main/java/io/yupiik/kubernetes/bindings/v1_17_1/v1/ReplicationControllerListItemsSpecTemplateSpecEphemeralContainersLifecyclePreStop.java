package io.yupiik.kubernetes.bindings.v1_17_1.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                             final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                             final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
