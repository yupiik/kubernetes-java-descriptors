package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop {
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                               final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                               final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
