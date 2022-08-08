package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart {
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                                 final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                                 final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
