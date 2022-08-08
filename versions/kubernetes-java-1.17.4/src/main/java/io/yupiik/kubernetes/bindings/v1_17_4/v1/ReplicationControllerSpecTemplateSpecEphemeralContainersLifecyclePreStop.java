package io.yupiik.kubernetes.bindings.v1_17_4.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                    final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                    final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
