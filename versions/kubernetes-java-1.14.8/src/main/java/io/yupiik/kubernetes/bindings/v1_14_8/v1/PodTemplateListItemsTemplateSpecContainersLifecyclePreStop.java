package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePreStop {
    private PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec exec;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStop(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec exec,
                                                                      final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                      final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePreStop __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
