package io.yupiik.kubernetes.bindings.v1_21_7.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop {
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                               final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                               final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
