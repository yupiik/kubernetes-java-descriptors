package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop {
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                           final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                           final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
