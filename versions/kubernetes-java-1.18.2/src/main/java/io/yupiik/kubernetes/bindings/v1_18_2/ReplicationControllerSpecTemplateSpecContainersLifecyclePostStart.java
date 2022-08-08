package io.yupiik.kubernetes.bindings.v1_18_2;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart {
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                             final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                             final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
